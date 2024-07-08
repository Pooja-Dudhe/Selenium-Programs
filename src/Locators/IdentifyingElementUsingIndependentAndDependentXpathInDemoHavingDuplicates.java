package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyingElementUsingIndependentAndDependentXpathInDemoHavingDuplicates {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.partialLinkText("COMPUTERS")).click();
	driver.findElement(By.partialLinkText("Desktops")).click();
	driver.findElement(By.xpath("//a[text()='Build your own expensive computer']/../..//input[@value='Add to cart']")).click();
}
}
