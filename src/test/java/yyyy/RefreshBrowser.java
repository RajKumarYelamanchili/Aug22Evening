package yyyy;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserTrial\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		System.out.println("1");
		driver.navigate().refresh();
		Thread.sleep(2000);
		System.out.println("2");
		driver.get(driver.getCurrentUrl());
		Thread.sleep(2000);
		System.out.println("3");
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(2000);
		System.out.println("4");
	   driver.navigate().to(driver.getCurrentUrl());
		Thread.sleep(2000);
		System.out.println("5");
		JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("location.reload()");
		Thread.sleep(2000);
		System.out.println("6");
		JavascriptExecutor js1= (JavascriptExecutor) driver;
        js1.executeScript("history.go(0)");

	}

}
