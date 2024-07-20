package StepDefination;

import org.junit.Assert;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageStepTest extends BaseClass{
	private static HomePage homePage;
	
	@Given("user is on home page and verify the home page title")
	public void user_is_on_home_page_and_verify_the_home_page_title() {
		 homePage=new HomePage();
		String actualTitle=homePage.checkHomePageTitle();
		Assert.assertEquals(actualTitle,"Cogmento CRM");
	    
	}

	@Then("user validate the home page logo")
	public void user_validate_the_home_page_logo() {
		boolean actualLogo=homePage.checkHomePageLogo();
		Assert.assertEquals(actualLogo,true);
	   
	}

	@Then("user validate the home page url")
	public void user_validate_the_home_page_url() {
		String actualUrl=homePage.checkHomePageUrl();
		Assert.assertEquals(actualUrl.contains("cogmento"),true);
	    
	}

}
