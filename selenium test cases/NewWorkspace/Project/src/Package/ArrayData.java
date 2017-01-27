package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayData {
	
	public static void main(String [] args){
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adarsh P\\Desktop\\selenium-java-3.0.1\\chromedriver_win32\\chromedriver.exe");
		
WebDriver driver = new ChromeDriver();

driver.get("http://www.demo.guru99.com/V4/index.php");

driver.findElement(By.name("uid")).sendKeys("mngr57008");
driver.findElement(By.name("password")).sendKeys("dUjysUr");
driver.findElement(By.name("btnLogin")).click();

		
		
		
	}

}
