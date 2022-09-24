package factories;

import config.FrameworkConfig;
import org.aeonbits.owner.ConfigCache;

public final class ConfigFactory {

    private ConfigFactory(){}

    public static FrameworkConfig getFrameworkConfig(){
        return ConfigCache.getOrCreate(FrameworkConfig.class);
    }

}
