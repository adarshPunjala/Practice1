package chrome;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class resusableexcel {

	XSSFSheet sheet;
	XSSFWorkbook wb;
	
	public void resusableexcel1(String excelpath) {
		// TODO Auto-generated constructor stub
	}
	public void exceldata(String excelPath) {
		
		try {
			File src = new File(excelPath);
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public String getData(int sheetnumber, int row, int column){
		sheet = wb.getSheetAt(sheetnumber);
		String data = sheet.getRow(row).getCell(column).getStringCellValue();
		return data;
		

	
	
	
	}
public int getRowCount(int sheetIndex){
	int row = wb.getSheetAt(sheetIndex).getLastRowNum();
	row = row +1;
	return row;
}


}