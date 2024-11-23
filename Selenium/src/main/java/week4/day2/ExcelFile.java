package week4.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFile {

	public static String[][] readExcel(String fileName) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook ("./Data/"+fileName+".xlsx");
		XSSFSheet sheet = workbook.getSheet("CreateLead");
		int rowsize = sheet.getLastRowNum();
		System.out.println(rowsize);
		short columnsize = sheet.getRow(0).getLastCellNum();
//		XSSFRow row = sheet.getRow(1);
//		XSSFCell cell = row.getCell(0);
		String [][] data= new String [rowsize][columnsize];
		for(int i=1;i<=rowsize;i++) {
			for(int j=0; j<columnsize;j++) {
				data[i-1][j]= sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		
		
		
		workbook.close();
		return data;

	}

}
