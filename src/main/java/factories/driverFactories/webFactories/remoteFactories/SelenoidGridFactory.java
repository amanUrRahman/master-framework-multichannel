package factories.driverFactories.webFactories.remoteFactories;

import enums.BrowserType;
import factories.ConfigFactory;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public final class SelenoidGridFactory {

    private static WebDriver driver = null;

    private SelenoidGridFactory(){}

    @SneakyThrows
    public static WebDriver getDriver(BrowserType browserType) {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("browserName",browserType.name());
        desiredCapabilities.setCapability("browserVersion","100.0");
        desiredCapabilities.setCapability("enableVNC","true");
        desiredCapabilities.setCapability("enableVideo","false");
        driver = new RemoteWebDriver(new URL(ConfigFactory.getFrameworkConfig().selenoidURL()), desiredCapabilities);
        return driver;
    }
}
