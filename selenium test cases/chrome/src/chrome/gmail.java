package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class gmail {
	
	@Test
	public void gmailLogin(){
		
	//public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adarsh P\\Desktop\\AllSeleniumTools\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.linkText("Images")).click();
		driver.findElement(By.id("sb_ifc0")).sendKeys("Hanuman");
		driver.findElement(By.id("_fZl")).click();
	}

}