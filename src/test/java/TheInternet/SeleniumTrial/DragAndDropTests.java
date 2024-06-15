package TheInternet.SeleniumTrial;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.Base;

public class DragAndDropTests extends Base {
	
	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException {
		
		driver=initializeDriver();
		driver.get(property.getProperty("URL"));
		driver.findElement(By.xpath("//a[contains(text(),'Drag and Drop')]")).click();
	}
	
	@Test
	public void Drop() {
		
		WebElement columnA = driver.findElement(By.id("column-a"));
		WebElement columnB = driver.findElement(By.id("column-b"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(columnA, columnB).build().perform();
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.quit();
	}

}
