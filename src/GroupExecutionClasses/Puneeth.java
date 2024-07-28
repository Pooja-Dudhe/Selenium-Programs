package GroupExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Puneeth {
	@Test(groups="KFI")
	public void executeScript() {
		Reporter.log("Puneeth",true);
		WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.instagram.com/puneethrajkumar.official/?hl=en");
    driver.quit();
	}
}
