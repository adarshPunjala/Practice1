package examples;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class TestCase2 {
	
	@Test
	public void verifytitle(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adarsh P\\Desktop\\selenium-java-3.0.1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String a= driver.getTitle();
		System.out.println(a);
		Assert.assertEquals(a, "Google");
	}
}

