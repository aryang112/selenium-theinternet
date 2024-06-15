package TheInternet.SeleniumTrial;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.Base;

public class DropdownTests extends Base {
	
public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException {
		
		driver=initializeDriver();
		driver.get(property.getProperty("URL"));
		driver.findElement(By.xpath("//a[contains(text(),'Dropdown')]")).click();
	}
	
	@Test
	public void dropdown() {
		
		//One way to do it
//		WebElement dropdownList = driver.findElement(By.id("dropdown"));
//		Select select = new Select(dropdownList);
//		select.selectByValue("2");
		
		//What if there are 50 values
		
		Select select = new Select(driver.findElement(By.id("dropdown")));
		
		List<WebElement> dropdowns = select.getOptions();
		
		for (WebElement dropdown:dropdowns) {
			
			if (dropdown.getText().equalsIgnoreCase("Option 1")) {
				dropdown.click();
				String dropdownSelected = dropdown.getText();
				Assert.assertEquals(dropdownSelected, "Option 1");
				break;
			}
			
		}
		
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.quit();
	}

	
	

}
