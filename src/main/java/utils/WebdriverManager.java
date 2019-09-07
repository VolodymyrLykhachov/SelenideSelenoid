package utils;

import com.codeborne.selenide.SelenideDriver;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class WebdriverManager {

        public static SelenideDriver getWebDriver(String name){
            WebDriver driver = null;
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setBrowserName("chrome");
            capabilities.setVersion("");
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
            capabilities.setCapability("enableLog", true);
            capabilities.setCapability("videoName", name + ".mp4");
            capabilities.setCapability("logName", name + ".log");

            try {
                driver = new RemoteWebDriver(
                        new URL("http://localhost:4444/wd/hub"), capabilities);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }

            driver.manage().window().maximize();
            WebDriverRunner.setWebDriver(driver);
            return WebDriverRunner.getSelenideDriver();
        }
}