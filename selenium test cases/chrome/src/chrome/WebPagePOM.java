package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebPagePOM {
     WebDriver driver;
	 By username = By.id("Email");
	 By next = By.id("next");
	 By password = By.id("Passwd");
	 By submit = By.id("signIn");
	 
	 public void LoginPage(WebDriver driver){
		 this.driver = driver;
	 }
	 public void typeUsername(){
		 driver.findElement(username).sendKeys("adarshpunjala12");
	 }
	 public void clickNext(){
		 driver.findElement(next).click();
	 }
	 public void typePassword(){
		 driver.findElement(password).sendKeys("9989535879");
	 }
	 public void clickSubmit(){
		 driver.findElement(submit).click();
	 }
		 
	 }
	
	

