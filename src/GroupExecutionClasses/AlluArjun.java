package GroupExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AlluArjun {
	@Test(groups={"TFI","Pan India"})
	public void executeScript() {
		Reporter.log("Arjun",true);
		WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.instagram.com/alluarjunonline/?hl=en");
    driver.quit();
	}
}
