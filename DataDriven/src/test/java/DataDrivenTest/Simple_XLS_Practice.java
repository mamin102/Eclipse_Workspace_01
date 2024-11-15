package DataDrivenTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Simple_XLS_Practice {

	public static void main(String[] args) throws IOException  {
		//create a file class object from java.io and pass the file path in the parameter to open the xlsx file :
		
				File file = new File("/Users/moamin/eclipse-workspace/DataDriven/src/test/java/com/testData/DataDriven.xlsx");
				
				//create a FileinputStream class object :

				FileInputStream inputStream = new FileInputStream(file);
				
				//Creating instamce for XSSFWorkbook 
				XSSFWorkbook testWB = new XSSFWorkbook(inputStream);
				
				//creating XSSFSheet object to get to the exact sheet 
				XSSFSheet sheet = testWB.getSheet("Registration");
				
				//get all the row number :
				int rowCount = sheet.getLastRowNum()- sheet.getFirstRowNum();
				
				
				System.out.println(rowCount);
				
				String email = sheet.getRow(3).getCell(3).getStringCellValue();
				
				
				
				System.out.println(email);
	}

}
