package runnerPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		 glue = "steps" ,
		 features = "C:\\Users\\monik\\eclipse-workspace\\Cucumber_FinalProject\\Cucumber_FinalProject\\src\\test\\resources\\BackgroundColor.feature",
		 tags =  "@Scenario1, @Scenario2 ",
		 monochrome = true,
		 dryRun = false,
		
    plugin = {"progress",
            "html:target/report/html",
            "junit:target/report/junit/cucumber-report.xml",
            "json:target/report/json/cucumber-report.json"
    }
   

    		
    )

public class Runner_Class {
	

}
