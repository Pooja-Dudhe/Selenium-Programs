package dataDrivenTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToRegisterIndDemoWebShop {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	String sheetname="RegisterdCredentials";
	String firstName=ExcelUtility.readDataFromExcel(sheetname, 1, 0);
	String lastName=ExcelUtility.readDataFromExcel(sheetname, 1, 1);
	String email=ExcelUtility.readDataFromExcel(sheetname, 1, 2);
	String password=ExcelUtility.readDataFromExcel(sheetname, 1, 3);
	driver.findElement(By.partialLinkText("Register")).click();
	driver.findElement(By.id("gender-male")).click();
	driver.findElement(By.id("FirstName")).sendKeys(firstName);
	driver.findElement(By.id("LastName")).sendKeys(lastName);
	driver.findElement(By.id("Email")).sendKeys(email);
	driver.findElement(By.id("Password")).sendKeys(password);
	driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
	driver.findElement(By.id("register-button")).click();
}
}
