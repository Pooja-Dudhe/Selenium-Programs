package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {
public static void main(String[] args) {
	//to launch the browser
	WebDriver driver =new ChromeDriver();
	//Options opt=driver.manage();
	//Window win =opt.window();
	//win.maximize();
	
	//to launch the web application
	driver.get("https://www.zomato.com/");
	//optimize code
	driver.manage().window().maximize();
}
}
