package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAnElementWithNameAttribute {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/register");
	//WebElement radioButton = driver.findElement(By.name("Gender"));
	//radioButton.click();
	WebElement radioButton = driver.findElement(By.id("gender-female"));
	radioButton.click();
	WebElement fnametextfield = driver.findElement(By.id("FirstName"));
	fnametextfield.sendKeys("Pooja");
	WebElement lnametextfield = driver.findElement(By.id("LastName"));
	lnametextfield.sendKeys("Dudhe");
	WebElement emailtb = driver.findElement(By.id("Email"));
	emailtb.sendKeys("poojadudhe23@gmail.com");
	WebElement password = driver.findElement(By.id("Password"));
	password.sendKeys("Pooja@123");
	WebElement cpassword = driver.findElement(By.id("ConfirmPassword"));
	cpassword.sendKeys("Pooja@123");
	WebElement register = driver.findElement(By.id("register-button"));
	register.click();
}
}
