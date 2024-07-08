package PopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleNotificationPopUps {
public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.easemytrip.com/");
	Thread.sleep(2000);
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_TAB);//will go to close button
	robot.keyPress(KeyEvent.VK_TAB);//will go to allow button
	robot.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_ENTER);//to click on allow button
	robot.keyRelease(KeyEvent.VK_ENTER);//mandatory to release
	
	
} 
}
