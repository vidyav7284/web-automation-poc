package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddItemPage extends BasePage {
	WebDriver driver;
	
	public AddItemPage(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='searchDropdownBox']")
	private WebElement selectOptions;
	
	@FindBy(xpath="//*[@id='nav-search-submit-button']")
	private WebElement searchIcon;
	
	@FindBy(xpath="//*[text()='Kindle Unlimited Eligible']/parent::a")
	private WebElement checkboxOfKUE;
	
	@FindBy(xpath="//span[@id='a-autoid-0-announce']")
	private WebElement sortOptions;
	
	@FindBy(xpath="//div[@class='a-popover-wrapper']//li")
	private List<WebElement> sortOptionslist;
	
	@FindBy(xpath="//img[@data-image-index='1']")
	private WebElement click1Book;
	
	@FindBy(xpath="//span//button[text()=' Add to eBook cart ']")
	private WebElement AddToCardBtn;
	
	@FindBy(xpath="//*[text()='Added to eBook cart']")
	private WebElement addedMsg;
	
	
	
	public void selectOption (String text) {
		selectOption(selectOptions, text);
		
	}

	public void searchIconClick()
	{
		click(searchIcon);
	}

	public void selectCheckBox()
	{
		click(checkboxOfKUE);
	}
	
	public void sortOption(String text)
	{
		click(sortOptions);
		listOptions(sortOptionslist, text);
				
	}
	
	public void clickFirstBook()
	{
		click(click1Book);
	}
	
	public void addItemToCard()
	{
//		ArrayList <String> tab = new ArrayList<> (driver.getWindowHandles());
//		driver.switchTo().window(tab.get(1));
		switchToNewTab(driver);
        click(AddToCardBtn);
		
	}
	
	public boolean verifyaddedItem()
	{
		boolean isDisplayed= waitForVisibilityOfElement(addedMsg).isDisplayed();
		return isDisplayed;
		
		
	}
}
