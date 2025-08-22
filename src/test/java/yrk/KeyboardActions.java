package yrk;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserTrial\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.saucelabs.com/");
		Thread.sleep(2000);
		
		/*
		 * WebElement searchbox = driver.findElement(By.name("q"));
		 * 
		 * Actions action = new Actions(driver);
		 * 
		 * action.moveToElement(searchbox) .keyDown(searchbox,Keys.SHIFT)
		 * .sendKeys(searchbox,"rohit sharma") .keyUp(searchbox,Keys.SHIFT)
		 * .sendKeys(searchbox,Keys.ENTER) .perform();
		 */
		

	}

}
