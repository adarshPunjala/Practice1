package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesyCase21 {
	public static void main (String [] args){
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
	WebElement a= driver.findElement(By.linkText("Gmail"));
	System.out.println(a.isDisplayed());
		
	}

}
