package GuruPackage;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import GuruPackageScreenShot.Screenshot;

public class TesytCase21 {

	//public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		@Test
		public void capturess() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adarsh P\\Desktop\\selenium-java-3.0.1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://live.guru99.com/index.php/");
		String a = driver.getTitle();
		System.out.println(a);
		driver.findElement(By.linkText("MOBILE")).click();
		Screenshot.screenshot(driver, "AppLaunched");
		Thread.sleep(5000);
		
		String b = driver.getTitle();
		System.out.println(b);
		Select x = new Select(driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select")));
		x.selectByIndex(1);
		Thread.sleep(5000);
		Screenshot.screenshot(driver, "MobileAppLaunched");
		System.out.println("TestCase Executed");
		driver.close();
		
		}
	

}
