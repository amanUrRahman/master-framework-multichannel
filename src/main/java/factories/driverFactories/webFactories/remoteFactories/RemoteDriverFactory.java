package factories.driverFactories.webFactories.remoteFactories;

import enums.BrowserType;
import enums.RemoteRunMode;
import org.openqa.selenium.WebDriver;

public final class RemoteDriverFactory {

    private static WebDriver driver = null;

    private RemoteDriverFactory(){}

    public static WebDriver getDriver(RemoteRunMode remoteRunMode, BrowserType browserType){
        if (remoteRunMode == RemoteRunMode.SELENIUMGRID){
            driver = SeleniumGridFactory.getDriver(browserType);
        } else if (remoteRunMode == RemoteRunMode.SELENOID) {
            driver = SelenoidGridFactory.getDriver(browserType);
        } else if (remoteRunMode == RemoteRunMode.BROWSERSTACK) {
            driver = BrowserStackFactory.getDriver(browserType);
        }
        return driver;
    }
}
