package TheInternet.SeleniumTrial;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.Base;

public class ChallengingDOMSTest extends Base {
	
	public WebDriver driver;
	String URL = "https://the-internet.herokuapp.com/challenging_dom";
	
	@BeforeTest
	public void initialize() throws IOException {
		
		driver = initializeDriver();
		driver.get(URL);
	}
	
	@Test
	public void clickOnButton() {
		
		List<WebElement> buttons = driver.findElements(By.xpath("//a[contains(@class, 'button')]"));
		
	}

}
