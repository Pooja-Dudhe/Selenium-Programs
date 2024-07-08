package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyinfAnElemtUsingRelativeXpathbyText {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();//method chaining
	driver.get("https://www.flipkart.com/");
	
	driver.findElement(By.xpath("//span[text()='Mobiles']")).click();
	//by using . (if anchor tag is there)
	//driver.findElement(By.xpath("//a[.='Mobiles']")).click();

}
}
