package Locators;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MockClickOnClickMe
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Downloads/Assessment1.html");
		driver.findElement(By.xpath( "//button[text()=' Click Me !!!']")).click();
		//driver.findElement(By.xpath( "//button[@onclick=\"openAllWindows()\"]")).click();
		Set<String> allwindowIds=driver.getWindowHandles();
		System.out.println(allwindowIds);
		for(String windowId : allwindowIds)
		{
				Thread.sleep(4000);
				driver.switchTo().window(windowId);
				String actualTitle=driver.getTitle();
		if (driver.getTitle().equals("BurgerKing India | Online ordering"))
		{ 
			System.out.println(actualTitle);	
			driver.close();
		}
		}
	}
}