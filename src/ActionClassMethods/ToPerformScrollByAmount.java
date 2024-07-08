package ActionClassMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformScrollByAmount {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.meesho.com/");

	Actions actions=new Actions(driver);
	actions.scrollByAmount(0, 15000).perform();
	Thread.sleep(3000);
	actions.scrollByAmount(0, -15000).perform();
}
}
