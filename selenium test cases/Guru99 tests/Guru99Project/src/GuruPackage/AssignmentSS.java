package GuruPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AssignmentSS {

	//public static void main(String[] args){
	@Test
	public void login(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adarsh P\\Desktop\\AllSeleniumTools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		//WebElement b = driver.findElement(By.name("fromPort"));
		//WebElement c = driver.findElement(By.name("fromMonth"));
		//Select click = new Select(b);
		//click.selectByVisibleText("2");
		//click.selectByVisibleText("San Francisco");
		//click.selectByVisibleText("July");
		
	}
	
	}

