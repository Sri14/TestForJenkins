package webRoster.runner;

import java.io.*;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/Users/HomeMac/Documents/workspace/CucumberMaven/src/main/java/webRoster/Feature/Home.feature",
		glue = "webRoster.StepDef",
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"},
		dryRun= false,
		strict= true,
		monochrome= true
		//tags = {"@Sri"}
		)




public class WebRosterRunner {
	
	@AfterClass
	public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File("/Users/HomeMac/Documents/workspace/CucumberMaven/src/main/java/extentReportListner/extent-config.xml "));
	}
	
}

