package stories;

import com.google.inject.Inject;

import org.testng.annotations.Guice;
import org.testng.annotations.Test;
import steps.HomeSteps;
import steps.LoginSteps;

import static com.codeborne.selenide.Selenide.open;

@Guice
public class LoginTest {

    @Inject
    private HomeSteps homesteps;
    @Inject
    private LoginSteps loginSteps;

    @Test
    public void loginViewTest() {
        open("https://stackoverflow.com");
        homesteps.clickOnLoginButton();
        loginSteps.assertLoginFormLabelSizeIsEqualTo(2);
        loginSteps.assertLoginFormLabelsAreEqualTo("Email","Password");
    }


}
