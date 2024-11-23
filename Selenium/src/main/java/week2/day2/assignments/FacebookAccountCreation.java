package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookAccountCreation {

	public static void main(String[] args) {
		//Driver Setup
		WebDriverManager.chromedriver().setup();
		//Class creation
		ChromeDriver driver = new ChromeDriver();
		//Load url
		driver.get("https://en-gb.facebook.com/");
		//MaximiZe
		driver.manage().window().maximize();
		//Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//WebElements
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Deshva");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("RG");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9980245678");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Jihnwm@3");
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select dd= new Select(day);
		dd.selectByVisibleText("3");
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select dd1= new Select(month);
		dd1.selectByVisibleText("Dec");
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select dd2= new Select(year);
		dd2.selectByVisibleText("1994");
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		System.out.println(driver.getTitle());
       // driver.close();
	}

}
