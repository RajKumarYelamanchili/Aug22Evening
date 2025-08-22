package xxx;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserTrial\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		//First way
		driver.findElement(By.xpath("//input[@value=1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=-1]")).click();
		Thread.sleep(2000);
		
		//second way
		  List<WebElement>  radio_btns     =        driver.findElements(By.xpath("//input[@type='radio']"));
		  System.out.println("Total radio buttons : " + radio_btns.size());
		  
		  System.out.println(radio_btns.get(0).isSelected());//false
		  System.out.println(radio_btns.get(1).isEnabled());//true
		  System.out.println(radio_btns.get(2).isDisplayed());//true
		
			Thread.sleep(2000);
			radio_btns.get(1).click();
			
		//3rd way
			List<WebElement>	radio_buttons =		driver.findElements(By.xpath("//label[@class='_58mt']"));
			System.out.println("Total number of radio buttons: " + radio_buttons.size());
			
			String ExpectedResult="Male";
			
			for(int i=0;i<radio_buttons.size();i++)
			{
				if (radio_buttons.get(i).getText().equalsIgnoreCase(ExpectedResult))
				{
					radio_buttons.get(i).click();
					System.out.println(ExpectedResult + " clicked");
				}
			}
 

	}

}
