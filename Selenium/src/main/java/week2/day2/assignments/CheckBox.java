package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import week4.day2.BaseClass;

public class CheckBox extends BaseClass {
	@Test 

	public  void checkBox() {
	
		WebElement checkbox = driver.findElement(By.xpath("//span[text()='Basic']/preceding-sibling::div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']"));
		checkbox.click();
		boolean enabled = checkbox.isEnabled();
		if (enabled==true) {
			System.out.println("check box is enabled ");
		}else {
			System.out.println("check box is not enabled ");
		}
	
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']/preceding-sibling::div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
//		String text = driver.findElement(By.xpath("//span[text()='Checked']")).getAttribute("innerHTML");
//		System.out.println(text);
		boolean enabled2 = driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-disabled ui-state-disabled']")).isEnabled();
		if(enabled2==true) {
			System.out.println("Checkbox is enabled");
		}else {
			System.out.println("Checkbox is disabled");
		}
		driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right']")).click();
		
		driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all']/parent::div/preceding-sibling::div/div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
//		driver.findElement(By.xpath(""));
//		driver.findElement(By.xpath(""));
//		driver.findElement(By.xpath(""));
//		driver.findElement(By.xpath(""));
//		driver.findElement(By.xpath(""));
//		driver.findElement(By.xpath(""));
//		driver.findElement(By.xpath(""));
//		driver.findElement(By.xpath(""));
//		driver.findElement(By.xpath(""));
//		
	}

}
