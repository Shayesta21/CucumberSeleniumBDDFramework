package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rDriver)
	{
		ldriver=rDriver;

		PageFactory.initElements(rDriver,this);

	}

@FindBy(id="Email")
WebElement email;

@FindBy(id="Password")
WebElement password;

@FindBy(xpath="//button[@class='button-1 login-button']")
WebElement loginButton;

@FindBy(linkText="Logout")
WebElement logoutButton;

public void enterEmail(String emailadd) {
	email.clear();
	email.sendKeys("admin@yourstore.com");
}

public void enterPassword(String passw) {
	password.clear();
	password.sendKeys("admin");
}

public void clickOnLoginButton() {
	loginButton.click();
}

public void clickOnLogoutButton() {
	logoutButton.click();
}




}
