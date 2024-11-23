package steps;

import org.openqa.selenium.By;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import runner.BaseClass;

public class Login extends BaseClass{
	
//	public ChromeDriver driver;
	
	
// @Given("Open the chrome browser")
// 
//public void openBrowser() {
//	WebDriverManager.chromedriver().setup();
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//}
//@Given("Load the Application  {string}")
//public void loadURL(String url) {
// driver.get(url);
//}
@Given("Enter the valid username {string}")
public void enterUserName(String uName) {
	driver.findElement(By.id("username")).sendKeys(uName);

}
@Given("Enter the valid password {string}")
public void enterPassword (String password){
	driver.findElement(By.id("password")).sendKeys(password);
}
@When("Click on Login button")
public void clickLogin() {
	driver.findElement(By.className("decorativeSubmit")).click();
}
@Then("Homepage should be displayed")
public void verifyHomePage() {
boolean text = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
if(text==true) {
	System.out.println("Home is displayed");
}else {
	System.out.println("Home is not displayed");
}
}
@But("Error Message should be displayed")
public void verifyErrormessage() {
System.out.println("Error message is displayed");
}

}
