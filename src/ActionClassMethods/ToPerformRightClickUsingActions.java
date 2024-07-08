package ActionClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformRightClickUsingActions {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(5000);
	WebElement emailTextBox = driver.findElement(By.id("email"));
	
	Actions actions=new Actions(driver);
	actions.contextClick(emailTextBox).perform();
	//actions.moveToElement().contextClick(emailTextBox).perform();
}
}