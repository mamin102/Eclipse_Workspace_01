package com.MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/moamin/eclipse-workspace/CucumberBDD/src/test/java/com/Feature/login.feature",
		//full Path to the Feature file.
		
		glue={"com.Step_Def"}, 
		//path of the step_definition file #we can just put the package of the step_def here.
		
		plugin= {"pretty"}, //"html:test-output"
		//Format of the report, we can do "pretty" "html:$$$" "json:j_output/report.json" "junit:junit_output/repot.xml"
		
		monochrome = true, // generate readable console output 
		
		dryRun = false , //if true then don't execute the step_def but will show if any methods are missing without giving any error in the junit console
		
		strict = false 
		
		)

public class TestRunner {
	
	

}
