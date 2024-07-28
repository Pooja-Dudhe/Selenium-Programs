package TestScripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericUtils.BaseClass2;

public class TestScript002 extends BaseClass2{
	@Test
	public void executeScript1()
	{
		Reporter.log("executeScript1", true);
	}
	
	
}