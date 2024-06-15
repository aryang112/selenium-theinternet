package TheInternet.SeleniumTrial;

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

public class CheckboxesTest extends Base {
	
	public WebDriver driver;
	String URL = "https://the-internet.herokuapp.com/checkboxes";
	
	@BeforeTest
	public void initialize() throws IOException {
		
		driver = initializeDriver();
		driver.get(URL);
	}
	
	@Test
	public void CheckBoxSelected() {
//		
		List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
		
		
		boolean checkBox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]")).isSelected();
		Assert.assertEquals(checkBox1, false);
		
//		for (WebElement checkbox:checkboxes) {
//			checkbox.click();
//			
//		}
		
	}
	@AfterTest
	public void TearDown() {
		
		driver.quit();
	}
}
		
			


