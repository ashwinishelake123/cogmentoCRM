package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class HomePage extends BaseClass {
	
	@FindBy(xpath="//div[@class='header item']")
	private WebElement logo;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String checkHomePageTitle()
	{
		String actualTitle=driver.getTitle();
		return actualTitle;
	}
	
	public boolean checkHomePageLogo()
	{
		return Wait.isDisplayed(logo);
	}
	
	public String checkHomePageUrl()
	{
		return driver.getCurrentUrl();
	}
	
	

}
