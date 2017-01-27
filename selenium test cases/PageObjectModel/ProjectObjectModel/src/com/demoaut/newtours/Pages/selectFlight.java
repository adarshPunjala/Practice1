package com.demoaut.newtours.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selectFlight {
	WebDriver driver3;
	
	@FindBy(xpath = "html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[9]/td[1]/input")
	@CacheLookup
	WebElement departure;
	
	@FindBy(xpath = "html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[3]/td[1]/input")
	@CacheLookup
	WebElement returnflight;
	
	@FindBy(name = "reserveFlights")
	@CacheLookup
	WebElement continue1;
	
	public selectFlight(WebDriver driver){
		driver3 = driver;
		PageFactory.initElements(driver3, this);
		
	}
	public void travel(){
		departure.click();
		returnflight.click();
		continue1.click();
	}

}
