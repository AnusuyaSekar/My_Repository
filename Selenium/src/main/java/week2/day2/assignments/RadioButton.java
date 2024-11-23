package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) {
		//Driver Setup
		WebDriverManager.chromedriver().setup();
		//Drive object creation
		ChromeDriver driver = new ChromeDriver();
		//Open URL
		driver.get("https://demo.guru99.com/test/radio.html");
		//Maximize
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//webElements
		WebElement checkbox = driver.findElement(By.xpath("//input[@value='Option 1']"));
		checkbox.click();
		boolean selected = checkbox.isSelected();
		System.out.println(selected);
		driver.get("https://demo.guru99.com/test/radio.html");
			
	}

}
