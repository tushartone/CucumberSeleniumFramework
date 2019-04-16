package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/java/Features/Tagging.feature", //path of the feature file
		glue= {"stepDefinations"}, //path of the stepDefinations file
		format= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_output/cucumber.xml"}, //to generate reporting format for diff type
		monochrome=true, // display the console o/p in proper readble format
		dryRun=false, //immigiatley check the witch metods are missing from feature file and stepDefination => ddryRun=true
		strict=true, //it will check if any step is not fefined in step definations file
		tags= {"@RegressionTest","~@SmokeTest"}  // it will execute only the specified perticiular test
		)

public class TestRunner
{
	}
	
// OR - Tags : {"@RegressionTest , @SmokeTest"}  - excute all test  tagged as regression or smoke test

//And - Tags : {"@RegressionTest", "@SmokeTest"}  - excute all test  tagged as regression and smoke test
	
//For exclude test us '~@smoketest'   sign is ~

