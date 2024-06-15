package TheInternet.SeleniumTrial;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import resources.Base;

public class ContextMenuTest extends Base {
	
	//public WebDriver driver;
	LandingPage landingPage;
	
	@BeforeTest
	public void initialize() throws IOException {
		
		driver=initializeDriver();
		//landingPage.ContextMenuNavigation();
		driver.get("https://the-internet.herokuapp.com/context_menu");
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	
	
	@Test
	public void MenuTest() throws InterruptedException {
		
		Actions actions = new Actions(driver);
		WebElement contextMenu = driver.findElement(By.id("hot-spot"));
		actions.moveToElement(contextMenu);
		actions.contextClick(contextMenu).build().perform();
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
	}
}
