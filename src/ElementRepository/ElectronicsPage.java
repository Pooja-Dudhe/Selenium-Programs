package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElectronicsPage extends BasePage {

	public ElectronicsPage(WebDriver driver) 
	{
		super(driver);
	}
	@FindBy(partialLinkText="Camera, photo") private WebElement cameraAndPhotoLink;
	@FindBy(partialLinkText="Cell phones") private WebElement cellPhoneLink;
	@FindBy(partialLinkText="Smartphone") private WebElement smartPhoneLink;
	@FindBy(id="add-to-cart-button-43") private WebElement addToCartBtn;
	public WebElement getCameraAndPhotoLink() {
		return cameraAndPhotoLink;
	}
	public WebElement getCellPhoneLink() {
		return cellPhoneLink;
	}
	public WebElement getSmartPhoneLink() {
		String phone=smartPhoneLink.getText();
		return smartPhoneLink;
	}
	public WebElement getAddToCartBtn() {
		return addToCartBtn;
	}
	
	
	
	
}