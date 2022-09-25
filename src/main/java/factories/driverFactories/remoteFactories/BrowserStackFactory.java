package factories.driverFactories.remoteFactories;

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
        desiredCapabilities.setCapability("os", "Windows");
        desiredCapabilities.setCapability("os_version", "10");
        desiredCapabilities.setCapability("browser", browserType.name());
        desiredCapabilities.setCapability("browser_version", "100.0");
        driver = new RemoteWebDriver(new URL(ConfigFactory.getFrameworkConfig().browserstackURL()), desiredCapabilities);
        return driver;
    }
}
