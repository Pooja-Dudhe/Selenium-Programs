package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToAutomatePromptPopUpInOmayo {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("http://omayo.blogspot.com/");
	driver.findElement(By.id("prompt")).click();
	
	Alert alert = driver.switchTo().alert();
	
	String info = alert.getText();//capturing info in alert
	System.out.println(info);
	alert.sendKeys("Pooja");
	Thread.sleep(4000);
	alert.accept();//press on ok
	//alert.dismiss();//press on ok
}
}
