package ExcelPackage;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class class1 {
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	
	//public void ExcelClass(String excelPath){
	public void ExcelClass(){
		try {
			File src = new File("C:\\Users\\Adarsh P\\Desktop\\selenium test cases\\Credentials.xlsx");
			
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
		System.out.println(data);
		return data;
		
	}
	}




