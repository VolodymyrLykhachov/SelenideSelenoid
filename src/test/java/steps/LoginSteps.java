package steps;

import com.codeborne.selenide.CollectionCondition;
import com.google.inject.Inject;
import pages.LoginPage;


public class LoginSteps {
    @Inject
    private LoginPage loginPage;

    public void assertLoginFormLabelSizeIsEqualTo(int labelsSize) {
        loginPage.getLoginLabels().shouldHaveSize(labelsSize);
    }

    public void assertLoginFormLabelsAreEqualTo(String email, String password) {
        loginPage.getLoginLabels().shouldHave(CollectionCondition.exactTexts(email, password));
    }

    public void clickOnForgotPasswordLink() {
        loginPage.clickOnForgotPasswordLink();
    }
}
