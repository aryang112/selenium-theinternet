package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasicAuth {
	
	public WebDriver driver;
	String url = "https://admin:admin@the-internet.herokuapp.com/basic_auth";
	By messageElement = By.xpath("//h3[contains(text(),'Basic Auth')]"); 
	
	public BasicAuth(WebDriver driver) {
		this.driver = driver;
	}
	
	public String pageMessage() {
		String pageMessage = driver.findElement(messageElement).getText();
		return pageMessage;
		
	}
	
	public void navigateToUrl() {
		
		driver.get(url);
	}

}
