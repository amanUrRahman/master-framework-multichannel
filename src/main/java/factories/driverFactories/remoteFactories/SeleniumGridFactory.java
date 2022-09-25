package factories.driverFactories.remoteFactories;

import enums.BrowserType;
import enums.RemoteRunMode;
import factories.ConfigFactory;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public final class SeleniumGridFactory {

    private static WebDriver driver = null;

    private SeleniumGridFactory(){}

    @SneakyThrows
    public static WebDriver getDriver(BrowserType browserType) {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setBrowserName(browserType.name());
        driver = new RemoteWebDriver(new URL(ConfigFactory.getFrameworkConfig().seleniumGridURL()), desiredCapabilities);
        return driver;
    }
}
