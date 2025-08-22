package collections;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserTrial\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
		
	String parentWindow=	driver.getWindowHandle();
	System.out.println("parent window: " + parentWindow);
	System.out.println("********************");
	
	  Set<String>   allWindows=     driver.getWindowHandles();
	  
	  Iterator<String>  itr = allWindows.iterator();
	  			String parentWindow1 = itr.next();
	  			System.out.println("pw: " + parentWindow1);
	  			Thread.sleep(4000);
				  String childWindow = itr.next();
System.out.println("child window: " +  childWindow);
				  

  driver.switchTo().window(childWindow); 
  Thread.sleep(7000);
  
  WebElement ele= driver.findElement(By.xpath("//h3[text()='New Window']"));
  
  
  
  String txt= ele.getText(); 
  System.out.println("text : " + txt);
  
  Thread.sleep(2000);
  driver.switchTo().window(parentWindow);
  Thread.sleep(5000);
  WebElement btn2= driver.findElement(By.xpath("//button[text()='Button2']"));
  System.out.println("text of the button : " + btn2.getText());
  Thread.sleep(2000);
	
  driver.quit();		
		
		
		
		
		
		
		

	}

}
