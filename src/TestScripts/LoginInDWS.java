package TestScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
//@SuppressWarnings
public class LoginInDWS {
@Test
public void loginScenario()
{
	String expectedTitle = "Demo Web Shop:";
	String expectedLoginPageTitle="Demo Web Shop.Login ";//puposefully given wron title by introducing space
	SoftAssert softassert = new SoftAssert();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	String actualTitle=driver.getTitle();
	//Assert.assertEquals(actualTitle, expectedTitle,"title verification at welcome page");
	softassert.assertEquals(actualTitle, expectedTitle,"title verification at welcome page");
	driver.findElement(By.partialLinkText("Log in")).click();
	String actualLoginPageTitle=driver.getTitle();
	//Hard Assert or "Assert"
	//Assert.assertEquals(actualLoginPageTitle,expectedLoginPageTitle,"title of Login Page");
	//Soft Assert
	
	softassert.assertEquals(actualLoginPageTitle,expectedLoginPageTitle,"title of Login Page");
	driver.findElement(By.id("Email")).sendKeys("poojadudhe23@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Pooja@123");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	//mandatory to use assertAll while using SoftAssert
	//all the failures will be recorded and given at the last after we use assertAll
	softassert.assertAll();
}
}
