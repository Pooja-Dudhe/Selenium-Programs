package WebDriverMethods;import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPositionOfTheWebPage {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		Point p= driver.manage().window().getPosition();
		System.out.println(p.getX());
		System.out.println(p.getY());
	}

}
