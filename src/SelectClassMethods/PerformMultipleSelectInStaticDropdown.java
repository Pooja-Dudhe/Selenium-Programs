package SelectClassMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PerformMultipleSelectInStaticDropdown {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoapp.skillrary.com/");
	     WebElement dropDown = driver.findElement(By.id("cars"));
	     Select select = new Select(dropDown);
	     System.out.println(select.isMultiple());
	     
	     //select.selectByIndex(2);//INR 100 - INR 199 ( 16 ) 
	     //Thread.sleep(3000);
	     //select.selectByValue("90");//Free ( 90 ) 
	     //Thread.sleep(3000);
	     //select.selectByVisibleText("INR 300 - INR 399 ( 1 ) ");
	      List<WebElement> options= select.getOptions();
	      for(WebElement option:options) {
	    	  select.selectByValue(option.getAttribute("value"));
	      }
	      Thread.sleep(3000);
	      select.deselectByIndex(0);
	      Thread.sleep(3000);
	      select.deselectByVisibleText("INR 100 - INR 199 ( 16 )");
	      Thread.sleep(3000);
	      select.deselectByValue("399");
	      Thread.sleep(3000);
	     // select.deselectAll();
	      //By Using getAllSelectedOptions() method
	      List<WebElement> selectedOptions = select.getAllSelectedOptions();
	      for(WebElement selectedOption:selectedOptions)
	      {
	    	  System.out.println(selectedOption.getText());
	      }
	      
	     
	}
}
