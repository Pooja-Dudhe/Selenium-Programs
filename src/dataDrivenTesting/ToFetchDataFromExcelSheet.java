package dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToFetchDataFromExcelSheet {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	File f = new File(".\\testData\\DWS.xlsx.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook workbook = WorkbookFactory.create(fis);
	Sheet sheet = workbook.getSheet("RegisterdCredentials");
	Row row = sheet.getRow(0);
	Cell cell = row.getCell(0);
	System.out.println(cell);
}
}
