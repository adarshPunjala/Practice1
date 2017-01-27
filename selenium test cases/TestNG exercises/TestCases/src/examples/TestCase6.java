package examples;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase6 {
	
	public static WebDriver driver; 
@Test(priority = 1)
public static void launchBrowser(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adarsh P\\Desktop\\selenium-java-3.0.1\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.google.com/");
}
@Test (priority = 2)
public void google(){
	//driver.getTitle();
	AssertJUnit.assertEquals("Google", driver.getTitle());
}
@Test(priority = 3)
public void Gmail(){
	driver.findElement(By.linkText("Gmail")).click();
	String url = "https://www.google.com/gmail/about/";
	AssertJUnit.assertEquals(url, driver.getCurrentUrl());
}

}