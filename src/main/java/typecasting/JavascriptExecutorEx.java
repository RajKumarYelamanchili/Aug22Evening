package typecasting;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorEx {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserTrial\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.cricbuzz.com");
		Thread.sleep(2000);
		
		//TakesScreenshot ts   = (TakesScreenshot)driver;
	
		JavascriptExecutor  js      =   (JavascriptExecutor)driver;
		            js.executeScript("window.scrollTo(0,1000)");
		            Thread.sleep(2000);
		            js.executeScript("window.scrollBy(0,2000)");
		            Thread.sleep(2000);
		            js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		
		

	}

}
