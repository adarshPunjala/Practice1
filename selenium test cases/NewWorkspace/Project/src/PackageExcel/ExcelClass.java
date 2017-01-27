package PackageExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelClass {
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	
	public ExcelClass(String excelPath){
		try {
			File src = new File(excelPath);
			
			FileInputStream fis = new FileInputStream(src);
			
			wb = new XSSFWorkbook(fis);
			
			sheet = wb.getSheetAt(0);
		} catch(Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		}
	public String getData(int i,int row, int column){
		String data =  sheet.getRow(row).getCell(column).getStringCellValue();
		return data;
	}
	}


