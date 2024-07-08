package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyingElementByUsingXpathByIndex {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/cell-phones");
	//driver.findElement(By.partialLinkText("ELECTRONICS")).click();
	//driver.findElement(By.partialLinkText("a[title='Show products in category Cell phones']")).click();
	driver.findElement(By.xpath("(//input[@value=\"Add to cart\"])[2]")).click();
	//System.out.println(price);
}
}
