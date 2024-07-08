package PopUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToAvoidNotificationPopUps {
public static void main(String[] args) {
	ChromeOptions options=new ChromeOptions();
	//How to use Desired Capabilities
	//https://peter.sh/experiments/chromium-command-line-switches/
	options.addArguments("--disable-notifications");
	//options.addArguments("--incognito");
	//options.addArguments("--disable-popup-blocking");
	WebDriver driver=new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.easemytrip.com/");
}
}
