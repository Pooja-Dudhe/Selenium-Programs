package ActionClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformDragAndDropByNegative {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.paiinternational.in/shop/categories/accessories/");
	WebElement slider1 = driver.findElement(By.xpath("//span[contains(@class,'irs-slider to')]"));
	
	Actions actions=new Actions(driver);
	Thread.sleep(5000);
	actions.dragAndDropBy(slider1,-30,0).perform();
	Thread.sleep(5000);
	actions.dragAndDropBy(slider1,30,0).perform();

}
}
