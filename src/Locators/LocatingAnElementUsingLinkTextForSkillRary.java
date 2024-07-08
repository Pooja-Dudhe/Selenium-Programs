package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAnElementUsingLinkTextForSkillRary {
public static void main(String[] args){
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.skillrary.com/");
	//driver.findElement(By.linkText("ENGLISH")).click();
	//driver.close();
	driver.findElement(By.partialLinkText("ENGLISH")).click();
}
}
