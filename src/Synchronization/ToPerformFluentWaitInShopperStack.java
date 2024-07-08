package Synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class ToPerformFluentWaitInShopperStack {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	FluentWait fluentwait = new FluentWait(driver);
	fluentwait.pollingEvery(Duration.ofMillis(250));
	fluentwait.ignoring(NoSuchElementException.class);
	fluentwait.withTimeout(Duration.ofSeconds(15));
	fluentwait.until(ExpectedConditions.alertIsPresent());
}
}
