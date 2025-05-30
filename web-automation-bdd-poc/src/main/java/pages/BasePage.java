package pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	WebDriver driver;
	WebDriverWait wait;

	public BasePage(WebDriver driver) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}

	public void clearAndSendkeys(WebElement element, String value) {
		element = waitForVisibilityOfElement(element);
		element.clear();
		element.sendKeys(value);
	}
	
	public void click(WebElement element)
	{
		waitForElementToBeClickable(element).click();
		
	}

	public WebElement waitForVisibilityOfElement(WebElement element) {
		return wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
	public WebElement waitForElementToBeClickable(WebElement element)
	{
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	
	public void selectOption(WebElement element, String text)
	{
//		element = waitForVisibilityOfElement(element);
		element.click();
		Select a = new Select (element);
		a.selectByVisibleText(text);
	}
	
	public void listOptions(List<WebElement> elements, String text)
	{
			for (WebElement element : elements) {
	        if (element.getText().trim().equalsIgnoreCase(text.trim())) {
	            click(element);
	            break;
	        }
	}
	}
	
	public void switchToNewTab(WebDriver driver) {
	    ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
	    if (tabs.size() > 1) {
	        driver.switchTo().window(tabs.get(1));
	    } else {
	        throw new RuntimeException("New tab not found!");
	    }
	}

}
