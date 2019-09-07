package steps;

import com.codeborne.selenide.Condition;
import com.google.inject.Inject;
import pages.ForgotPasswordPage;

public class ForgotPasswordSteps {
    @Inject
    ForgotPasswordPage forgotPasswordPage;

    public void assertForgotPasswordFormIsVisible() {
        forgotPasswordPage.getForgotPasswordForm().shouldBe(Condition.visible);
    }
    public void setEmail(String email) {
        forgotPasswordPage.setEmail(email);
    }

    public void clickOnSendRecoveryEmailButton() {
        forgotPasswordPage.clickOnSendRecoveryEmailButton();
    }

    public void assertEmailWarningMessageIsEqualTo(String message) {
        forgotPasswordPage.getInvalidEmailLabel().shouldHave(Condition.text(message));
    }

}
