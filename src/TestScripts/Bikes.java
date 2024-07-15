package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Bikes {
//enabled= false means the that test case will not be considered	
@Test(enabled=false)
public void continentalGT650() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/search?q=continental+gt");
	driver.quit();}

@Test
public void harleyDavidson()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.suzukimotorcycle.co.in/product-details/hayabusa");
	driver.quit();
}
//(to run parallely use threadPoolSize along with invocationCount 0r else 
// threadPoolSize will go in waste) 
//if priorities are same or not given it will work in alphabetical order
//by default invocationCount is 1, if 0 is given it(test case) will not be considered

//@Test(priority = -1, invocationCount = 3 ,threadPoolSize =3)
//public void hayabusa() {
//	WebDriver driver=new ChromeDriver();
	//driver.manage().window().maximize();
	//driver.get("https://www.suzukimotorcycle.co.in/product-details/hayabusa");
	//driver.quit();
//}

//if we use dependsOnMethods it will not consider priority, and will execute the method it is depending on 
@Test(dependsOnMethods = {"harleyDavidson","r15"})
public void bobber42()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.jawamotorcycles.com/motorcycles/42-bobber");
	driver.quit();
}
//Assert.fail()--> we will not be able to proceed further, as we have purposefully failed that test case
//if not loaded in given time (i.e timeOut=8000(8 sec)) then it will be considered as failed
@Test(timeOut=8000)
public void r15()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.yamaha-motor-india.com/yamaha-r15v4.html");
	//Assert.fail();
	driver.quit();
}

}
