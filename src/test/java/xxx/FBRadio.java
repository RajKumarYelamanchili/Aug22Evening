package xxx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FBRadio {



@Test
public void TC_Radio1() throws InterruptedException
{

System.setProperty("webdriver.chrome.driver", "D:\\BrowserTrial\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

  Thread.sleep(2000);
  
  driver.manage().window().maximize(); 
  Thread.sleep(2000);
  driver.get("https://www.facebook.com"); 
  Thread.sleep(2000);
	/*
	 * driver.findElement(By.
	 * xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	 * Thread.sleep(2000); WebElement radio1=
	 * driver.findElement(By.xpath("(//input[@type='radio'])[1]")); radio1.click();
	 * Assert.assertTrue(radio1.isSelected(), "not selected"); Thread.sleep(2000);
	 */
  
  

}
@Test
public void TC_Radio2() throws InterruptedException
{

System.setProperty("webdriver.chrome.driver", "D:\\BrowserTrial\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

  Thread.sleep(2000);
  
  driver.manage().window().maximize(); 
  Thread.sleep(2000);
  driver.get("https://www.facebook.com"); 
  Thread.sleep(2000);
  driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
  Thread.sleep(2000);
WebElement radio2=  driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
           radio2.click();
       	Assert.assertTrue(radio2.isSelected(), "not selected");
		  Thread.sleep(2000);
  
  

}
@Test
public void TC_Radio3() throws InterruptedException
{

System.setProperty("webdriver.chrome.driver", "D:\\BrowserTrial\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

  Thread.sleep(2000);
  
  driver.manage().window().maximize(); 
  Thread.sleep(2000);
  driver.get("https://www.facebook.com"); 
  Thread.sleep(2000);
  driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
  Thread.sleep(2000);
WebElement radio3=  driver.findElement(By.xpath("(//input[@type='radio'])[5]"));
           radio3.click();
       	Assert.assertTrue(radio3.isSelected(), "not selected");
		  Thread.sleep(2000);
  
}

}