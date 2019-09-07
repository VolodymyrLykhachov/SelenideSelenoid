package stories;

import com.codeborne.selenide.SelenideDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Guice;
import utils.WebdriverManager;

import java.lang.reflect.Method;

@Guice
public class AbstractTest {
    protected static final ThreadLocal<SelenideDriver> driver = new ThreadLocal<SelenideDriver>();

    @BeforeMethod
    public void tearUp(Method method) {
        driver.set(WebdriverManager.getWebDriver(method.getName()));
    }

    @AfterMethod
    public void tearDown(Method method) {
        driver.get().getWebDriver().quit();
    }
}
