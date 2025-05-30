package drivermanager;

import org.openqa.selenium.WebDriver;

import pages.AddItemPage;
import pages.HomePage;
import pages.SearchPage;


public class PageFactoryManager {
	
public static	HomePage homepage;
public static	SearchPage searchpage;
public static AddItemPage additempage;
	
public static HomePage getHomePage(WebDriver driver) {

	if (homepage == null) {
		return new HomePage(driver);
	} else {
		return homepage;
	}
}

public static SearchPage getSearchPage(WebDriver driver) {
	if (searchpage == null) {
		return new SearchPage(driver);
	} else {
		return searchpage;
	}
}
	
	public static AddItemPage getAddItemPage(WebDriver driver) {
		if (searchpage == null) {
			return new AddItemPage(driver);
		} else {
			return additempage;
		}
	
	
	
}
	
	

}