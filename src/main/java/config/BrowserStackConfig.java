package config;

import org.aeonbits.owner.Config;

@Config.Sources(value = "file:${user.dir}/src/test/resources/browserstack.properties")
public interface BrowserStackConfig extends Config {

    String os();

    String osVersion();

    String browser();

    String browserVersion();


    //browserstack setup
    String browserstackUsername();
    String browserstackKey();
    @DefaultValue("https://${browserstackUsername}:${browserstackKey}@hub-cloud.browserstack.com/wd/hub")
    String browserstackURL();
}

