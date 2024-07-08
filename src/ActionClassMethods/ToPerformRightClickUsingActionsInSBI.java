package ActionClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformRightClickUsingActionsInSBI {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
	WebElement link = driver.findElement(By.partialLinkText("Contact Us"));
	
	Actions actions=new Actions(driver);
	//actions.contextClick(link).perform();
	actions.moveToElement(link).contextClick().perform();
}
}
