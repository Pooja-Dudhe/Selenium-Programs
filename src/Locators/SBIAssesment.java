package Locators;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBIAssesment {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
	String parentWindowId=driver.getWindowHandle();
	driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
	driver.findElement(By.partialLinkText("Forgot Username / Login Password")).click();
	Set<String> allWindowIds = driver.getWindowHandles();
	//System.out.println(allWindowIds);
	allWindowIds.remove(parentWindowId);
	for(String windowId: allWindowIds)
	{
		driver.switchTo().window(windowId);
	}
	driver.findElement(By.id("nextStep")).click();
	driver.findElement(By.id("")).sendKeys();
	driver.findElement(By.id("")).sendKeys();
	driver.findElement(By.id("")).sendKeys();
	driver.findElement(By.id("")).sendKeys();
	driver.findElement(By.id("")).click();
}
}
