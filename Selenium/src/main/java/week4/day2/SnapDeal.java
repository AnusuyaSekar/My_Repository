package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException {
		// Driver Setup
				WebDriverManager.chromedriver().setup();
				//object creation for driver
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications");
				ChromeDriver driver = new ChromeDriver();
				//Load url
				driver.get("https://snapdeal.com/");
				//Maximize
				driver.manage().window().maximize();
				//Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				WebElement men = driver.findElement(By.xpath("//span[contains(text(), 'Men')]"));
				Actions action = new Actions(driver);
				action.moveToElement(men).perform();
				Thread.sleep(5000);
				WebElement shirts = driver.findElement(By.xpath("(//span[contains(text(), 'Shirts')])[2]"));
				shirts.click();
				WebElement firstImage = driver.findElement(By.xpath("//img[@class='product-image ']"));
				action.moveToElement(firstImage).perform();
				WebElement quickView = driver.findElement(By.xpath("//div[contains(text(),'Quick View')]"));
				quickView.click();

	}

}
