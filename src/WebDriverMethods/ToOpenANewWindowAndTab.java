package WebDriverMethods;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenANewWindowAndTab {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.yamaha-motor-india.com");
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.switchTo().newWindow(WindowType.TAB);
}
}
