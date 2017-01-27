package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginData {
	WebDriver driver;
	@Test
	public void login() throws Exception{
	driver = new ChromeDriver();
	dataRead.getdata("GmailCredentials.xlsx", "sheet1");
	driver.findElement(By.name("userName")).sendKeys(a);
	
	
	}

}
