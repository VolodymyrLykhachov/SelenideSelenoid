package pages;

import static com.codeborne.selenide.Selenide.$x;

public class HomePage {
    private static final String LOGIN_BUTON = "//a[.='Log in']";

    public LoginPage clickOnLoginButton() {
        $x(LOGIN_BUTON).click();
        return new LoginPage();
    }
}
