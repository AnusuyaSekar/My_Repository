package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadUsingxPath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "path\\filename.exe");
		//Open Browser
		ChromeDriver driver = new ChromeDriver();
		//Load URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Maximize window
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Sales");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("DemoSales");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Manager");
		WebElement findElement = driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
		Select dd= new Select(findElement);
		dd.selectByVisibleText("Direct Mail");
		List<WebElement> options = dd.getOptions();
		int size = dd.getOptions().size();
		System.out.println(size);
		
		for(int i=0; i<size-1;i++) {
		System.out.println(options.get(i).getText());
		}
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();		
		System.out.println(driver.getTitle());
		driver.close();

	}

}
