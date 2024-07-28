package crossBrowserExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BMW {
	/*
	 * First select both classes and convert them to TestNG
	 * And name the file as crossBrowserExecution.xml
	 * And add parameter tag with name ="bname",value="chrome"
	 * And then come to class BMW and JavaTPoint
	 * And add annotation  @Parameters("bname")
	 * Now goto crossBrowserExecution.xml and click on run button
	 */
	@Parameters("bname")
 	@Test
	public void bmw(@Optional("chrome")String browserName) {
	WebDriver driver=null;	
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
	driver.get("https://www.bmw-motorrad.in/en/home.html#/filter-all");
	driver.quit();
		}
		
	}

