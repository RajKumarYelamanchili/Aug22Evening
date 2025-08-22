package yrk;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserTrial\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(2000);
		List<WebElement>   lstOfElements =    driver.findElements(By.xpath("//ul/li[@class='sbct PZPZlf']"));
		Thread.sleep(2000);
		for(WebElement ele : lstOfElements)
				if (ele.getText().trim().equalsIgnoreCase("selenium webdriver"))
			{
				ele.click();
				break;
			}
		  
				
		

	}

}
