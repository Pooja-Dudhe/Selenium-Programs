package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyingElementsUsingDependentAndIndependentXpathInDEnoHavingDuplicates1 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.partialLinkText("ELECTRONICS")).click();
	driver.findElement(By.partialLinkText("Cell phones")).click();
	driver.findElement(By.xpath("//a[text()='Phone Cover']/../../..//input[@value='Add to cart']")).click();
}
}
