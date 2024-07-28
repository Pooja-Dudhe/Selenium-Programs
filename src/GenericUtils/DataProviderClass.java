package GenericUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataProviderClass {
public static void main(String[] args)  {
	 File f = new File(".\\testData\\DWS.xlsx.xlsx");
	 Workbook workbook=null;
	try
	{ FileInputStream fis = new FileInputStream(f);
	  workbook = WorkbookFactory.create(fis);
	}
	catch(Exception e)
	{
		//System.out.println("Caught");
	}
	Sheet sheet = workbook.getSheet("RegisterdCredentials");
	int rowCount = sheet.getPhysicalNumberOfRows();
	int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
	
	String[][]result=new String[rowCount-1][cellCount];
	for(int i=1;i<rowCount;i++)
	{
		for(int j=1;j<cellCount;j++)
		{
			String data=sheet.getRow(i).getCell(j).toString();
			result[i-1][j]=data;
		}
	}
	for(int i=0;i<result.length;i++)
	{
		for(int j=0;j<result[i].length;j++)
		{
			System.out.print(result[i][j]+"\t");
		}
		System.out.println();
	}
	
	

}
}