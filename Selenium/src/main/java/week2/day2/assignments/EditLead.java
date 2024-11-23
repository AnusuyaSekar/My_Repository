package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
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
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("anusuya");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//a[text()='anusuya']/ancestor::td/preceding-sibling::td/div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		String companyName = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println(companyName);
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("Facebook");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String editedCompanyName = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println(editedCompanyName);
		if(companyName.equalsIgnoreCase(editedCompanyName)) {
			System.out.println("COmpany Name is not changed");
		}else {
			System.out.println("COmpany Name is  changed");
		}
			driver.quit();
		
		
		
		
		
		//

	}

}
