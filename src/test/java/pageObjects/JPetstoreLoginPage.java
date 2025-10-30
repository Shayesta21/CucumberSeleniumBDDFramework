package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JPetstoreLoginPage {

	WebDriver ldriver;
	
	public JPetstoreLoginPage(WebDriver rdriver) {
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver,this);
		
	}
	
	
	@FindBy(linkText="Sign In")
	WebElement signinButton;
	
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	
	@FindBy(name="signon")
	WebElement loginButton;
	
	@FindBy(linkText="Sign Out")
	WebElement logoutButton;
	
public void ClickSignInButton() {
	signinButton.click();
}
	
	
public void enterUName(String uname) {
	username.sendKeys(uname);
}
	
public void enterPassword(String Password) {
	password.clear();
	password.sendKeys(Password);
}
	
	
public void ClickloginButton() {
	loginButton.click();
}
	
public void ClickSignOutbutton() {
	logoutButton.click();
}
	
	
	
}
