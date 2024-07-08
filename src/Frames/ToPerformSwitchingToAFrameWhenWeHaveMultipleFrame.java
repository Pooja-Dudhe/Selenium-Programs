package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformSwitchingToAFrameWhenWeHaveMultipleFrame {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.get("https://www.speedtest.net/");
	driver.findElement(By.xpath("//button[text()='Continue']")).click();	
	driver.switchTo().frame(1);
	//driver.findElement(By.xpath("//img[@class='img_ad']")).click();//1 of 5 and doesnt work
	driver.findElement(By.id("cbb")).click();	
}
}
