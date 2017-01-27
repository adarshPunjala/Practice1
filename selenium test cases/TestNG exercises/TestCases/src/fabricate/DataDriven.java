package fabricate;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFComment;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDriven {

	public static void main(String[] args) throws BiffException, IOException{
		File f = new File("C:\\Users\\Adarsh P\\Desktop\\selenium test cases\\Excel TestCase\\seleniumexcel.xlsx");
FileInputStream fis = new FileInputStream(f);
 //Workbook w = Workbook.getWorkbook(f);
 //Sheet ss= w.getSheet("sheet1");
		XSSFWorkbook WB = new XSSFWorkbook(fis);
		XSSFSheet s = WB.getSheet("sheet1");
		//System.out.println("count is ::" + ss.getColumns());
		System.out.println(s.getRow(0).getCell(1).getStringCellValue());
		
		
		
	
		
        
         
         
         
}
}