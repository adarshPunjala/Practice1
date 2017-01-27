package com.demoaut.newtours.TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoaut.newtours.Pages.LoginPage;

public class Validate {
	WebDriver driver;
	
	@BeforeTest
	public void LaunchBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adarsh P\\Desktop\\selenium-java-3.0.1\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
	} 
	@Test
	public void detail(){
		LoginPage value = new LoginPage(driver);
		value.applicationLogin("adarsh", "mercury");
		//String title= driver.getTitle();
		String  HomeURL= "http://newtours.demoaut.com/";
		String actualURL = driver.getCurrentUrl();
		if(HomeURL.equals(actualURL)){
			System.out.println("InValid Credentials");
		}else{
			System.out.println("Valid Credentials");
		}
		
		System.out.println("TestCase finished");
	}
	@AfterTest
	public void closeBrowser(){
		driver.close();
		
	}

}
