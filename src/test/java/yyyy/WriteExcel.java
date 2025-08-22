package yyyy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		File scr = new File("D:\\FileHandling\\ReadExcel.xlsx");
		FileInputStream fis = new FileInputStream(scr);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet  sheet1    =  wb.getSheetAt(0);
		
		sheet1.getRow(0).createCell(2).setCellValue("Pass");
		sheet1.getRow(1).createCell(2).setCellValue("PASS");
		sheet1.getRow(2).createCell(2).setCellValue("Fail");
		sheet1.getRow(3).createCell(2).setCellValue("FAIL");
		sheet1.getRow(4).createCell(2).setCellValue("Did not Run");
		
	 FileOutputStream fout = new FileOutputStream(scr);	
	          wb.write(fout);
	          
	          wb.close();
		
	}

}
