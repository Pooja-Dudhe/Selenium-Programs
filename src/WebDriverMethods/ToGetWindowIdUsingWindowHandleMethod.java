package WebDriverMethods;

import java.util.Set;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetWindowIdUsingWindowHandleMethod {
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		String expectedUrl="https://www.nestle.in/";
		driver.get("https://www.yamaha-motor-india.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://cadburygifting.in/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.nestle.in/");
		Set<String> allwindowIds=driver.getWindowHandles();
		System.out.println(allwindowIds);
		for(String windowId : allwindowIds) {
		Thread.sleep(4000);
		driver.switchTo().window(windowId);
		if (driver.getCurrentUrl().equals(expectedUrl)) {
			driver.close();
			break;
		}
		}
	}

}
