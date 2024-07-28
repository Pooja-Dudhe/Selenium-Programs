package GroupExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VickyKaushal {
	/** 
	 * syntax for group execution
	 * we can either include or exclude the group accordingly
	 * <groups>
		<run>
		    <include name="Bollywood"></include>
			<include name="KFI"></include>
			//<exclude name="Pan India"></exclude>
			</run>
			</groups>
	 */
	@Test(groups="Bollywood")
	public void executeScript() {
		Reporter.log("Vicky",true);
		WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.instagram.com/vickykaushal09/?hl=en");
    driver.quit();
	}
}
