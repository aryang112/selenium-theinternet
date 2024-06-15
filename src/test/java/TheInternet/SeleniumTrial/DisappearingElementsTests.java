package TheInternet.SeleniumTrial;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.Base;

public class DisappearingElementsTests extends Base {
	
	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException {
		
		driver = initializeDriver();
		driver.get(property.getProperty("URL"));
	}
	
	@Test
	public void DisappearingElementTest() {
		
		driver.findElement(By.xpath("//a[contains(text(),'Disappearing Elements')]")).click();
		WebElement GalleryBtn = driver.findElement(By.xpath("//a[contains(text(),'Gallery')]"));
		Assert.assertTrue(GalleryBtn.isDisplayed());
		
		List<WebElement> links = driver.findElements(By.tagName("li"));
		for (WebElement link: links) {
			if (link.getText().equalsIgnoreCase("Gallery")) {
				link.click();
			}
		}
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.quit();
	}

}
