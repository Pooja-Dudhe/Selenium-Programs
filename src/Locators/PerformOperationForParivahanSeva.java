package Locators;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformOperationForParivahanSeva {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://parivahan.gov.in/parivahan/");
	String parentWindowId = driver.getWindowHandle();
	driver.findElement(By.linkText("Sitemap")).click();
	driver.findElement(By.linkText("Contact Us")).click();
	driver.findElement(By.linkText("NR Services")).click();
	Set<String> allWindowIds = driver.getWindowHandles();
	allWindowIds.remove(parentWindowId);
	for(String windowId:allWindowIds)
	{
		driver.switchTo().window(windowId);
	}
	driver.findElement(By.linkText("Login")).click();
}
}

