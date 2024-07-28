package TestScripts;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginInDWS_HardAssert {
@Test
public void loginScenario()
{   String expectedTitle = "Demo Web Shop";
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	String actualTitle = driver.getTitle();
	Assert.assertEquals(actualTitle, expectedTitle,"title verification at welcome page");
	driver.findElement(By.partialLinkText("Log in")).click();
	}
}