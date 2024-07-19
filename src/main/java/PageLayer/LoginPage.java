package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class LoginPage extends BaseClass {
	
	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//div[text()='Login']")
	private WebElement loginbutton;
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsernameAndPassword(String Email,String Password)
	{
		Wait.sendKeys(email, Email);
		Wait.sendKeys(password,Password);
	}
	
	public void clickOnLoginButton()
	{
		Wait.click(loginbutton);
	}
	

}
