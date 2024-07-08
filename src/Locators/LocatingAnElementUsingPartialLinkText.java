package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAnElementUsingPartialLinkText {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	//driver.findElement(By.partialLinkText("Books\r\n"
		//	+ "        ")).click();
	driver.findElement(By.linkText("Books")).click();
	//Thread.sleep(4000);
	//driver.close();
}

}
