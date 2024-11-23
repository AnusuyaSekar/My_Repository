package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws IOException {

		// Driver Setup
		WebDriverManager.chromedriver().setup();
		WebDriver
		//object creation for driver
		ChromeDriver driver = new ChromeDriver();
		//Load url
		driver.get("https://www.amazon.in/");
		//Maximize
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// 2.search as oneplus 9 pro
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus");
		driver.findElement(By.id("nav-search-submit-button")).click();
		// 3.Get the price of the first product
		WebElement price = driver.findElement(By.xpath("//a[contains(@class,'a-link-normal s-no-hover s-underline-text s-underline-link-text s-link-style a-text-normal')]/span/span[2]/span[2]"));
		String Price = price.getText();
		System.out.println(price.getText());
		//int price1 = Integer.parseInt(text)
		// 4. Print the number of customer ratings for the first displayed product
		WebElement rating = driver.findElement(By.xpath("(//span[contains(@class,'s-underline-text')])[1]"));
		System.out.println(rating.getText());
		// 5. Click the first text link of the first image
		driver.findElement(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']")).click();
		// 6. Take a screen shot of the product displayed
		Set<String> windowHandles = driver.getWindowHandles();
		// Convert set to list
		List<String> windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		
		File screenshot = driver.getScreenshotAs(OutputType.FILE);
		File newFile = new File("./screenhot1.png");
		FileUtils.copyFile(screenshot, newFile);
		System.out.println("screenshot captured");
		// 7. Click 'Add to Cart' button
		driver.findElement(By.xpath("(//input[contains(@title,'Add to Shopping Cart')])[2]")).click();
		// 8. Get the cart subtotal and verify if it is correct.
		WebElement cartValue = driver.findElement(By.xpath("(//span[contains(@id,'attach-accessory-cart-subtotal')])[1]"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(cartValue));
		String CartValue = cartValue.getText();
		System.out.println(cartValue.getText());
		if(CartValue.contains(Price)) {
			System.out.println("price is correct");
		}else
			
			System.out.println("price is not correct");

}}


