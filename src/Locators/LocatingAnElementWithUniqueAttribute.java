package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAnElementWithUniqueAttribute {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		WebElement fnametextfield = driver.findElement(By.id("FirstName"));
		fnametextfield.sendKeys("Pooja Dudhe");
	}

}
