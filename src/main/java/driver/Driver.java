package driver;

import enums.RunMode;
import factories.ConfigFactory;
import factories.LocalDriverFactory;
import factories.RemoteDriverFactory;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

public class Driver {

    private static WebDriver driver = null;


    public static void initDriver(){
        if (ConfigFactory.getFrameworkConfig().runMode() == RunMode.LOCAL){
            driver = LocalDriverFactory.getDriver();
        } else if (ConfigFactory.getFrameworkConfig().runMode() == RunMode.REMOTE) {
            driver = RemoteDriverFactory.getDriver();
        }

        driver.get(ConfigFactory.getFrameworkConfig().URL());
    }


    public static void quitDriver(){
        if (Objects.nonNull(driver)){
            driver.quit();
        }

    }


}
