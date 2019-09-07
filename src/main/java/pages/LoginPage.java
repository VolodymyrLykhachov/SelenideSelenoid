package pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {
    private static final String LOGIN_FORM_LABEL = "//label";
    private static final String FORGOT_PASSWORD_LINK = "//a[.='Forgot password?']";

    public ElementsCollection getLoginLabels() {
        return $$x(LOGIN_FORM_LABEL);
    }

    public ForgotPasswordPage clickOnForgotPasswordLink() {
        $x(FORGOT_PASSWORD_LINK).click();
        return new ForgotPasswordPage();
    }
}
