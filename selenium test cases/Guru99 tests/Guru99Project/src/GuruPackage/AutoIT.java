package GuruPackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoIT {
	@Test
	public void autoit() throws Exception{
	//public static void main(String[]args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adarsh P\\Desktop\\selenium-java-3.0.1\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.plagiarismsoftware.net/");
	driver.findElement(By.id("textFile")).click();
	Thread.sleep(5000);
	Runtime.getRuntime().exec("C:\\Users\\Adarsh P\\Desktop\\AUTOIT TestCases\\close.exe");
	//driver.findElement(By.id("checkPlag")).click();
	//System.out.println("Test Executed");
	//driver.close();
	
	}
}
