package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// Driver Setup
		WebDriverManager.chromedriver().setup();
		//object creation for driver
		ChromeDriver driver = new ChromeDriver();
		//Load url
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		//Maximize
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//find locator for the frame
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		//switch to frame
		driver.switchTo().frame(frame);
		//click on the button
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//switch to prompt alert
		Thread.sleep(3000);
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		//Enter text in Prompt alert
		Thread.sleep(3000);
		alert.sendKeys("Anu");
		//click ok on alert
		Thread.sleep(3000);
		alert.accept();
		//confirm the entered text in result
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		Thread.sleep(3000);
		//get the text
		if(text.contains("Anu")) {
			System.out.println("My name is present");
		}else {
			System.out.println("My name is not present");	
		}
		
		
		
		

	}

}
