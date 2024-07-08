package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUIOfAFacebook {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement emailTextBox=driver.findElement(By.id("email"));
	WebElement passwordTextBox = driver.findElement(By.id("passContainer"));
	Rectangle email = emailTextBox.getRect();
	Rectangle password = passwordTextBox.getRect();
	System.out.println(email.getHeight()+" "+password.getHeight());
	System.out.println(email.getWidth()+" "+password.getWidth());
	System.out.println(email.getX()+" "+password.getX());
	System.out.println(email.getY()+" "+password.getY());
	System.out.println("gap:"+(password.getY()-(email.getY()+email.getHeight())));
}
}
