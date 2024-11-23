package runner;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends AbstractTestNGCucumberTests{
	
	
	public static ChromeDriver driver;
	
	@BeforeMethod
	public void preCondition() {
		//Driver Setup
		WebDriverManager.chromedriver().setup();
		//Drive object creation
		driver = new ChromeDriver();
		//Open URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximize
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//webElements

	}
	@AfterMethod
	public void postCondition() {
		driver.close();

	}

}
