package steps;

import com.google.inject.Inject;
import pages.HomePage;

public class HomeSteps {
    @Inject
    private HomePage homePage;

    public void clickOnLoginButton() {
        homePage.clickOnLoginButton();
    }
}
