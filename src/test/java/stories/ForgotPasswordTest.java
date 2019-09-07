package stories;

import com.google.inject.Inject;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;
import steps.ForgotPasswordSteps;
import steps.HomeSteps;
import steps.LoginSteps;

import static com.codeborne.selenide.Selenide.open;

@Guice
public class ForgotPasswordTest {
    @Inject
    private HomeSteps homesteps;
    @Inject
    private LoginSteps loginSteps;
    @Inject
    private ForgotPasswordSteps forgotPasswordSteps;

    @Test
    public void forgotPasswordViewTest() {
        open("https://stackoverflow.com");
        homesteps.clickOnLoginButton();
        loginSteps.clickOnForgotPasswordLink();
        forgotPasswordSteps.assertForgotPasswordFormIsVisible();

    }

    @Test
    public void ForgotPasswordNegativeCase() {
        open("https://stackoverflow.com/users/account-recovery");
        String email = "test email";
        forgotPasswordSteps.setEmail(email);
        forgotPasswordSteps.clickOnSendRecoveryEmailButton();
        forgotPasswordSteps.assertEmailWarningMessageIsEqualTo("Invalid email address");
    }
}
