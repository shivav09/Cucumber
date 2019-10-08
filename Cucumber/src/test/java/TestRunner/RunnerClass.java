package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src//test//java//Features//Feature1.feature", "src//test//java//Features//AFeature2.feature"},
glue="StepDefinitions",tags={"@Shiva"},
plugin = { "html:target/cucumber-reports" },
monochrome=true
)
	

public class RunnerClass {

}
