package testNG;


import org.junit.Assert;
import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Case1 {


@Test
public void gmail(){
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String a = driver.getTitle();
		Assert.assertEquals(a, "Gmail");
driver.close();	
		}

	}

