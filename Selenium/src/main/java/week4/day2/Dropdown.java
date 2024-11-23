package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// Driver Setup
				WebDriverManager.chromedriver().setup();
				//object creation for driver
				ChromeDriver driver = new ChromeDriver();
				//Load url
				driver.get("https://leafground.com/");
				//Maximize
				driver.manage().window().maximize();
				//Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath("//span[text()='List']/ancestor::a")).click();
				driver.findElement(By.xpath("(//span[text()='List']/ancestor::a)[2]")).click();
				WebElement san = driver.findElement(By.xpath("//li[text()='San Francisco']"));
				WebElement istan = driver.findElement(By.xpath("//li[text()='Istanbul']"));
				Actions builder = new Actions(driver);
				builder.keyDown(Keys.CONTROL).click(san).click(istan).keyDown(Keys.CONTROL).perform();
				//Thread.sleep(5000);
				driver.findElement(By.xpath("//span[text()='Add']/ancestor::button")).click();

	}

}
