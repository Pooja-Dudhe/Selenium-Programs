package WebDriverMethods;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitAndClose {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/www.yamaha-motor-india.com/");
		String parentWindowId=driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://cadburygifting.in/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.nestle.in/");
		driver.switchTo().window(parentWindowId);
		driver.close();
		Thread.sleep(2000);
		driver.quit();
	}

}

