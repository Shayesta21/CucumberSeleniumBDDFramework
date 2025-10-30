package stepDefinition;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import pageObjects.JPetstoreLoginPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JPetStoreStepDef {
	
	public WebDriver driver;
	public JPetstoreLoginPage JPloginpage;
	
	@Given("user opens chrome Browser")
	public void user_opens_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		JPloginpage = new JPetstoreLoginPage (driver);
	    
	}

	@When("user opens the URL {string}")
	public void user_opens_the_url(String url) {
	   driver.get(url);
	   driver.manage().window().maximize();
	}

	@When("Clicks sign in button")
	public void clicks_sign_in_button() {
	    JPloginpage.ClickSignInButton();
	}

	@Then("user enters username {string} and password {string}")
	public void user_enters_username_and_password(String UName, String Password) throws InterruptedException {
	   JPloginpage.enterUName(UName);
	   JPloginpage.enterPassword(Password);
	}

	@Then("clicks login button")
	public void clicks_login_button() {
		JPloginpage.ClickloginButton();
	}

	@Then("home page is displayed with title {string}")
	public void home_page_is_displayed_with_title(String expectedTitle1) {
	   String actualTitle=driver.getTitle();
	   if(actualTitle.equals(expectedTitle1)) {
		   Assert.assertTrue(true);
	   }else{
		  Assert.assertTrue(false); 
	   }
	}

	@When("user clicks on sign out")
	public void user_clicks_on_sign_out() {
		JPloginpage.ClickSignOutbutton();
	}

	@Then("page title is displayed as {string}")
	public void page_title_is_displayed_as(String expectedTitle2) {
	    String actualTitle2=driver.getTitle();
	    if(actualTitle2.equals(expectedTitle2)) {
	    	Assert.assertTrue(true);
	    }else {
	    	Assert.assertTrue(false);
	    }
	}
	/*
	@Then("close browser")
	public void close_browser() {
		driver.quit();
	}
*/
}
