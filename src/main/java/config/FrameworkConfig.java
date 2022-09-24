package config;

import enums.BrowserType;
import enums.RemoteRunMode;
import enums.RunMode;
import org.aeonbits.owner.Config;

@Config.Sources(value = "file:${user.dir}/src/test/resources/config.properties")
public interface FrameworkConfig extends Config {

    @DefaultValue("CHROME")
    BrowserType browser();

    String URL();

    @DefaultValue("LOCAL")
    RunMode runMode();

    @DefaultValue("SELENIUMGRID")
    RemoteRunMode remoteRunMode();
}
