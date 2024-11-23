package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
@Test
	public void duplicateLead1() {
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
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("anu@gmail.com");
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		String text = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext']")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext']")).click();
		String firstname = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		String lastname = driver.findElement(By.xpath("//span[@id='viewLead_lastName_sp']")).getText();
		String FullName= firstname + lastname;
		System.out.println("Name of the User is " + FullName);
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		String duplcaitefirstname = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		String duplcaitelastname = driver.findElement(By.xpath("//span[@id='viewLead_lastName_sp']")).getText();
		String duplicateFullName= duplcaitefirstname + duplcaitelastname;
		System.out.println("Name of the duplicated User is" + duplicateFullName);
		if(FullName.equalsIgnoreCase(duplicateFullName)) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
}}
