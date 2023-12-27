package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class RegisterPage extends BaseClass
{
	//POM With PageFactory
	
	@FindBy(name="firstName")
	WebElement firstname;
	
	@FindBy(name="lastName")
	WebElement lastname;
	
	@FindBy(name="phone")
	WebElement phone;
	
	@FindBy(name="userName")
	WebElement email;
	
	// Mailing Information 
	
	@FindBy(name="address1")
	WebElement address;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name="state")
	WebElement state;
	
	@FindBy(name="postalCode")
	WebElement postalcode;
	
	@FindBy(name="country")
	WebElement country;
	
	//User Information
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="confirmPassword")
	WebElement confirmPassword;
	
	@FindBy(name="submit")
	WebElement submit;
	
	
	//Initialize the object repository in constructor using Page Factor Class
	
	public RegisterPage () 
	{
		PageFactory.initElements(driver, this);
	}
	
	//Write the associated functionality method without entering the test data
	
	public void contactinformation (String fname,String lname,String Mobile,String mail) 
	{
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		phone.sendKeys(Mobile);
		email.sendKeys(mail);
	}
	
	public void mailingInformation(String add,String City,String State,String Post,String Country) 
	{
		address.sendKeys(add);
		city.sendKeys(City);
		state.sendKeys(State);
		postalcode.sendKeys(Post);
		
		Select sel=new Select (country);
		sel.selectByVisibleText(Country);
	}
	
	public void UserInformation (String uname,String pass,String ConfPass) 
	{
		username.sendKeys(uname);
		password.sendKeys(pass);
		confirmPassword.sendKeys(ConfPass);
		submit.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
