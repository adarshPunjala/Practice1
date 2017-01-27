package Package;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelTest2 {

public static void main(String[] args) throws Exception{
 //WebDriver driver =new ChromeDriver();
 
	//driver.get("http://www.gcrit.com/build3/login.php");

	File src = new File("C:\\Users\\Adarsh P\\Desktop\\selenium test cases\\Excel TestCase\\seleniumexcel.xlsx");

    FileInputStream fis = new FileInputStream(src);
    
    XSSFWorkbook wb = new XSSFWorkbook(fis);
    
    XSSFSheet sheet = wb.getSheetAt(0);
    
    int RowCount = sheet.getLastRowNum();
    System.out.println("Total Number of Rows is "+RowCount);
    
    for(int i=0; i<=RowCount; i++){
    	String a = sheet.getRow(i).getCell(0).getStringCellValue();
    	System.out.println(a);
   
    String b= sheet.getRow(i).getCell(1).getStringCellValue();
    System.out.println(b);
    
	
	
    
    }


}	
	
}
