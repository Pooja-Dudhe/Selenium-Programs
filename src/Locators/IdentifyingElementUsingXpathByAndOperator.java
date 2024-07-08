package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyingElementUsingXpathByAndOperator {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/register");
	//driver.findElement(By.xpath("//input[@name='Gender' and @value='M']")).click();
	driver.findElement(By.xpath("//input[@name='Gender' and @value='F']")).click();
}
}
