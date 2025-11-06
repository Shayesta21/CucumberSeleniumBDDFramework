package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import pageObjects.AddNewCustomerPage;
import pageObjects.LoginPage;


public class LoginStepDef {
	
	public WebDriver driver;
	
    public LoginPage loginpg;
    
    public AddNewCustomerPage addcustomerpg;
	
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
	    WebDriverManager.chromedriver().setup();
	    driver= new ChromeDriver();
	    loginpg =new LoginPage(driver);
	    addcustomerpg= new AddNewCustomerPage(driver);
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
	
	
	
/////////////////////////////Add new Customer/////////////////////////////
	@Then("user can view dashboard")
	public void user_can_view_dashboard() {
	   String actualtitle=addcustomerpg.getPageTitle();
	   String expectedtitle="Dashboard / nopCommerce administration";	
		if(actualtitle.equals(expectedtitle)) {
		  Assert.assertTrue(true);	
		}
		else {
			Assert.assertTrue(false);
		}
			
	}

	@When("user clicks customers menu")
	public void user_clicks_customers_menu() {
		addcustomerpg.clickCustomerMenu();
		}

	@When("clicks customers option")
	public void clicks_customers_option() {
		addcustomerpg.clickCustomerOption();
	   	}

	@When("Add new customer button is clicked")
	public void add_new_customer_button_is_clicked() {
		addcustomerpg.clickAddCustomerBtn();
	}

	@Then("user can view add new customer page")
	public void user_can_view_add_new_customer_page() {
	   String actualtitle=addcustomerpg.getPageTitle();
	   String expectedtitle="Add a new customer / nopCommerce administration"; 
	   if(actualtitle.equals(expectedtitle)) {
		   Assert.assertTrue(true);
	   }else {
		   Assert.assertTrue(false);
	   }
	}

	@When("user fills all information on form")
	public void user_fills_all_information_on_form() {
		addcustomerpg.enteremail("JohnSmith5@youremail.com");
		addcustomerpg.enterPassword("admin");
		addcustomerpg.enterFirstName("John");
		addcustomerpg.enterLastName("Smith");
		addcustomerpg.entergender();
		addcustomerpg.entercompany("Abc Corp");
		addcustomerpg.enterTaxExpemt();

		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)","");
		addcustomerpg.enterAdmincomment("This is a new cx");
		
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)", "");
		
	}

	@When("save button is clicked")
	public void save_button_is_clicked() {
		addcustomerpg.clickSavebtn();
	  
	}

	@Then("user can view success message  as {string}")
	public void user_can_view_success_message_as(String expectedconfirmationmessage) {
		String bodyTagText=driver.findElement(By.tagName("Body")).getText();
		if(bodyTagText.contains(expectedconfirmationmessage)) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
	   
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
