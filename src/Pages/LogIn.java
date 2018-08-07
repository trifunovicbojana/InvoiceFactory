package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogIn extends PageObject {
	@FindBy(id = "login-form-email")
	WebElement email;

	@FindBy(id = "login-pass")
	WebElement password;

	@FindBy(className = "v-btn__content")
	WebElement login;

	@FindBy(xpath = "//div[@class='v-messages__message' and string()='The email field is required.']")
	WebElement emailRequired;

	@FindBy(xpath = "//div[@class='v-messages__message' and string()='The password field is required.']")
	WebElement passwordRequired;

	@FindBy(xpath = "//div[@class='v-messages__message' and string()='The password field must be at least 6 characters.']")
	WebElement passwordChar6;

	@FindBy(xpath = "//div[@class='v-messages__message' and string()='The email field must be a valid email.']")
	WebElement invalidEmail;

	@FindBy(xpath = "//div[@class='v-messages__message' and string()='The password field may not be greater than 20 characters.']")
	WebElement passwordChar20;

	@FindBy(className = "v-input__append-inner")
	WebElement hiddenPassword;
	@FindBy(xpath = "//*[@id=\"login-form-btn\"]/div")
	WebElement invalidCredintials;
	@FindBy(xpath = "//span[string()='Sign in']")
    WebElement signIn;
	@FindBy(className ="v-avatar")
	WebElement avatar;
	public LogIn(WebDriver driver) {
		super(driver);
	}

	public void fillInputs(String email, String password) {
		this.email.clear();
		this.email.sendKeys(email);

		this.password.clear();
		this.password.sendKeys(password);

	}

	public void logIn() {
		this.login.click();
	}

	public void hidden() {
		this.hiddenPassword.click();
	}

	public void clearEmail() {
		this.email.clear();
	}

	public void clearPassword() {
		this.password.clear();

	}

	public boolean isEmailRequiredDisplayed() {
		return emailRequired.isDisplayed();

	}

	public boolean isPasswordRequiredDisplayed() {
		return passwordRequired.isDisplayed();
	}

	public boolean ispasswordChar6Displayed() {
		return passwordChar6.isDisplayed();
	}

	public boolean isinvalidEmailDisplayed() {
		return invalidEmail.isDisplayed();

	}

	public boolean ispasswordChar20Displayed() {
		return passwordChar20.isDisplayed();
	}

	public boolean isInvalidCreditiansDisplayed() {
		return invalidCredintials.isDisplayed();
	}

    public boolean IsOnThePage() {
    	return signIn.isDisplayed();
    }
	   
   public boolean LoggedIn() {
	   return avatar.isDisplayed();
   }

}
