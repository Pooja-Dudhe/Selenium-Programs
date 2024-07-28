package batchExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//if we want to run all the classes one by one then we go for Batch Execution
//To run Batch Execution, select all the files and right click
//And click on convert to TestNG
// Then give the name file /automation/"filename".xml
//it will generate a file in test-output folder
//now click on BatchExecution.xml file and click on run button
public class Hayabusa {
	@Test
	public void hayabusa() {
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.suzukimotorcycle.co.in/product-details/hayabusa");
    driver.quit();
	}
	@Test
	public void harleyDavidson()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.harley-davidson.com/in/en/index.html");
		driver.quit();
	}
}

