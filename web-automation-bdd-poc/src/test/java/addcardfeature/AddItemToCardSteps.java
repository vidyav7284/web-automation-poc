package addcardfeature;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import drivermanager.DriverFactory;
import drivermanager.PageFactoryManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddItemPage;


public class AddItemToCardSteps {
	
	AddItemPage additempage;
	public AddItemToCardSteps()
	{
		additempage = PageFactoryManager.getAddItemPage(DriverFactory.getDriver());
	}

	@Given("the user is on the home page")
	public void the_user_is_on_the_home_page() {
		WebDriver driver = DriverFactory.getDriver();
		driver.get("https://www.amazon.in/");
	    
	}

	@When("the user selects {string} from the category")
	public void the_user_selects_from_the_category(String string) {
	    additempage.selectOption(string);
	}

	@When("clicks on the search icon")
	public void clicks_on_the_search_icon() {
	   additempage.searchIconClick();
	}

	@When("selects the checkbox for KindleUnlimitedEligible")
	public void selects_the_checkbox_for_KindleUnlimitedEligible(){
	    additempage.selectCheckBox();
	}

	@When("sorts the results by {string}")
	public void sorts_the_results_by(String string) {
	    additempage.sortOption(string);
	}

	@When("clicks on the first book in the results")
	public void clicks_on_the_first_book_in_the_results() {
	    additempage.clickFirstBook();
	}

	@When("clicks on the addCart button")
	public void clicks_on_the_add_cart_button() {
	    additempage.addItemToCard();
	}

	@Then("the book should be added to the cart")
	public void the_book_should_be_added_to_the_cart() {
	   boolean isDisplayed = additempage.verifyaddedItem();
	   Assert.assertEquals(isDisplayed, true);
	    
	}



}
