package SelectClassMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PerformSelectInStaticDropdownUsingGetOptions {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/signup");
     WebElement monthDropDown = driver.findElement(By.id("month"));
     Select select = new Select(monthDropDown);
     List<WebElement> options = select.getOptions();
     System.out.println(options.size());
     for(WebElement option:options) 
     {
    	System.out.println(option.getText());
    	select.selectByVisibleText(option.getText()) ;
    	Thread.sleep(3000);
     }
     
}
}
