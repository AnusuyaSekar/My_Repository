package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class irctc {

	public static void main(String[] args) {
		// Driver Setup
		WebDriverManager.chromedriver().setup();
		//Disable Notifications
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");	
		//object creation for driver
		ChromeDriver driver = new ChromeDriver(options);
		//Load url
		driver.get("https://www.irctc.co.in/nget/train-search");
		//Maximize
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click on the Webelement
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//li[@class='menu-list header-icon-menu']/a[text()=' FLIGHTS ']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> windowHandles1 = new ArrayList<String>(windowHandles);
		int size = windowHandles1.size();
		System.out.println(size);
		driver.switchTo().window(windowHandles1.get(1));
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		driver.switchTo().window(parentWindow);
		String title1 = driver.getTitle();
		System.out.println(title1);
		
	}

}
