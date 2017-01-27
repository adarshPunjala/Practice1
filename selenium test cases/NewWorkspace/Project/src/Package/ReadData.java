package Package;

import PackageExcel.ExcelClass;

public class ReadData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ExcelClass excel = new ExcelClass("C:\\Users\\Adarsh P\\Desktop\\selenium test cases\\Credentials.xlsx"); 
	System.out.println(excel.getData(0, 0, 0));
		
	}

}
