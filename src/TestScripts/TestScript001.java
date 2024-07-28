package TestScripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericUtils.BaseClass2;

public class TestScript001 extends BaseClass2 {
@Test
public void executeScript1() {
	Reporter.log("executeScript1",true);
}
@Test
public void executeScript2() {
	Reporter.log("executeScript2",true);
}
}
