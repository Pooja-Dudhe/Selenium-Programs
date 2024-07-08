package WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeOfTheWebPage {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		 Dimension d= driver.manage().window().getSize();
		System.out.println("Height:"+d.getHeight());
		System.out.println("Width:"+d.getWidth());
				
	}

}
