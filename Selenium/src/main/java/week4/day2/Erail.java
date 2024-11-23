package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {


	public static void main(String[] args) {
		// Driver Setup
		WebDriverManager.chromedriver().setup();
		//object creation for driver
		ChromeDriver driver = new ChromeDriver();
		//Load url
		driver.get("https://erail.in/");
		//Maximize
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.id("txtStationFrom")).clear();
				driver.findElement(By.id("txtStationFrom")).sendKeys("MS");
				driver.findElement(By.id("txtStationFrom")).sendKeys(Keys.ENTER);
				driver.findElement(By.id("txtStationTo")).clear();
				driver.findElement(By.id("txtStationTo")).sendKeys("MDU");
				driver.findElement(By.id("txtStationTo")).sendKeys(Keys.ENTER);
				driver.findElement(By.id("chkSelectDateOnly")).click();
				//find the size of webelemnts
				int size = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[2]/a")).size();
				List<String> trainName= new ArrayList <String>();
				for(int i=2;i<=size;i++) {
					String text = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr["+i+"]/td[2]/a")).getText();
					trainName.add(text);
				}
				Collections.sort(trainName)		;
				System.out.println(trainName);
				System.out.println(trainName.size());
				Set<String> trainName2= new TreeSet <String>(trainName);				
				System.out.println(trainName2);
				System.out.println(trainName2.size());
				
				if(trainName.size()==trainName2.size()) {
					System.out.println("No duplicates");
					
				}else {
					System.out.println("Duplicates are there");
				}
				List<String> trainName3= new ArrayList <String>(trainName2);
				for(int i=0; i<trainName.size();i++) {
					for(int j=0; j<trainName2.size();j++) {
					if(!(trainName.get(i).equalsIgnoreCase(trainName3.get(j)))){
						System.out.println(trainName.get(i));
						break;
					}
						
					}
					}
				}
}

