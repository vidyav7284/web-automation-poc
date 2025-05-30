package drivermanager;

import org.openqa.selenium.WebDriver;

import pages.AddItemPage;



public class PageFactoryManager {
	
public static AddItemPage additempage;
	
public static AddItemPage getAddItemPage(WebDriver driver) {
		if (additempage == null) {
			return new AddItemPage(driver);
		} else {
			return additempage;
		}
	
	
	
}
	
	

}