package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerPage {
	
	WebDriver ldriver;
	
	public AddNewCustomerPage(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
@FindBy(xpath="//i[@class='nav-icon far fa-user']")
WebElement customer_menu;

@FindBy(xpath="//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]")
WebElement customer_menuoption;

@FindBy(css="a[class='btn btn-primary']")
WebElement addcustomerbtn;


@FindBy(xpath="//input[@id='Email']")
WebElement txtemail;

@FindBy(xpath="//input[@id='Password']")
WebElement txtpassword;

@FindBy(xpath="//input[@id='FirstName']")
WebElement txtfirstname;

@FindBy(xpath="//input[@id='LastName']")
WebElement txtlastname;

@FindBy(xpath="//input[@id='Gender_Male']")
WebElement gender;

@FindBy(xpath="//input[@id='Company']")
WebElement txtcompany;

@FindBy(xpath="//input[@id='IsTaxExempt']")
WebElement taxexempt;

@FindBy(id="AdminComment")
WebElement admincomment;


@FindBy(name="save-continue")
WebElement btnsave;


public String getPageTitle() {
	return ldriver.getTitle();
}
	
public void clickCustomerMenu() {
	customer_menu.click();
}
	
public void clickCustomerOption() {
	customer_menuoption.click();
}
	
public void clickAddCustomerBtn() {
	addcustomerbtn.click();
}

public void enteremail(String email) {
	txtemail.sendKeys(email);
}
	
public void enterPassword(String password) {
	txtpassword.sendKeys(password);
}
	
public void enterFirstName(String fname) {
	txtfirstname.sendKeys(fname);
}


public void enterLastName(String lname) {
	txtlastname.sendKeys(lname);
}


public void entergender() {
	gender.click();
}



public void entercompany(String com) {
	txtcompany.sendKeys(com);
}




public void enterTaxExpemt() {
	taxexempt.click();
}


public void enterAdmincomment(String comment) {
	admincomment.sendKeys(comment);
}


public void clickSavebtn() {
	btnsave.click();
}







}
