package week3.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

//	1. Launch the URL https://www.ajio.com/
//		2. In the search box, type as "bags" and press enter
//		3. To the left of the screen under " Gender" click the "Men"
//		4. Under "Category" click "Fashion Bags"
//		5. Print the count of the items Found.
//		6. Get the list of brand of the products displayed in the page and print the List
//		// Add the List to Set to remove Duplicates
//		// list
//		// 7. Get the list of names of the bags and print
		
	public static void main(String[] args) {
		       //Driver Setup
				WebDriverManager.chromedriver().setup();
				//Drive object creation
				ChromeDriver driver = new ChromeDriver();
				//Launch the URL
				driver.get("https://www.ajio.com/");
				//Maximize
				driver.manage().window().maximize();
				//wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//In the search box, type as "bags" and press enter
			driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("bags");
			driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys(Keys.ENTER);
//			3. To the left of the screen under " Gender" click the "Men"
			driver.findElement(
					By.xpath("//label[contains(@class,'facet-linkname facet-linkname-genderfilter facet-linkname-Men')]"))
					.click();
			driver.findElement(By.xpath("//input[@id='Men - Fashion Bags']")).click();
			
			driver.close();
				
				

	}

}
