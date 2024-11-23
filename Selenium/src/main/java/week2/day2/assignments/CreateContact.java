package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
@Test
	public  void createContact() {
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
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("ANU");
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("SEKAR");
		driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("Anusuya");
		driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("Sekar");
		driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("Testing");
		driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("SEnior Test Engineer");
		//Dropdown Element found
		WebElement findElement = driver.findElement(By.xpath("//select[@id='createContactForm_generalCountryGeoId']"));
		//Select Class import
		Select dd = new Select(findElement);
		//dropdown selection
		dd.selectByVisibleText("Egypt");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		//Edit Contact
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//input[@id='updateContactForm_firstName']")).clear();
		driver.findElement(By.xpath("//input[@id='updateContactForm_firstName']")).sendKeys("Anu");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		//Page Title
		System.out.println(driver.getTitle());
		
	
	
	}

}
