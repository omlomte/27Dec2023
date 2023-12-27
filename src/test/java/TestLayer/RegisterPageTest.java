package TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;

public class RegisterPageTest extends BaseClass
{

	//PreCondition
	@BeforeTest
	public void setup() 
	{
		BaseClass.initisalization();
	}
	
	//Call register page class object to call register page functionality methods 
	
	@Test
	public void guru99 () 
	{
		RegisterPage obj=new RegisterPage ();
		obj.contactinformation("Om", "Lomte", "546432154", "om1@gmail.com");
		
		obj.mailingInformation("Ravet","Pune","Maharashtra" ,"007","INDIA");
		
		obj.UserInformation("omlomte","123123" , "123123");
	}
	
	@AfterTest
	public void end () 
	{
		
	}
	
}
