package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToAutomatePrompPopUpInW3C {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
	WebElement frame = driver.findElement(By.id("iframeResult"));
	driver.switchTo().frame(frame);
	//driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();//xpath by attribute
	driver.findElement(By.xpath("//button[text()='Try it']")).click();//xpath by text
	//driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();//xpath by contains using text
	//driver.findElement(By.xpath("//button[contains(@onclick,'A')]")).click();//xpath by contains using attribute
	Alert alert = driver.switchTo().alert();
	String info = alert.getText();//capturing info in alert
	System.out.println(info);
	alert.sendKeys("Pooja Dudhe");
	Thread.sleep(4000);
	alert.accept();
	//if not switch back to default content we 'll get NoSuchElementException
	driver.switchTo().defaultContent();
	driver.findElement(By.id("tryhome")).click();
	//press on ok
	//alert.dismiss();//press on ok
	//driver.switchTo().defaultContent();
}
}
