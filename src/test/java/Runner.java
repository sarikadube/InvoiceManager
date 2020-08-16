import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".", dryRun = false, strict = true ) // before execution
//@CucumberOptions(features = ".", dryRun = false, strict = true )

public class Runner {

}
