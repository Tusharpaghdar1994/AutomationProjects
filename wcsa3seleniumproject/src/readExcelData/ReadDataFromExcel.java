package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		 FileInputStream fis = new FileInputStream("./data/testdata.xlsx");//getting the specified File for read operation
		 Workbook wb = WorkbookFactory.create(fis);//it makes the file ready for read operation
		 Sheet sh = wb.getSheet("validdata");//it specifies which sheet
		 Row row = sh.getRow(1);//Specifies the Row
		 Cell cell = row.getCell(1);// Specifies the column
		 String data = cell.getStringCellValue();//it read the data from cell
		 System.out.println(data);//display data
		 
	}
}
