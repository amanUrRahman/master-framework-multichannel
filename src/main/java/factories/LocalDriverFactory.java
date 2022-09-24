package factories;

import enums.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class LocalDriverFactory {

    private static WebDriver driver = null;

    private LocalDriverFactory(){}

    public static WebDriver getDriver(){
        if (ConfigFactory.getFrameworkConfig().browser() == BrowserType.CHROME){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (ConfigFactory.getFrameworkConfig().browser() == BrowserType.FIREFOX) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        return driver;
    }

}
