package PageObjects;

import java.io.IOException;
import java.net.http.HttpClient;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import resources.Base;

public class BrokenImages extends Base {
	
	public WebDriver driver;
	

	public BrokenImages(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public String BrokenImagesTitle() {
		
		String BrokenImagesTitle = driver.findElement(By.tagName("h3")).getText();
		return BrokenImagesTitle;
	}
	
	public int ImagesOnPage() throws ClientProtocolException, IOException {
		
		int ImageCount = 0;
		try {
		List<WebElement> ImagesOnPage = driver.findElements(By.cssSelector("div.example img"));
		for (WebElement image:ImagesOnPage) {
			if (image != null) {
				CloseableHttpClient client = HttpClientBuilder.create().build();
				HttpGet getRequest = new HttpGet(image.getAttribute("src"));
				HttpResponse response = client.execute(getRequest);
				
				if(response.getStatusLine().getStatusCode() != 200) {
					ImageCount++;
					
			}
	}
		}
	}
		catch (Exception e) {
			e.printStackTrace();
		}
		return ImageCount;
}
}
	

