package yrk;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class zzDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserTrial\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
	
		 
		  String url = "https://selenium08.blogspot.com/2019/11/double-click.html"; 
		
		   driver.get(url); 

		
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 

		
		    WebElement dblclick = driver.findElement(By.xpath("//button[text() = 'Double-Click me to see Alert message']")); 

		 
		   Actions actions = new Actions(driver); 

		
		   actions.moveToElement(dblclick); // Line 1. 

	
		    actions.doubleClick(); // Line 2. 

		
		   actions.perform(); //Line 3. 

	
		// actions.moveToElement(dblclick).doubleClick().perform(); 

		  System.out.println("Double click action performed successfully at current location"); 
		  } 
	}


