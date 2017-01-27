package examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestCase1 {
  @Test
  public void title() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adarsh P\\Desktop\\selenium-java-3.0.1\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	  String a= driver.getTitle();
	  Assert.assertEquals(a, "Gmail");
  }
}
