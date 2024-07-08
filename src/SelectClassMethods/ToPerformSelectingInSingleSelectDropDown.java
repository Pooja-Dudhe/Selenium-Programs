package SelectClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToPerformSelectingInSingleSelectDropDown {
public static void main(String[] args) throws InterruptedException {
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/signup");
     WebElement yearDropDown = driver.findElement(By.id("year"));
     Select select = new Select(yearDropDown);
     System.out.println(select.isMultiple());
     select.selectByIndex(1);;
     Thread.sleep(3000);
     select.selectByValue("2005");
     Thread.sleep(3000);
     select.selectByVisibleText("2010");
}

}

