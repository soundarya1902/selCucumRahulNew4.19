package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features",glue="stepDefinitions",monochrome = true,dryRun = true)
//dryRun :true, it means that Cucumber will only check that every Step mentioned in the Feature File has corresponding code written in Step Definition file or not.
//monochrome:means that the console output for the Cucumber test are much more readable
public class cucumberRunner extends AbstractTestNGCucumberTests {
}
