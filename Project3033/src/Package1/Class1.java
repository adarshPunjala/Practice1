package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class1 {
	@Test
	public void login(){
	//public static void main(String[]args){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adarsh P\\Desktop\\AllSeleniumTools\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.linkText("Gmail")).click();
		driver.close();
	} 

}
