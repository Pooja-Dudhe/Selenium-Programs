package SelectClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PerformSelectInStaticDropDown {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/signup");
     WebElement monthDropDown = driver.findElement(By.id("month"));
     Select select = new Select(monthDropDown);
     System.out.println(select.isMultiple());
     select.selectByIndex(2);//march
     Thread.sleep(3000);
     select.selectByValue("4");//april
     Thread.sleep(3000);
     select.selectByVisibleText("Oct");//oct
}
}
