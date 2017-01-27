package chrome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Invocation {
	WebDriver driver;
	
	@BeforeMethod
	public void openBrowsr(){
		driver = new ChromeDriver();
		driver.get("https://www.dropbox.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	//}
	
	//@Test(invocationCount = 5)
	//public void printTitle(){
		System.out.println(driver.getTitle());
	//}
	
	//@AfterMethod
	//public void close(){
		driver.close();
	}

}
