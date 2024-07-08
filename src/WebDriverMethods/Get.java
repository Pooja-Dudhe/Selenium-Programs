package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get {
	public static void main(String[] args) {
		//to launch the browser
		WebDriver driver =new ChromeDriver();
		//to launch the web application
		driver.get("https://www.zomato.com/");
	}
	

}
