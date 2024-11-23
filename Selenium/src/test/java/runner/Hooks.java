package runner;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends BaseClass{
	
//	@Before
//	public void preCondition() {
//		//Driver Setup
//		WebDriverManager.chromedriver().setup();
//		//Drive object creation
//		driver = new ChromeDriver();
//		//Open URL
//		driver.get("http://leaftaps.com/opentaps/control/main");
//		//Maximize
//		driver.manage().window().maximize();
//		//wait
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		//webElements
//
//	}
//	@After
//	public void postCondition() {
//		driver.close();
//
//	}

}
