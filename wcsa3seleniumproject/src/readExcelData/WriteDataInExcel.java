package readExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataInExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		 FileInputStream fis = new FileInputStream("./data/testdata.xlsx");//getting the specified File for read operation
		 Workbook wb = WorkbookFactory.create(fis);//it makes the file ready for read operation
		 Sheet sh = wb.getSheet("validdata");//it specifies which sheet
		 Row row = sh.getRow(1);//Specifies the Row
		 Cell cell = row.createCell(2);// Specifies the column
		 
		 cell.setCellValue("Tushar");
		 
		 FileOutputStream fos = new FileOutputStream("./data/testdata.xlsx");
		 wb.write(fos);
	}
}
