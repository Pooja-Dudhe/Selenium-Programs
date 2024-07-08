package JavaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformScrollByJavaScriptExecuter {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.zomato.com/");
	//go to console
	//window.scrollTo(0,500)//it will scroll from origin
	//window.scrollBy(0,800)//it will scroll from the point where we have scrolled
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,800)");
	js.executeScript("window.scrollBy(0,-500)");//will scroll from where we left
	js.executeScript("window.scrollTo(0,500)");//will always scroll from origin or starting point
}
}
