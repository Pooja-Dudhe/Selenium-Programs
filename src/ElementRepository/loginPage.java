package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends BasePage{

	public loginPage(WebDriver driver) {
		super(driver);
	}
	
		@FindBy(id="Email") private WebElement emailTB;
		@FindBy(id="Password") private WebElement passwordTB;
		@FindBy(id="RememberMe") private WebElement rememberPwdLink;
		@FindBy(partialLinkText="Forgot password?") private WebElement forgotPwdLink;
		@FindBy(xpath="//input[@value='Log in']") private WebElement loginBtn;
		
		public WebElement getEmailTB() {
			return emailTB;
		}
		public WebElement getPasswordTB() {
			return passwordTB;
		}
		public WebElement getRememberPwdLink() {
			return rememberPwdLink;
		}
		public WebElement getForgotPwdLink() {
			return forgotPwdLink;
		}
		public WebElement getLoginBtn() {
			return loginBtn;
		}
		
		
		
	}