package JavaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPassDataIntoDisableTextBox {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demoapp.skillrary.com/");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	WebElement disableTextBox = driver.findElement(By.xpath("//b[text()='Become a Subscriber']/../../..//input[@class='form-control']"));
	//go to console 
	//var arguments=document.getElementsByClassName("form-control")
	//arguments[1].value="Pooja"
	js.executeScript("arguments[0].value='Pooja'",disableTextBox);
	//WebElement link = driver.findElement(By.partialLinkText("selenium"));
	//js.executeScript("arguments[0].click()", link);
	
}
}
