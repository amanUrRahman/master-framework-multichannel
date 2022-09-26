package factories;

import config.BrowserStackConfig;
import config.FrameworkConfig;
import org.aeonbits.owner.ConfigCache;

public final class ConfigFactory {

    private ConfigFactory(){}

    public static FrameworkConfig getFrameworkConfig(){
        return ConfigCache.getOrCreate(FrameworkConfig.class);
    }

    public static BrowserStackConfig getBrowserStackConfig(){
        return ConfigCache.getOrCreate(BrowserStackConfig.class);
    }

    public static SauceLabsConfig getSauceLabsConfig(){
        return ConfigCache.getOrCreate(SauceLabsConfig.class);
    }

}
