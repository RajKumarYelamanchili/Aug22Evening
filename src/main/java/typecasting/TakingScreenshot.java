package typecasting;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserTrial\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		//  int  varInt = (int)varDouble;
		
		
		TakesScreenshot ts   = (TakesScreenshot)driver;
		  File file=   ts.getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(file, new File("D:\\FileHandling\\FacebookAug2nd1030.png"));
		 FileUtils.copyFile(file, new File("../SecondProject/Screenshot2\\FacebookAug2ndPRoject.png"));
	}

}
