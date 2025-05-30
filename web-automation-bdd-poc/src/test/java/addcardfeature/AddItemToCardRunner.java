package addcardfeature;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\addcardfeature"},
		
		glue = {"addcardfeature"}, 
		
		plugin= {"pretty","html:target/cucumberReport/report.html"}
		
		)


public class AddItemToCardRunner extends AbstractTestNGCucumberTests{

}
