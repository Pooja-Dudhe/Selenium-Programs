package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author renu1
 *
 */
public class BasePage {
   @FindBy(partialLinkText="Register")
   private WebElement registerLink;
   
   @FindBy(partialLinkText="Log in")
   private WebElement loginLink;
   
   @FindBy(partialLinkText="Shopping cart")
   private WebElement shoppingCartLink;
   
   @FindBy(partialLinkText="Wishlist")
   private WebElement wishlistLink;
   
   @FindBy(id="small-searchterms")
   private WebElement searchBoxLink;
   
   @FindBy(xpath="//input[@value='Search']")
   private WebElement searchButtonLink;
   
   @FindBy(partialLinkText = "BOOKS")
   private WebElement booksLink;
   
   @FindBy(partialLinkText = "COMPUTERS")
   private WebElement computersLink;
   
   @FindBy(partialLinkText = "ELECTRONICS")
   private WebElement electronicsLink;
   
   @FindBy(partialLinkText = "APPAREL & SHOES")
   private WebElement appareAndShoesLink;
   
   @FindBy(partialLinkText = "DIGITAL DOWNLOADS")
   private WebElement digitalDownloadslink;
   
   @FindBy(partialLinkText = "JEWELRY")
   private WebElement jewelryLink;
   
   @FindBy(partialLinkText = "GIFT CARDS")
   private WebElement giftCardsLink;
   
   @FindBy(partialLinkText = "Log out")
   private WebElement logoutLink;
   
   
   /**
    * Getters
    */
   
   /**
    * 
    * This is getRegisterLink method
    * 
    * ReturnType:webelement
    */
   public WebElement getRegisterLink() {
	return registerLink;
}

public WebElement getLoginLink() {
	return loginLink;
}


public WebElement getShoppingCartLink() {
	return shoppingCartLink;
}


public WebElement getWishlistLink() {
	return wishlistLink;
}


public WebElement getSearchBoxLink() {
	return searchBoxLink;
}


public WebElement getSearchButtonLink() {
	return searchButtonLink;
}


public WebElement getBooksLink() {
	return booksLink;
}


public WebElement getComputersLink() {
	return computersLink;
}


public WebElement getElectronicsLink() {
	return electronicsLink;
}


public WebElement getAppareAndShoesLink() {
	return appareAndShoesLink;
}


public WebElement getDigitalDownloadslink() {
	return digitalDownloadslink;
}


public WebElement getJewelryLink() {
	return jewelryLink;
}


public WebElement getGiftCardsLink() {
	return giftCardsLink;
}
public WebElement getlogoutLink() {
	return logoutLink ;
}
public BasePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);	
	}

	
}