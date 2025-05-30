package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BasePage{
	WebDriver driver;
	
	
	public SearchPage(WebDriver driver) 
	{
		super(driver);
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	

	@FindBy(xpath="//*[@id='twotabsearchtextbox']")
	private WebElement searchfield;
	
	@FindBy(xpath="//*[@id='nav-search-submit-button']")
	private WebElement searchbutton;
	
	@FindBy(xpath="//*[contains(text(),'Samsung Galaxy M05')]")
	private WebElement mobile;
	
	
	public void clickSearchfield(String product)
	{
		clearAndSendkeys(searchfield, product);
		click(searchbutton);
				 
	}
	
	public boolean isMobileDisplay()
	{
	     waitForVisibilityOfElement(mobile);
	     boolean isDisplay = mobile.isDisplayed();
	     
	     return isDisplay;
	}
	
	
	
	
	
	

}
