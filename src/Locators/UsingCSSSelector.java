package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCSSSelector {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("pooja12@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("Pooja@123");
	driver.findElement(By.cssSelector("button[data-testid='royal_login_button']")).click();
}
}
