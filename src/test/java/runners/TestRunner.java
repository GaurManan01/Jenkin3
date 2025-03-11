package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features",
    glue = "stepDefinitions",
//    plugin = {"pretty", "html:target/cucumber-reports"}
    plugin = {"pretty", "json:target/cucumber-reports-html.Cucumber.json"} // Reports
)
public class TestRunner extends AbstractTestNGCucumberTests 
{
	
}