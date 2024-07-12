package TestScripts;

import ElementRepository.BasePage;
import GenericUtils.BaseClass;
import dataDrivenTesting.ExcelUtility;

public class TC001 extends BaseClass{
public static void main(String[] args) {
	openBrowser();
	driver.get("https://demowebshop.tricentis.com/");
	BasePage bp=new BasePage(driver);
	//PageFactory.initElements(driver,bp);
	bp.getRegisterLink().clear();
	
	//ExcelUtility.readDataFromExcel(null, 0, 0);
	
}
}
