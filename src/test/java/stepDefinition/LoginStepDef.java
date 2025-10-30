package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import pageObjects.LoginPage;


public class LoginStepDef {
	
	public WebDriver driver;
	
    public LoginPage loginpg;
	
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
	    WebDriverManager.chromedriver().setup();
	    driver= new ChromeDriver();
	    loginpg =new LoginPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
	    driver.get(url);
	    driver.manage().window().maximize();
	}

	@When("user enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String emailadd, String password) {
		loginpg.enterEmail(emailadd);
		loginpg.enterPassword(password);
	}

	@When("click on login button")
	public void click_on_login_button() {
		loginpg.clickOnLoginButton();
	}
	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitle) {
	    String actualTitle = driver.getTitle();
	    if(!actualTitle.equals(expectedTitle)) {
	        throw new AssertionError("Page title does not match! Expected: " + expectedTitle + ", but got: " + actualTitle);
	    }
	}
	

	@When("user clicks on log out link")
	public void user_clicks_on_log_out_link() throws InterruptedException {
		Thread.sleep(7000);
	   loginpg.clickOnLogoutButton();
	}

	
	@Then("page title2 should be {string}")
	public void page_title2_should_be(String expectedTitle2) throws InterruptedException {
		Thread.sleep(7000);
		String actualTitle2=driver.getTitle();
		if(!actualTitle2.equals(expectedTitle2)) {
	        throw new AssertionError("Page title does not match! Expected: " + expectedTitle2 + ", but got: " + actualTitle2);
	}
		}
	
	@Then("close browser")
	public void close_browser() {
	
       
	   driver.quit();
	}
}
