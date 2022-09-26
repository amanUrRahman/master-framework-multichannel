package driver;

import enums.RunMode;
import factories.ConfigFactory;
import factories.driverFactories.webFactories.localFactories.LocalDriverFactory;
import factories.driverFactories.webFactories.remoteFactories.RemoteDriverFactory;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

public class Driver {

    private static WebDriver driver = null;


    public static void initDriver(){
        if (ConfigFactory.getFrameworkConfig().runMode() == RunMode.LOCAL){
            driver = LocalDriverFactory.getDriver(ConfigFactory.getFrameworkConfig().browser());
        } else if (ConfigFactory.getFrameworkConfig().runMode() == RunMode.REMOTE) {
            driver = RemoteDriverFactory.getDriver(ConfigFactory.getFrameworkConfig().remoteRunMode(), ConfigFactory.getFrameworkConfig().browser());
        }

        driver.get(ConfigFactory.getFrameworkConfig().URL());
    }


    public static void quitDriver(){
        if (Objects.nonNull(driver)){
            driver.quit();
        }

    }


}
