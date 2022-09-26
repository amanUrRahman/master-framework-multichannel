package factories.driverFactories.mobileFactories.remoteFactories;

import enums.BrowserType;
import enums.MobileOS;
import enums.RemoteMobileRunMode;
import enums.RemoteRunMode;
import factories.driverFactories.webFactories.remoteFactories.BrowserStackFactory;
import factories.driverFactories.webFactories.remoteFactories.SeleniumGridFactory;
import factories.driverFactories.webFactories.remoteFactories.SelenoidGridFactory;
import org.openqa.selenium.WebDriver;

public final class RemoteMobileDriverFactory {

    private static WebDriver driver = null;

    private RemoteMobileDriverFactory(){}

    public static WebDriver getDriver(RemoteMobileRunMode remoteMobileRunMode, MobileOS mobileOS, BrowserType browserType){
        if (remoteMobileRunMode == RemoteMobileRunMode.BROWSERSTACK) {
            driver = BrowserStackMobileFactory.getDriver(mobileOS, browserType);
        }
        return driver;
    }
}
