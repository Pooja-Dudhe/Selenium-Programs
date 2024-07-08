package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleChildWindowInSBI {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
	String parentWindowId=driver.getWindowHandle();
	driver.findElement(By.partialLinkText("CONTINUE TO LOGIN")).click();
	driver.findElement(By.partialLinkText("Forgot Username / Login Password")).click();
	Set<String> allWindowIds = driver.getWindowHandles();
	allWindowIds.remove(parentWindowId);
	for(String windowId:allWindowIds) {
		driver.switchTo().window(windowId);
	}
	driver.findElement(By.id("nextStep")).click();
}
}
