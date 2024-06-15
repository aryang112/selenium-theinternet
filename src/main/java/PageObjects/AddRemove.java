package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;


public class AddRemove extends Base {
	
	public WebDriver driver;
	By AddElement = By.xpath("//button[contains(text(),'Add Element')]");
	By DeleteElement = By.xpath("//button[contains(text(), 'Delete')]");

	public AddRemove(WebDriver driver) {
		this.driver = driver;
	}
	
	public void AddElement(int noOfClicks) {
		
		for (int i=0; i<noOfClicks; i++) {
			
			driver.findElement(AddElement).click();
		}	
	}
	
	public int deleteBtnSize() {
		
		List<WebElement> deleteBtn = driver.findElements(DeleteElement);
		return deleteBtn.size();	
	}
	
	public void DeleteElement(int noOfClicks) {
		
		List<WebElement> DeleteBtn = driver.findElements(DeleteElement);
		for (int i=0; i<DeleteBtn.size(); i++) {
			
			DeleteBtn.get(i).click();;
		}
	
	}
	
	public WebElement DeleteBtn() {
		
		return driver.findElement(DeleteElement);
		
	}
	

}
