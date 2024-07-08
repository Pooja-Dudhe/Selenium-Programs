package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyingElementByDependentAndIndependentXpathInAmazon {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("I Phone 15",Keys.ENTER);
	String price=driver.findElement(By.xpath("//span[text()='iPhone 15 (256 GB) - Green']/../../../..//span[@class='a-price-whole']")).getText();
	System.out.println(price);
}
}
