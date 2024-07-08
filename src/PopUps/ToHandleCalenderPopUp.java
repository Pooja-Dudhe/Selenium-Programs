package PopUps;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleCalenderPopUp {
public static void main(String[] args) {
	LocalDateTime ldt=LocalDateTime.now();
	int date=ldt.getDayOfMonth();
	String month=ldt.getMonth().toString().toLowerCase();
	month=month.replace(month.charAt(0), (char)(month.charAt(0)-32));
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.redbus.com/");
	driver.findElement(By.xpath("//button[text()='Okay']")).click();
	driver.findElement(By.id("date-box")).click();
	//String locator="//div[text()='July']/../..//span[text()='19']";
	//To change date or month we will go with dynamic xpath
	//driver.findElement(By.xpath("//div[text()='"+month+"']/../..//span[text()='"+date+"']"));
	String locator="//div[text()='"+month+"']/../..//span[text()='"+date+"']";
	//System.out.println(locator);
	driver.findElement(By.xpath(locator)).click();
	
	
	
}
}
