package factories;

import enums.BrowserType;
import enums.RemoteRunMode;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class RemoteDriverFactory {

    private static WebDriver driver = null;

    private RemoteDriverFactory(){}

    public static WebDriver getDriver(){
        RemoteRunMode remoteRunMode = ConfigFactory.getFrameworkConfig().remoteRunMode();
        if (remoteRunMode == RemoteRunMode.SELENIUMGRID){
            
        } else if (remoteRunMode == RemoteRunMode.SELENOID) {
            
        } else if (remoteRunMode == RemoteRunMode.BROWSERSTACK) {
            
        }
        return driver;
    }
}
