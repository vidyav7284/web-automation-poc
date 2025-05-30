package addcardfeature;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import drivermanager.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class AppHooks {

	WebDriver driver ;
	@Before
	public void launchBrowser() throws IOException
	{
		DriverFactory df = new DriverFactory();
		
		driver = df.initBrowser("Edge");

		driver.manage().window().maximize();
		
	}


	@After(order= 2)
	public void tearDown(Scenario scenario)
	{
		boolean isFailed = scenario.isFailed();
		String scenarioName = scenario.getName();
		String newScenarioName = scenarioName.replaceAll(" ", "_");
		if(isFailed)
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			byte[] source = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(source, "image/png", newScenarioName);

		}

	}



	@After (order = 1)
	public void closeBrowser()
	{
		driver.quit();
	}
}

