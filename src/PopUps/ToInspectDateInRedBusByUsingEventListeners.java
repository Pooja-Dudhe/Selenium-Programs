package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToInspectDateInRedBusByUsingEventListeners {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions options=new ChromeOptions();
	//How to use Desired Capabilities
	//https://peter.sh/experiments/chromium-command-line-switches/
	options.addArguments("--disable-notifications");
	//options.addArguments("--incognito");
	WebDriver driver=new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("https://www.redbus.in/");
	driver.findElement(By.xpath("//span[text()='Date']")).click();
	driver.findElement(By.xpath("//span[text()='5']")).click();
}
}
