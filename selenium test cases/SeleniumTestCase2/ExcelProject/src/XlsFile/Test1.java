package XlsFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Adarsh P\\Desktop\\selenium-java-3.0.1\\chromedriver_win32\\chromedriver.exe");
		// TODO Auto-generated method stub
		WebDriver driver;
		File f = new File("C:\\Users\\Adarsh P\\Desktop\\selenium test cases\\Credentials.xlsx");
		FileInputStream FIS = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(FIS);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		// System.out.println(sheet1.getLastRowNum());
		int i, j;
		int k = 0;
		for (i = 0; i <= 2; i++) {
			System.out.println("######sheet1.getLastRowNum()###" + sheet1.getLastRowNum());
			// for(j=0; j<=sheet1.getDefaultColumnWidth();j++){
			System.out.println("####I:value###" + i);
			String a = sheet1.getRow(k).getCell(i).getStringCellValue();
			System.out.println(a);
			k++;
			// String b = sheet1.getRow(i).getCell(k).getStringCellValue();
			// System.out.println(b);
			// driver = new ChromeDriver();
			// for(int i = 0; i<=sheet1.getLastRowNum();i++ ){
			// driver.get("http://demo.guru99.com/V4/index.php");
			// driver.findElement(By.name("uid")).sendKeys(a);
			// driver.findElement(By.name("password")).sendKeys(a);
			// driver.findElement(By.name("btnLogin")).click();
		}

	}
}