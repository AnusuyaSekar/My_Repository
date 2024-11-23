package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	public static void main(String[] args) throws InterruptedException {
		//Driver Setup
				WebDriverManager.chromedriver().setup();
				//Class creation
				ChromeDriver driver = new ChromeDriver();
				//Load url
				driver.get("https://leafground.com/");
				//MaximiZe
				driver.manage().window().maximize();
				//Wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//WebElements
				driver.findElement(By.xpath("//span[text()='Element']/ancestor::li/a")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//span[text()='Hyper Link']")).click();
				Thread.sleep(3000);
				List<WebElement> Links = driver.findElements(By.xpath("//a[@class='ui-link ui-widget']"));
				System.out.println(Links.size());
				for(int i=0; i<Links.size();i++) {
					System.out.println(Links.get(i).getText());	
				}
				Thread.sleep(3000);
				Links.get(0).click();
				Thread.sleep(3000);
				System.out.println(driver.getTitle());
				Thread.sleep(3000);
				driver.navigate().back();
				Thread.sleep(3000);
				List<WebElement> Links1 = driver.findElements(By.xpath("//a[@class='ui-link ui-widget']"));
				System.out.println(Links1.size());
				for(int i=0; i<Links1.size();i++) {
					System.out.println(Links1.get(i).getText());	
				}
				Thread.sleep(3000);
				System.out.println(Links1.get(1).getAttribute("href"));

				
	}

}
