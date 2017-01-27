package abc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginElements {
WebDriver  driver;	
public void loginpage(WebDriver uidriver){
	this.driver=uidriver;
	}
}
	//@FindBy(id="Email") 
	//WebElement username;
	
	@FindBy (how=How.ID,using="Email") 
	WebElement username;
	
	@FindBy (id="next") 
	WebElement next;
	
	@FindBy (id="Passwd") 
	WebElement password;
	
	@FindBy (how=How.ID,using="signIn")
	WebElement submit;
 

public void login_wordpress(String uid,String pass){
username.sendKeys(uid);
next.click();
password.sendKeys(pass);
submit.click();
}
