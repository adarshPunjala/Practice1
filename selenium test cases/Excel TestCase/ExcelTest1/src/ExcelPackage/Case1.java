package ExcelPackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Case1 {
	WebDriver driver;
	@BeforeTest
	public void openBrowser(){
	System.setProperty("webdriver.gecko.driver",
			"C:\\Users\\Adarsh P\\Desktop\\selenium-java-3.0.1\\geckodriver-v0.11.1-win64\\geckodriver.exe");	
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	@Test
	public void login() throws IOException{
		String [][]data1=data.getData("Credentials.xlsx", "Credentials");
		
		for(int i=1; i<data1.length;i++){
		String username= data1[i][0];
		String password = data1[i][1];
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		
		}
	}
		@AfterTest
		public void close(){
			driver.close();
		}
	}
	
	


