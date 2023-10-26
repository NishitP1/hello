package Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\MavenTest\\CucumberBDD\\src\\test\\java\\FeatureWithTags\\Tags.feature",
        glue = {"StepDefinitions"},
//        tags = "@smoke and @regression"
//        tags = "@smoke or @regression"
//        tags = "@smoke and @regression"
//        tags = "(@smoke or @regression) and @important"
       tags = "regression and @smoke"
        // tags = "(@smoke or @regression) and not @important"
)


public class TestRunner_RunWithSingleTag{
}
