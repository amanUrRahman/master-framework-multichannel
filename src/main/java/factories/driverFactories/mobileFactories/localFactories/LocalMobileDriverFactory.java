package factories.driverFactories.mobileFactories.localFactories;

import enums.BrowserType;
import enums.MobileOS;
import factories.ConfigFactory;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.SneakyThrows;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public final class LocalMobileDriverFactory {

    private static WebDriver driver = null;
    private static DesiredCapabilities desiredCapabilities;

    private LocalMobileDriverFactory(){}

    @SneakyThrows
    public static WebDriver getDriver(MobileOS mobileOS){
        if (mobileOS == MobileOS.ANDROID){
            desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
            desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
            desiredCapabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+"/android-app.apk");

        } else if (mobileOS == MobileOS.IOS) {
            desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.IOS);
            desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
            desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPod touch (7th generation)");
            desiredCapabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+"/ios-app.zip");

        }
        driver = new RemoteWebDriver(new URL(ConfigFactory.getFrameworkConfig().localAppiumURL()), desiredCapabilities);
        return driver;
    }

}
