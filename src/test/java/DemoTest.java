import factories.ConfigFactory;
import org.testng.annotations.Test;

public class DemoTest extends BaseTest{


    @Test
    public void demotest(){
        System.out.println(ConfigFactory.getFrameworkConfig().browser());

    }

}
