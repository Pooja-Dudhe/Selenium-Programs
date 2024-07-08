package WebDriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethodUsingURLClass {
public static void main(String[] args) throws MalformedURLException, InterruptedException
{
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(4000);
	URL url=new URL("https://www.zomato.com");
	driver.navigate().to(url);
}
}
