package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {

	public static void main(String[] args) {
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
				//Click on the Webelement
				String windowHandle = driver.getWindowHandle();
				WebElement element = driver.findElement(By.xpath("//li[@class='ui-menuitem-submenu'][2]"));
				element.click();
				driver.findElement(By.xpath("//li[contains(@id,'menuform:m_window')]"));
				driver.findElement(By.xpath("//span[text()='Window']")).click();
				driver.findElement(By.xpath("//button[@name='j_idt88:new']")).click();
				Set<String> windowHandles = driver.getWindowHandles();
				List<String> windowHandles1 = new ArrayList<String>(windowHandles);
				int size = windowHandles1.size();
				for(int  i=0;i<=size-1;i++) {
					System.out.println(windowHandles1.get(i)); 
				}
				System.out.println(size);
				driver.switchTo().window(windowHandles1.get(1));
				String title = driver.getTitle();
				System.out.println(title);
//				Set<String> windowHandles2 = driver.getWindowHandles();
//				List<String> windowHandles3 = new ArrayList<String>(windowHandles);
//				driver.switchTo().window(windowHandles3.get(0));
				driver.switchTo().window(windowHandle);
				String title2 = driver.getTitle();
				System.out.println(title2);
				driver.close();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				WebDriverWait wait = new WebDriverWait();
				wait.until(ExpectedConditions.elementToBeClickable(By.id(title2)))
	}

}
