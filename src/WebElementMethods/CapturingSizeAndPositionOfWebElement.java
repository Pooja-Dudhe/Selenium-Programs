package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingSizeAndPositionOfWebElement {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.meesho.com/");
	WebElement logo=driver.findElement(By.xpath("//img[@alt='Meesho Logo']"));
	Rectangle rectangle = logo.getRect();
	System.out.println("Height:"+rectangle.getHeight());
	System.out.println("Width:"+rectangle.getWidth());
	System.out.println("X coordinate:"+rectangle.getX());
	System.out.println("Y coordinate:"+rectangle.getY());
	
}
}
