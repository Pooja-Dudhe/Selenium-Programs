package ActionClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	WebElement textbox=driver.findElement(By.name("q"));
	
	Actions actions=new Actions(driver);
	//actions.sendKeys(textbox,"Selenium dev").perform();
	actions.moveToElement(textbox).sendKeys("selenium").perform();
	//actions.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
	//actions.keyUp(Keys.ENTER).perform();
	}
}