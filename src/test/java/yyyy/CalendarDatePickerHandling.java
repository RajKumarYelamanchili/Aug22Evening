package yyyy;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarDatePickerHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserTrial\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.findElement(By.id("datepicker")).click();
		
		System.out.println(driver.getCurrentUrl());
		
		  Thread.sleep(2000); List<WebElement> allDates =
		  driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"))
		  ; Thread.sleep(2000);
		  
		  for(WebElement ele : allDates) 
		  {
			  String date= ele.getText(); 
		  if
		  (date.equalsIgnoreCase("12"))
		  { ele.click();
		  break; } }
		 

	}

}
