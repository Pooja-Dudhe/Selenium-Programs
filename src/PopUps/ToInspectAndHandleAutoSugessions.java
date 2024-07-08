package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToInspectAndHandleAutoSugessions {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.name("q")).sendKeys("I phone 15");
	Thread.sleep(3000);
	//1. right click on search bar and inspect it.
	//we will not be able to inspect it as the elements will not be present 
	//so we go to Event Listeners and go to blur and click on all 'remove' button 
	//similarly we go to focus and click on all 'remove'button
	//now again we go to search bar and inspect it all the elements will be present and inspectable
	//now after sending keys "I phone 15" it will give suggession (called as auto sugessions)
	//we will not be able to inspect this auto sugessions if we right click on them and try to inspect
	//now again right click on search bar and inspect 
	//now go to source and click on pause scrip execution, it will freeze the screen
	// now you can inspect auto suggessions in "paused in debugger mode"
	driver.findElement(By.xpath("//div[text()='i phone 15 pro']")).click();

}
}
