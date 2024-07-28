package GenericUtils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass1 {
	public WebDriver driver;
	@BeforeSuite
	public void beforeSuite() {
	Reporter.log("Before Suite",true);
	}
	@BeforeTest
	public void beforeTest() {
		Reporter.log("Before Test",true);
	}
	@Parameters("bname")
	@BeforeClass
	public void launchingBrowser(String browserName) {
		Reporter.log("Before Class",true);
		if (browserName.equalsIgnoreCase("chrome")) 
		{
		driver=new ChromeDriver();	
		}
		else if (browserName.equalsIgnoreCase("firefox")) 
		{
		driver = new FirefoxDriver();
			
		}
		else if(browserName.equalsIgnoreCase("edge")) 
		{
			driver = new EdgeDriver();
		}
		else 
		{
			Reporter.log("Invalid Browser Name");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("Before Method",true);
	}
	
	
	@AfterSuite
	public void afterSuite() {
		Reporter.log("After Suite",true);
	}
	@AfterTest
	public void afterTest() {
		Reporter.log("After Test",true);
	}
	@AfterClass
	public void tearDownBrowser() {
		Reporter.log("After Class",true);
		driver.close();
		driver.quit();
		
	}
	
	@AfterMethod
	public void afterMethod() {
		Reporter.log("After Method",true);
	}
	
}
