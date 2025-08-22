package yyyy;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadExcel {
	public static void main(String[] args) throws IOException, InterruptedException {
		File scr = new File("D:\\FileHandling\\ReadExcel.xlsx");
		FileInputStream fis = new FileInputStream(scr);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet  sheet1    =  wb.getSheetAt(0);
		int rowCount = sheet1.getLastRowNum();
		
		System.out.println("Total number of rows where content is : " + rowCount);
		
		for(int i=0;i<rowCount;i++)
		{
			
			String username =    sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println(username);
			
			 String password   =     sheet1.getRow(i).getCell(1).getStringCellValue();
			 System.out.println(password);
			 
			 Thread.sleep(1000);
		}
	

	}

}
