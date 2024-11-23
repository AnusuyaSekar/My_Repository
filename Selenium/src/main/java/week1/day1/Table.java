package week1.day1;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		WebElement row = driver.findElement(By.xpath("//table/tbody/tr)"));
		Dimension size = row.getSize();
		System.out.println(size);
		
		
		
		for (int i = 0; i < args.length; i++) {
			
		}
		
		driver.findElement(By.xpath("//table/tbody/tr[]/td[]"));

	}

}
