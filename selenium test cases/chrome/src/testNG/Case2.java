package testNG;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case2 {

		@Test
		public void verifyTitle(){
		WebDriver driver = new ChromeDriver();   
		driver.get("https://www.gmail.com");
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "Gmail");
		}
		}

