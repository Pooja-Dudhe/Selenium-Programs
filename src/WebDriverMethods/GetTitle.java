package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	public static void main(String[] args) {
		//to launch a browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//to launch the web application
		driver.get("https://www.swiggy.com/");
		
		//to get the title of the web page application
		String actualTitle=driver.getTitle();
		System.out.println("Title is :"+actualTitle);
		String expectedTitle="Order Food Online from India's Best Food Delivery Service | Swiggy";
		//System.out.println("Title is:"+actualTitle);
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title is correct");
		}
		else
		{
			System.out.println("Title is not correct");
		}
	}

}
