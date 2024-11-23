package week2.day1.classroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	
	@Test

	public void editLead () throws InterruptedException {
		//Driver Setup
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "path\\filename.exe");
		//Open Browser
		ChromeDriver driver = new ChromeDriver();
		//Load URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Maximize window
		driver.manage().window().maximize();
		//Enter User Name and Password
		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Accenture");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anu");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sekar");
		WebElement dropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd= new Select(dropdown);
		dd.selectByVisibleText("Conference");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Accenture");
		Thread.sleep(3000);
		driver.findElement(By.id("updateLeadForm_firstName")).sendKeys(" Anusuya");
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("updateLeadForm_firstName")).getAttribute("value"));
		Thread.sleep(3000);
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		
		
		

	}

}
