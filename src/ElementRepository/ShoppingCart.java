package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCart extends BasePage  {
 
	
	public ShoppingCart(WebDriver driver) {
		super(driver);
		
		
	}
	@FindBy(xpath="//td[@class='product']/..//a[text()='Smartphone']")private WebElement productDetails;
	
	public WebElement getProductDetails() {
		String product=productDetails.getText();
		
		if(product.equals("Smartphone"))
		{
			System.out.println(true);
		}
		return productDetails;
	}
	
	
}