package testCases;

import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.firefox.FirefoxDriver;


public class Case2 {
  
  public static void main( String[] args){  

	  System.setProperty("webdriver.firefox.marionette","G:\\Selenium\\Firefox driver\\geckodriver.exe");

	  WebDriver driver = new FirefoxDriver();
	  driver.get("http://www.fullerton.edu/");
	  
  }  
  }