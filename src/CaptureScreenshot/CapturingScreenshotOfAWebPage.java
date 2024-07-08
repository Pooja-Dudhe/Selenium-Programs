package CaptureScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CapturingScreenshotOfAWebPage {
public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.primevideo.com/");
	LocalDateTime ldt=LocalDateTime.now();
	System.out.println(ldt);
	String time=ldt.toString().replace(":", "-");
	TakesScreenshot ts= (TakesScreenshot) driver;
	File screenshot = ts.getScreenshotAs(OutputType.FILE);
	//File dest = new File("C:\\Users\\User\\Desktop\\image.png");
	//if we run the program it will overwrite the file, to avoid that we save it in eclipse 
	//File dest = new File("C:\\Users\\User\\eclipse-workspace\\Automation\\Screenshot\\image.png");
	//in different system to access a file following syntax can be used (.\\ or ./ indicates parent)
	File dest = new File(".\\Screenshot\\image"+time+".png");
	FileHandler.copy(screenshot,dest);
	
}
}
