package TestScripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToCheckTestNGWorkingOrNot {

	@Test
	public void executeScript1()
    {
	    //System.out.println("Hello TestNG");
		//this will generate report in test-output folder , inside that open emailable report.html
		//Reporter.log("Executing Test Case");
		Reporter.log("Executing TestCase 1",true);
	}

	@Test(priority = -5)//helper attribute
	public void executeScript2()
    {
	    //System.out.println("Hello TestNG");
		//Reporter.log("Executing Test Case");
		Reporter.log("Executing TestCase 2",true);
	}
	
}