package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToAvoidFileUploadPopUp {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
	driver.get("https://www.ilovepdf.com/pdf_to_word");
	driver.findElement(By.xpath("//input[@type='file']")).
	sendKeys("C:\\Users\\User\\Downloads\\Admit Card.pdf");
}
}
