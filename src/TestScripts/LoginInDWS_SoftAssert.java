package TestScripts;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginInDWS_SoftAssert {
@Test
public void loginScenario()
{   String expectedTitle = "Demo Web Shop ";
    String expectedLoginPageTitle= "Demo Web Shop. Login";
    SoftAssert softassert = new SoftAssert();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	String actualTitle = driver.getTitle();
	softassert.assertEquals(actualTitle, expectedTitle,"title verification at welcome page");
	driver.findElement(By.partialLinkText("Log in")).click();
	String actualLoginPageTitle = driver.getTitle();
	softassert.assertEquals(actualLoginPageTitle, expectedLoginPageTitle,"title of login Page");
	driver.findElement(By.id("Email")).sendKeys("rsonawane7070@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Renuka@123");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	softassert.assertAll();//mandatory assertAll() at the end
	}
}