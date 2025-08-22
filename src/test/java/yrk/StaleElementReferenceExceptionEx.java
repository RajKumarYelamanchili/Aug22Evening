package yrk;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceExceptionEx {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserTrial\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        // Step 1: Locate an element
        WebElement searchBox = driver.findElement(By.name("q"));

        // Step 2: Refresh the page (causing DOM to reload)
        driver.navigate().refresh();

        // Step 3: Try using the old element reference after refresh
       
            searchBox.sendKeys("Selenium");
        Thread.sleep(2000);

        driver.quit();

	}

}
