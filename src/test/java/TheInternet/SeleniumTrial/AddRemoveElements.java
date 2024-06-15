package TheInternet.SeleniumTrial;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;
import static org.testng.Assert.assertFalse;

//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertThat;


import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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




public class AddRemoveElements extends Base {
	
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	public WebDriver driver;
	AddRemove addRemove = new AddRemove(driver);
	
	
	@BeforeTest
	public void initialize() throws IOException {
		                     
		driver = initializeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		log.info("Driver initialized");
	}
	
	@Test
	public void VerifyAddElementOnPage() throws IOException {
		
		LandingPage landingPage = new LandingPage(driver);
		landingPage.AddRemoveNavigation();
		AddRemove addRemove = new AddRemove(driver);
		addRemove.AddElement(5);
		Assert.assertEquals(5, addRemove.deleteBtnSize());
		driver.navigate().back();
		log.info("Add Elements Test Passed");
	}
	
	@Test
	public void VerifyRemoveElementOnPage() {
		
		LandingPage landingPage = new LandingPage(driver);
		landingPage.AddRemoveNavigation();
		AddRemove addRemove = new AddRemove(driver);
		addRemove.AddElement(5);
		addRemove.DeleteElement(5);
		//Assert.assertFalse(addRemove.DeleteBtn().isDisplayed());
		log.info("Delete Elements Test Passed");
		
	}
	
	@AfterTest
	public void Teardown() {
	
		driver.close();
		log.info("Driver closed");
	}
	

}
