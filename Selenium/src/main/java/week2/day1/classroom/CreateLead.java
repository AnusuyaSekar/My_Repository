package week2.day1.classroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import week4.day2.BaseClass;

public class CreateLead extends BaseClass {
	
	

	@BeforeClass
	public void datafileSetUp() {
		fileName = "Create Lead";
	}
	
		
@Test(dataProvider="dataProvider",retryAnalyzer= Listener.class)
	public void createLead(String cName, String fName, String lName) {
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	driver.findElement(By.id("createLeadForm_lastName1")).sendKeys(lName);
	WebElement dropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select dd= new Select(dropdown);
	dd.selectByVisibleText("Conference");
	driver.findElement(By.name("submitButton")).click();
	System.out.println(driver.getTitle());
	
	
	

	}

}
