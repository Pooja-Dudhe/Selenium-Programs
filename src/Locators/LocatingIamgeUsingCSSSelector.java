package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingIamgeUsingCSSSelector {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.name("q")).sendKeys("iphone 15 plus",Keys.ENTER);
	//driver.findElement(By.partialLinkText("Mobiles")).click();
	//Threads.sleep(5000);
	driver.findElement(By.cssSelector("img[alt='Apple iPhone 15 Plus (Black, 128 GB)']")).click();
}
}
