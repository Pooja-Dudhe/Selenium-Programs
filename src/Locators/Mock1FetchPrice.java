package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mock1FetchPrice {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("I Phone 15");
	driver.findElement(By.id("nav-search-submit-button")).click();
	driver.findElement(By.xpath("//span[contains(text(),'iPhone 15 (128 GB) - Blue')]/../../../..//button")).click();
	//String price=driver.findElement(By.xpath("//span[contains(text(),'iPhone 15 (128 GB) - Blue')]/../../../..//span[@class='a-price-whole']")).getText();
	//System.out.println(price);
	//dont use price as it might change in future, go with some text while fetching price
	//avoid duplicates
	//use contains if text is changing in span tag
	//String price=driver.findElement(By.xpath("//span[text()='iPhone 15 Plus (128 GB) - Green']/../../../..//span[@class='a-price-whole']")).getText();
	//System.out.println(price);
}
}
