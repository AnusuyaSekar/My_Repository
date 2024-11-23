package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import runner.BaseClass;

public class CreateLead extends BaseClass{

	@When("Click on {string}")
	public void clickLogin(String object) {
		driver.findElement(By.linkText(object)).click();
	}
	@Then("{string} should be displayed")

	public void homePage(String object) {
		System.out.println(object +" is  displayed");
	}
	
}
