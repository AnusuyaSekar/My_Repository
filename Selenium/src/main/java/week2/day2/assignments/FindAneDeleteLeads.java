package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAneDeleteLeads {
@Test
	public  void findAneDeleteLeads() {
		//Driver Setup
				WebDriverManager.chromedriver().setup();
				//Drive object creation
				ChromeDriver driver = new ChromeDriver();
				//Open URL
				driver.get("http://leaftaps.com/opentaps/control/logout");
				//Maximize
				driver.manage().window().maximize();
				//wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//webElements
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
				driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
				driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
				driver.findElement(By.xpath("//a[text()='Leads']")).click();
				driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
				driver.findElement(By.xpath("//span[text()='Phone']")).click();
				driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("+91");
				driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9890456789");
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				//To get the first leads id
				driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
				String text = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext']")).getText();
				System.out.println(text);
				driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext']")).click();
				driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
				driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
				driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				String text2 = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
				System.out.println(text2);
				//driver close
				//driver.close();
			

	}

}
