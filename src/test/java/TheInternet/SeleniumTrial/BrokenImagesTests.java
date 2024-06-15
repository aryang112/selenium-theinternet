package TheInternet.SeleniumTrial;

import org.testng.annotations.Test;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.BrokenImages;
import PageObjects.LandingPage;
import resources.Base;

public class BrokenImagesTests extends Base {
	
	public WebDriver driver;
	//BrokenImages brokenImages = new BrokenImages(driver);
	String BrokenImagesUrl = "https://the-internet.herokuapp.com/broken_images";
	
	@BeforeTest
	public void initialiaze() throws IOException {
		
		driver = initializeDriver();
//		LandingPage landingPage = new LandingPage(driver);
//		landingPage.BrokenImagesNavigation();
		driver.get(BrokenImagesUrl);
	}
	
	@Test
	public void PageTitleTest() {
		
		BrokenImages brokenImages = new BrokenImages(driver);
		Assert.assertEquals(brokenImages.BrokenImagesTitle(), "Broken Images");
	}
	
	@Test
	public void BrokenImagesTest() throws ClientProtocolException, IOException {
		
		BrokenImages brokenImages = new BrokenImages(driver);
		Assert.assertEquals(brokenImages.ImagesOnPage(), 2);
		System.out.println("Number of Broken Images are " + brokenImages.ImagesOnPage());
	}
	
	@AfterTest
	public void Teardown() {
		
		
		driver.close();
	}

}


