package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

@FindBy(partialLinkText="Register")
private WebElement registerLink;

@FindBy(partialLinkText="Log in")
private WebElement loginLink;

@FindBy(partialLinkText="Shopping cart")
private WebElement shoppingCartLink;

@FindBy(partialLinkText="Wishlist")
private WebElement wishListLink;

@FindBy(partialLinkText="BOOKS")
private WebElement bookLink;

@FindBy(partialLinkText="COMPUTERS")
private WebElement computersLink;

@FindBy(partialLinkText="ELECTRONICS")
private WebElement electronicsLink;

@FindBy(partialLinkText="APPAREL & SHOES")
private WebElement apparelDownloadsAndShoesLink;

@FindBy(partialLinkText="DIGITAL DOWNLOADS")
private WebElement digitalDownloadsLink;

@FindBy(partialLinkText="JEWELRY")
private WebElement jewelryLink;

@FindBy(partialLinkText="GIFT CARDS")
private WebElement giftCardsLink;

@FindBy(id="small-searchterms")
private WebElement searchBox;

@FindBy(xpath="//input[@value='Search']")
private WebElement searchButton;

/**
	*Getters
**/
/**
 *this method is used to register link
 *@return WebElement
 * **/

public WebElement getRegisterLink() {
	return registerLink;
}




public WebElement getLoginLink() {
	return loginLink;
}




public WebElement getShoppingCartLink() {
	return shoppingCartLink;
}




public WebElement getWishListLink() {
	return wishListLink;
}




public WebElement getBookLink() {
	return bookLink;
}




public WebElement getComputersLink() {
	return computersLink;
}




public WebElement getElectronicsLink() {
	return electronicsLink;
}




public WebElement getApparelDownloadsAndShoesLink() {
	return apparelDownloadsAndShoesLink;
}




public WebElement getDigitalDownloadsLink() {
	return digitalDownloadsLink;
}




public WebElement getJewelryLink() {
	return jewelryLink;
}




public WebElement getGiftCardsLink() {
	return giftCardsLink;
}




public WebElement getSearchBox() {
	return searchBox;
}




public WebElement getSearchButton() {
	return searchButton;
}




public BasePage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
}
