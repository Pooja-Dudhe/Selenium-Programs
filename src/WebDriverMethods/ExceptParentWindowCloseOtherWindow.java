package WebDriverMethods;

import java.util.Set;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptParentWindowCloseOtherWindow {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		//String parentWindowId = driver.getWindowHandle();
		//Opening a New Tab
		driver.switchTo().newWindow(WindowType.TAB);
		//navigate to swiggy
		driver.get("https://www.swiggy.com/");
		//opening a new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		//navigate to flipkart
		driver.get("https://www.flipkart.com/");
		//capture all the windowIds using getWindowHandles
		Set<String> allWindowIds = driver.getWindowHandles();
		System.out.println(allWindowIds);
		for(String windowId:allWindowIds)
		{
			driver.switchTo().window(windowId);
			if(!(driver.getTitle().equals("zomato")))
			{
				driver.close();
			}
		}
		
	}

}
