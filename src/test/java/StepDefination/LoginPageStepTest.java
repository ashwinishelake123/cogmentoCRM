package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepTest extends BaseClass{
	
	private static  LoginPage loginPage;
	@When("user is on login page")
	public void user_is_on_login_page() {
		BaseClass.initialization();
	    
	}

	@Then("user enter valide username and password")
	public void user_enter_valide_username_and_password() {
	     loginPage=new LoginPage();
	    String uname= prop.getProperty("USERNAME");
	    String pass= prop.getProperty("PASSWORD");
	    loginPage.enterUsernameAndPassword(uname, pass);
	}

	@Then("user click on login button")
	public void user_click_on_login_button() {
		
	    loginPage.clickOnLoginButton();
	}

}
