package dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	/**
	 *go to TC001 and hower on readDataFromExcel
	 * To know info about any method type /** and press enter
	 * This method is used to fetch data from excel sheet
	 * @param sheet-->pass sheet name
	 * @param row-->pass row index
	 * @param cell-->pass cell index
	 * @return String-->Data in the form of String
	 */
public static String readDataFromExcel(String sheet,int row,int cell ) {
	// if not connected to internet we get WebDriverException
	File f = new File(".\\testData\\DWS.xlsx.xlsx");
	FileInputStream fis=null;          //if not handled we get Exception Object Propagation
	Workbook workbook=null;
	try {
		fis = new FileInputStream(f);
		workbook = WorkbookFactory.create(fis);
	} catch (Exception e) {
	
		e.printStackTrace();
	}
	String data=workbook.getSheet(sheet).getRow(row).getCell(cell).toString();
	return data;
}
}

                     