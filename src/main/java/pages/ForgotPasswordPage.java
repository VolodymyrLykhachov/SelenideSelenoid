package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ForgotPasswordPage {

    private static final String FORGOT_PASSWORD_FORM = "//form[@id='account-recovery']/ancestor::div[@class='grid--cell']";
    private static final String EMAIL_INPUT_FIELD = "//input[@name='email']";
    private static final String SEND_RECOVERY_EMAIL_BUTTON = "//button[@id='submit-button']";
    private static final String INVALID_EMAIL_LABEL = "//div[@class='grid ps-relative']/following-sibling::p";

    public SelenideElement getForgotPasswordForm() {
        return $x(FORGOT_PASSWORD_FORM);
    }

    public ForgotPasswordPage setEmail(String email) {
        $x(EMAIL_INPUT_FIELD).setValue(email);
        return this;
    }

    public ForgotPasswordPage clickOnSendRecoveryEmailButton(){
        $x(SEND_RECOVERY_EMAIL_BUTTON).click();
        return this;
    }

    public SelenideElement getInvalidEmailLabel(){
        return $x(INVALID_EMAIL_LABEL);
    }


}
