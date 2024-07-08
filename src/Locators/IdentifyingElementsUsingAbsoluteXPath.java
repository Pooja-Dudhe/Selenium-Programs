package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyingElementsUsingAbsoluteXPath {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.id("Email")).sendKeys("Pooja12@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Pooh");
		driver.findElement(By.className("login-button")).click();
	}

}
