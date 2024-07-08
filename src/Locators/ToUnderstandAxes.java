package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandAxes {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Desktop/HTML/XpathbyAxes.html");
		String text =driver.findElement(By.xpath("//div[@class='Mammals']/parent::div")).getText();
		System.out.println(text);
		String text1 =driver.findElement(By.xpath("//div[@class='Mammals']/child::div[@class='Carnivore']")).getText();
		System.out.println(text1);
		//second way (use /child or/div)
		String text5 =driver.findElement(By.xpath("//div[@class='Mammals']/div[@class='Carnivore']")).getText();
		System.out.println(text5);
		String text2 =driver.findElement(By.xpath("//div[@class='Mammals']/ancestor::div[@class='Animal']")).getText();
		System.out.println(text2);
		String text3 =driver.findElement(By.xpath("//div[@class='Mammals']/descendant::div[@class='Tiger']")).getText();
		System.out.println(text3);
		//second way (use/descendant or //div to traverse)
		String text4 =driver.findElement(By.xpath("//div[@class='Mammals']//div[@class='Tiger']")).getText();
		System.out.println(text4);
		
		
	}

}
