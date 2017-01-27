package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Screenshot.Screen;

public class GCR {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gcrit.com/build3/admin/login.php");
		
	Screen.Screenshot(driver, "App Launched");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		
		Screen.Screenshot(driver, "Admin name");
		
		driver.findElement(By.name("password")).sendKeys("admin@123");
		
		Screen.Screenshot(driver, "Password entered");
		
		driver.findElement(By.id("tdb1")).click();
		
		Screen.Screenshot(driver, "Logging in");
		//System.out.println(driver.getCurrentUrl());
		//String url = driver.getCurrentUrl();
		
       // driver.quit();
        driver.close();
	}

}
