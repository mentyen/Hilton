package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features"
		,glue="maven/practice/steps"
		,monochrome=true
		,dryRun=false
		
		,tags= {"@smoke"}
		,plugin= {"pretty","html:target/cucumber-default-reports","json:target/cucumber.json"}
		
		)



public class TestRunner {
	
	

}
