package XlsFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Tesst2 {
	public static void main(String[] args) throws BiffException, IOException, EncryptedDocumentException, InvalidFormatException{
		File f = new File("C:\\Users\\Adarsh P\\Desktop\\selenium test cases\\Credentials.xlsx");
        FileInputStream FIS = new FileInputStream(f);
        Workbook wb =  (Workbook) WorkbookFactory.create(f);
        
        
       Sheet sheet1 = wb.getSheet(0);
       int rows =sheet1.getRows();
       int columns= sheet1.getColumns();
       System.out.println(rows);
       System.out.println(columns);
       
       
       
	}
       }

