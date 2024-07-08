package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {
public static void main(String[] args) {
	//to launch the browser
	WebDriver driver =new ChromeDriver();
	//to maximize the window
	driver.manage().window().maximize();
	//to launch the web application
	driver.get("https:/omayo.blogspot.com/");
	//to click on window popup
	driver.findElement(By.linkText("Open a popup window")).click();
	//to close the browser
		driver.close();
		//use quit method
		driver.quit();
}
}
