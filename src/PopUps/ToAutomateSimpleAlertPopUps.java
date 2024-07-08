package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToAutomateSimpleAlertPopUps {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
	Actions actions = new Actions(driver);
	actions.contextClick().perform();
	Alert alert = driver.switchTo().alert();
	String info = alert.getText();//capturing info in alert
	System.out.println(info);
	Thread.sleep(4000);
	alert.accept();//press on ok
	//alert.dismiss();//press on ok
	
}
}
