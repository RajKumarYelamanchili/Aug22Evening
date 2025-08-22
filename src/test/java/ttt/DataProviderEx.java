package ttt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx 
{
	@Test(dataProvider="testdata1")
	public void dataDrivenTest(String username,String password) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserTrial\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(2000);
		driver.close();
	}
	
	@DataProvider(name="testdata1")
	public Object[][]   testdataFacebook()
	{
		
		Object[][]  fbdata = new Object[4][2];
		
		fbdata[0][0] = "Username1";
		fbdata[0][1] = "Password1";
				
		fbdata[1][0] = "Username2";
		fbdata[1][1] = "Password2";
		
		fbdata[2][0] = "Username3";
		fbdata[2][1] = "Password3";
		
		fbdata[3][0] = "Username4";
		fbdata[3][1] = "Password4";
		
		return fbdata;
		
	}
	
	
}
