package ActionClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ToPerformSrollingByUsingScrollFromOrigin {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/");
	WebElement resumeWriting = driver.findElement(By.xpath("//span[text()='Resume writing']"));
	
	Actions actions=new Actions(driver);
	//ScrollOrigin sc=ScrollOrigin.fromElement(resumeWriting);//(check for corrections)
	//actions.scrollFromOrigin(ScrollOrigin.fromElement(sc), 0, 200).perform();
	actions.scrollFromOrigin(ScrollOrigin.fromElement(resumeWriting), 0, 200).perform();
	driver.findElement(By.xpath("//span[text()='Got it']")).click();
}
}
