package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import TestNGSS.SS;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excel {
public static void main(String []args) throws BiffException, IOException{		
	File e = new File("C:\\Users\\Adarsh P\\Desktop");	
	FileInputStream f = new FileInputStream(e);
		HSSFWorkbook w = HSSFWorkbook(f);
		HSSFSheet s = w.getSheetAt(0);
		HSSFRow rows = s.getRow(0);
		SS.captureScreenshot(driver);
		HSSFCellStyle columns = s.getColumnStyle(0);
		System.out.println(rows);
		System.out.println(columns);
	}

private static HSSFWorkbook HSSFWorkbook(FileInputStream f) {
	// TODO Auto-generated method stub
	return null;
}

}