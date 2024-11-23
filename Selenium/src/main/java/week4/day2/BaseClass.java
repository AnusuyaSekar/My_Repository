package week4.day2;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BaseClass {
	public ChromeDriver driver;
	public String fileName;
@Parameters({"url","userName", "password"})
  @BeforeMethod
  public void beforeMethod(String url, String userName, String password) throws InterruptedException {
	//Driver Setup
			WebDriverManager.chromedriver().setup();
			//Drive object creation
			driver = new ChromeDriver();
			//Open URL
			driver.get(url);
			//Maximize
			driver.manage().window().maximize();
			//wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			//webElements
			WebElement findElement = driver.findElement(By.id("username"));
			findElement.sendKeys(userName);
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.className("decorativeSubmit")).click();
			Thread.sleep(0);
  }
@DataProvider(name= "dataProvider")

public String[][] dataProvider() throws IOException {
	String[][] readExcel = ExcelFile.readExcel(fileName);
//    String[] [] data = new 	String [3][3];
//    data[0] [0] ="Accenture";
//    data[0] [1] ="Anusuya";
//    data[0] [2] ="Sekar";
//    data[1] [0] ="Infosys";
//    data[1] [1] ="Balaji";
//    data[1] [2] ="Sekar";
//    data[2] [0] ="FreshWorks";
//    data[2] [1] ="Sowmiya";
//    data[2] [2] ="Sekar";
	return readExcel;
	}

  @AfterMethod
  public void afterMethod() {
	  driver.close();
	 
  }

}
