package TheInternet.SeleniumTrial;


import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.AddRemove;
import PageObjects.BasicAuth;
import PageObjects.LandingPage;
import resources.Base;




public class BasicAuthTests extends Base {
	
	public WebDriver driver;
	//AddRemove addRemove = new AddRemove(driver);
	
	
	@BeforeTest
	public void initialize() throws IOException {
		                     
		driver = initializeDriver();
		//driver.get("https://the-internet.herokuapp.com/");
	}
	
	@Test
	public void VerifyBasicAuthMessage() {
		BasicAuth basicAuth = new BasicAuth(driver);
		basicAuth.navigateToUrl();
		Assert.assertEquals(basicAuth.pageMessage(), "Basic Auth"); 
		
	}
	
	@AfterTest
	public void Teardown() {
		
		
		driver.close();
	}
	

}
