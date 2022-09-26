package factories.driverFactories.webFactories.remoteFactories;

import enums.BrowserType;
import factories.ConfigFactory;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public final class BrowserStackFactory {

    private static WebDriver driver = null;

    private BrowserStackFactory(){}

    @SneakyThrows
    public static WebDriver getDriver(BrowserType browserType) {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("os", ConfigFactory.getBrowserStackConfig().os());
        desiredCapabilities.setCapability("os_version", ConfigFactory.getBrowserStackConfig().osVersion());
        desiredCapabilities.setCapability("browser", ConfigFactory.getBrowserStackConfig().browser());
        desiredCapabilities.setCapability("browser_version", ConfigFactory.getBrowserStackConfig().browserVersion());
        driver = new RemoteWebDriver(new URL(ConfigFactory.getBrowserStackConfig().browserstackURL()), desiredCapabilities);
        return driver;
    }
}
