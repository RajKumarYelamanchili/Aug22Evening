package yrk;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class zzRightClick {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\BrowserTrial\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	Thread.sleep(2000);
	driver.manage().window().maximize();

	
	driver.get("https://selenium08.blogspot.com/2019/12/right-click.html");
	
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 

	 
	   WebElement contextMenu = driver.findElement(By.xpath("//div[@id = 'div-context']")); 

	
	     Actions actions = new Actions(driver); 
	      actions.contextClick(contextMenu); 


	     WebElement python = driver.findElement(By.xpath("//a[text() = 'Python']")); 


	     actions.click( python ); 
	     actions.perform(); 
	     
	     Thread.sleep(2000);
	    System.out.println("Right-clicked Successfully on Context menu"); 


	   Alert alert = driver.switchTo().alert(); 


	   String getText = alert.getText(); 
	   System.out.println("Displayed Text on pop-up: " +getText); 


	     alert.accept(); 
	     Thread.sleep(2000);
	     driver.close(); 
	 
	}
}
