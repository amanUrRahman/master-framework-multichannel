package factories.driverFactories.mobileFactories.remoteFactories;

import enums.BrowserType;
import enums.MobileOS;
import factories.ConfigFactory;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public final class BrowserStackMobileFactory {

    private static WebDriver driver = null;
    private static DesiredCapabilities desiredCapabilities;

    private BrowserStackMobileFactory(){}

    @SneakyThrows
    public static WebDriver getDriver(MobileOS mobileOS, BrowserType browserType) {
        if (mobileOS == MobileOS.ANDROID) {
            desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability("device", "Samsung Galaxy S8 Plus");
            desiredCapabilities.setCapability("os_version", "7.0");
            desiredCapabilities.setCapability("app", "");
        } else if (mobileOS == MobileOS.IOS){
            desiredCapabilities.setCapability("device", "iPhone 7 Plus");
            desiredCapabilities.setCapability("os_version", "11");
            desiredCapabilities.setCapability("app", "");
        }
        desiredCapabilities.setCapability("project", "My First Project");
        desiredCapabilities.setCapability("build", "My First Build");
        driver = new RemoteWebDriver(new URL(ConfigFactory.getBrowserStackConfig().browserstackURL()), desiredCapabilities);
        return driver;
    }
}
