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

public class ToFetchDataFromExcelSheetByRowAndCell {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	File f = new File(".\\testData\\DWS.xlsx.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook workbook = WorkbookFactory.create(fis);
	Sheet sheet = workbook.getSheet("RegisterdCredentials");
	int rowNum = sheet.getPhysicalNumberOfRows();
	for(int i=0;i<rowNum;i++) 
	{
	Row row = sheet.getRow(i);
	int cellNum=row.getPhysicalNumberOfCells();
	for(int j=0;j<cellNum; j++) 
	{
	Cell cell = row.getCell(j);
	String data=cell.toString();
	System.out.print(data+"\t");//"\t"is used for giving tab 
	}
	System.out.println();
	}
}
}
