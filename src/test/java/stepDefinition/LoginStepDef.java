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

	@Then("page title1 should be {string}")
	public void page_title1_should_be(String expectedTitle1) {
		String actualTitle1=driver.getTitle();
		
	if(actualTitle1.equals(expectedTitle1)) {
		Assert.assertTrue(true);//pass
	}else {
		Assert.assertTrue(false);//fail
	}
	    
	}

	@When("user clicks on log out link")
	public void user_clicks_on_log_out_link() throws InterruptedException {
		Thread.sleep(7000);
	   loginpg.clickOnLogoutButton();
	}

	
	@Then("page title2 should be {string}")
	public void page_title2_should_be(String expectedTitle2) {
		String actualTitle2=driver.getTitle();
	}
	
	@Then("close browser")
	public void close_browser() throws InterruptedException {
		Thread.sleep(5000);
	   driver.close();
	   driver.quit();
	}
}
