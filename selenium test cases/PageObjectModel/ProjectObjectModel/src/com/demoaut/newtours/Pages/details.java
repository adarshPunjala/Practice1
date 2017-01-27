package com.demoaut.newtours.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class details {
	WebDriver driver4;
	
	@FindBy(name = "passFirst0")
	@CacheLookup
	WebElement firstName;
	
	@FindBy(name = "passLast0")
	@CacheLookup
	WebElement lastName;
	
	@FindBy(name = "pass.0.meal")
	@CacheLookup
	WebElement meal1;
	
	@FindBy(name = "passFirst1")
	@CacheLookup
	WebElement firstName1;
	
	@FindBy(name = "passLast1")
	@CacheLookup
	WebElement lastName1;
	
	@FindBy(name = "pass.1.meal")
	@CacheLookup
	WebElement meal2;
	
	@FindBy(name = "creditnumber")
	@CacheLookup
	WebElement creditCard;


   public details(WebDriver driver){
	   driver4 = driver;
	   PageFactory.initElements(driver4, this);
	   
   }
   public void payment(){
	   firstName.sendKeys("akshaj");
	   lastName.sendKeys("Devashetty");
	   firstName1.sendKeys("Venya");
	   lastName1.sendKeys("Devarshetty");
	   Select x = new Select(meal1);
	   x.selectByIndex(3);
	   Select y= new Select(meal2);
	   y.selectByIndex(3);
	   creditCard.sendKeys("303330604479");
   }
}