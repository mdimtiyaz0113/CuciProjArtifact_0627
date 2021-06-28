package CucRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources",
		glue = "CucStepDef",
		monochrome = true,
		plugin = {"pretty","html:target/cucumber-html-report",
					"html:target/cucumber-xml-report/report.xml",
					"html:target/cucumber-json-report/report.json"
				
				
		}
		
		
		)

public class TestLoginRunner {

}
