package com.demoaut.newtours.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver1;
	
	@FindBy(name = "userName")
	@CacheLookup
	private WebElement user;
	
	@FindBy(name = "password")
	@CacheLookup
	private WebElement pass;
	
	@FindBy(name =  "login")
	@CacheLookup
	private WebElement submit;
	
	public LoginPage(WebDriver driver){
		driver1 = driver;
		PageFactory.initElements(driver1, this);
	}
	public void applicationLogin(String name, String pin){
		user.sendKeys(name);
		pass.sendKeys(pin);
		submit.click();
	}

}