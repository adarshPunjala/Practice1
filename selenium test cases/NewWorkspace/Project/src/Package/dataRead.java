package Package;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataRead {
	//public static void main(String[] args) throws Exception{
		
	public static void getdata(String fileLocation, String sheetName) throws Exception{
	//File src = new File("C:\\Users\\Adarsh P\\Desktop\\selenium complete notes GC reddy\\GmailCredentials.xlsx");
		File src = new File(fileLocation);
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet(sheetName);
		//XSSFSheet sheet = wb.getSheetAt(0);
		int num=sheet.getLastRowNum();
		for(int i=0;i<=num;i++){
		String a =sheet.getRow(i).getCell(0).getStringCellValue();
		String b =sheet.getRow(i).getCell(1).getStringCellValue(); 
		//double b = sheet.getRow(i).getCell(1).getNumericCellValue();
		System.out.println(a);
		System.out.println(b);
	}
		return;
	}
}