package chrome;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelSheetData {
        @Test(dataProvider="Excel")
        public void login(String username, String password){
        	WebDriver driver = new ChromeDriver();
    		driver.get("http://www.demo.guru99.com/V4/index.php");
    		

    		driver.manage().window().maximize();
    		
    		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    		
    		driver.get("http://www.demo.guru99.com/V4/index.php");
    		
    		driver.findElement(By.name("uid")).sendKeys("username");
    		
    		driver.findElement(By.name("password")).sendKeys("password");
    		
    		driver.findElement(By.name("btnLogin")).click();
    		
    		//driver.close();
    		
    		driver.quit();
        }
	

    	@DataProvider(name="Excel")
    	public Object[][]passdata(String[][] data) throws Exception{
    		File f = new File("C:\\Users\\Adarsh P\\Desktop\\selenium test cases\\Credentials.xlsx");
    	    FileInputStream fis = new FileInputStream(f);
    	    XSSFWorkbook wb = new XSSFWorkbook(fis);
    	    XSSFSheet sheet = wb.getSheetAt(0);
    	    
            int a = sheet.getLastRowNum();
            a=a+1;
            for(int i=0;i<a;i++){
            	data[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
            	data[i][1]=sheet.getRow(i).getCell(1).getStringCellValue();
         
            	
            	
        
            
            
			return data;	
}
			return data;
	
    	}
}