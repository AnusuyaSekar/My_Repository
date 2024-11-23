package runner;

import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features ="src/test/java/feature/CreateLead.feature",glue= {"steps"},monochrome=true, publish=true, tags="@smoke")
public class Runner extends BaseClass{
	
	

}
