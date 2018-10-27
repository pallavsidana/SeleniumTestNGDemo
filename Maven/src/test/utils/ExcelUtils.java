package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
public static void getRowCount() {
	//create a reference of our workbook
	
	try {
	String location="C:\\Users\\Sumedha\\eclipse-workspace\\Maven-Project\\excel\\data.xlsx";
	XSSFWorkbook wb = new XSSFWorkbook(location);

	
	
	//create a reference for worksheet
	
	XSSFSheet sheet = wb.getSheet("Sheet1");
	}
	catch(Exception exp) {
		exp.getCause();
		exp.getMessage();
		exp.printStackTrace();
	}
}
}
