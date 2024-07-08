package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyingElementUsingXpathByUsingDependantAndIndependantAndIndexingUniquely {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.name("q")).sendKeys("I Phone 15",Keys.ENTER);
	//driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Green, 256 GB)']/../../..//div[contains(text(),'₹')]")).click();
	//by index, we get 1 0f 1(uniquely)
	driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Green, 256 GB)']/../..//div[contains(text(),'₹')][1]")).click();
	//String price=driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Green, 256 GB)']/../../..//div[contains(text(),'₹')]")).getText();
	//System.out.println(price);
}
}
