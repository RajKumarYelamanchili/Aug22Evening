package readwrite_excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadFromExcel {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		File scr = new File("D:\\FileHandling\\ReadExcel.xlsx");
		FileInputStream fis = new FileInputStream(scr);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		      XSSFSheet sheet1=  wb.getSheetAt(0);
		   int rowCount=   sheet1.getLastRowNum();
		      
		 System.out.println("Last row where content is : " + rowCount);
		
		for(int i=0;i<=rowCount;i++)
		{
			System.setProperty("webdriver.chrome.driver", "D:\\BrowserTrial\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			Thread.sleep(2000);
			
			driver.manage().window().maximize();
			Thread.sleep(2000);
				
			driver.get("https://www.facebook.com");
			Thread.sleep(2000);
			
			
	String Username  =		sheet1.getRow(i).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Username);
		//System.out.println("the username is : " + Username);
	
	 String Password  =       sheet1.getRow(i).getCell(1).getStringCellValue();
	// System.out.println("the password is : " + Password);
	driver.findElement(By.name("pass")).sendKeys(Password);
	 
	 Thread.sleep(2000);
	driver.close();		
			
		}
		
		
	}

}
