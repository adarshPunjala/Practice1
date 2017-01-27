package Package;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		
		File src = new File("C:\\Users\\Adarsh P\\Desktop\\selenium test cases\\Excel TestCase\\seleniumexcel.xlsx");
		//System.out.println("entered file");
		FileInputStream fis = new FileInputStream(src);
		//System.out.println("entered fis");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		//System.out.println("entered wb");
		XSSFSheet sheet = wb.getSheetAt(0);
		//System.out.println("extracted sheet");
		String a = sheet.getRow(4).getCell(0).getStringCellValue();
		String b = sheet.getRow(4).getCell(1).getStringCellValue();
		
		System.out.println(a);
		System.out.println(b);
		wb.close();
		
	}

}
