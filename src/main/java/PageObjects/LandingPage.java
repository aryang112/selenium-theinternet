package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	public WebDriver driver;
	
	By AddRemoveElements = By.linkText("Add/Remove Elements");
	By BasicAuthPage = By.linkText("Basic Auth");
	By BrokenImages = By.linkText("Broken Images");
	By ChallengingDom = By.linkText("Challenging DOM");
	By Checkboxes = By.linkText("Checkboxes");
	By ContextMenu = By.linkText("Context Menu");


	public LandingPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public AddRemove AddRemoveNavigation() {
		
		driver.findElement(AddRemoveElements).click();
		AddRemove addRemove = new AddRemove(driver);
		return addRemove;
	}
	
	public BasicAuth BasicAuthNavigation() {
		
		driver.findElement(BasicAuthPage).click();
		BasicAuth basicAuth = new BasicAuth(driver);
		return basicAuth;
		
		
	}
	
	public BrokenImages BrokenImagesNavigation() {
		
		driver.findElement(BrokenImages).click();
		BrokenImages brokenImages = new BrokenImages(driver);
		return brokenImages;
	}
	
	public void ContextMenuNavigation() {
		driver.findElement(ContextMenu).click();
	}
}


