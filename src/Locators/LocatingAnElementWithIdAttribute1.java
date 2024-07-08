package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAnElementWithIdAttribute1 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement passwordTextBox = driver.findElement(By.id("pass"));
	passwordTextBox.sendKeys("Pooja");
	
}
}
