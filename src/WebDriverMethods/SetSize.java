package WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().setSize(new Dimension(100,500));
	
}
}
