package TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import TestNGSS.SS;

public class ScreenShot {

	@Test
	public void screenshot() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adarsh P\\Desktop\\selenium-java-3.0.1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.google.com/gmail/about/");
		 driver.findElement(By.linkText("SIGN IN")).click();
		 
		 TakesScreenshot ts = (TakesScreenshot)driver;
		 File source =ts.getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(source, new File("./Screenshots/gmail.png"));
		
		 
		 System.out.println("Gmail Screenshot taken");
		 
		 driver.findElement(By.id("Email")).sendKeys("adarshpunjala12");
		 SS.captureScreenshot(driver);
		 driver.findElement(By.id("next")).click();
SS.captureScreenshot(driver);
		 driver.findElement(By.id("Passwd")).sendKeys("9989535879");
		 SS.captureScreenshot(driver);
		 driver.findElement(By.id("signIn")).click();
		SS.captureScreenshot(driver);
		
	}
	
	
	
}
