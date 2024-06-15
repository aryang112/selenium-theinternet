package TheInternet.SeleniumTrial;

import java.io.IOException;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.Base;

public class DigestAuthTests extends Base {
	
	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException {
		
		driver = initializeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth");
	}
	
	@Test
	public void DigestAuthTests() {
		
		
	}

}
