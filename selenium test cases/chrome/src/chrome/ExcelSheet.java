package chrome;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet {
	static XSSFWorkbook wb;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//ArrayList list = new ArrayList();
		
		try {
			FileInputStream file = new FileInputStream("C:\\Users\\Adarsh P\\Desktop\\selenium test cases\\Credentials.xlsx");
			wb = new XSSFWorkbook(file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        XSSFSheet sheet = wb.getSheetAt(0);
        Iterator<Row> rowit = sheet.rowIterator();
        while(rowit.hasNext()){
        	System.out.println(rowit.next().getCell(0).getStringCellValue());
        }
        
	}

	
}
