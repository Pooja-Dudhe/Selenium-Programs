package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyingElementUsingLogicalOrInXpathInDemo {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/register");
	//It will show 1 of 2 but always give priority to first element by default as it is 'or'
	driver.findElement(By.xpath("//input[@id='gender-male' or @id='gender-female']")).click();
}
}
