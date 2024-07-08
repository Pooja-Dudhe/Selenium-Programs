package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByDescendantInDemoWeb {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/register");
	driver.findElement(By.xpath("//strong[text()='Your Personal Details']/ancestor::div[@class='fieldset']/descendant::input[@id='FirstName']")).sendKeys("Pooja");
}
}
