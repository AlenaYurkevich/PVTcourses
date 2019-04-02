package run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources", 
		glue = { "apiVk", "emailsMailRu" }, 
		tags = "@apiVK, @emails",
		dryRun = false, 
		strict = false)
public class RunTest {
}