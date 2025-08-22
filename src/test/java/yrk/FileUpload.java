package yrk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUpload {

	@Test
	public void TC_FileUpload() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserTrial\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.get("http://the-internet.herokuapp.com/upload");
        Thread.sleep(2000);
        // Replace with the actual file path on your system
        String filePath = "D:\\FileHandling\\abc.txt";
        Thread.sleep(2000);
        driver.findElement(By.id("file-upload")).sendKeys(filePath);
        Thread.sleep(2000);
        driver.findElement(By.id("file-submit")).click();
        Thread.sleep(2000);
        String ExpectedUploadedText="abc.txt";

        String ActualUploadedText = driver.findElement(By.id("uploaded-files")).getText();
        System.out.println("Uploaded file: " + ActualUploadedText);

      Assert.assertEquals(ActualUploadedText, ExpectedUploadedText,"File not uploaded");

	}

}
