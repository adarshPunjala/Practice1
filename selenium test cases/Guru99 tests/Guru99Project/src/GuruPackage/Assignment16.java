package GuruPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.support.ui.Select;

public class Assignment16 {
public static void main(String []args){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adarsh P\\Desktop\\selenium-java-3.0.1\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://newtours.demoaut.com/");
	driver.findElement(By.linkText("REGISTER")).click();
	WebElement drop = driver.findElement(By.name("country"));
	
	Select act = new Select(drop);
	act.selectByVisibleText("NETHERLANDS");
	
	//String text = driver.findElement(By.name("country")).getText();
	//System.out.println(text);
	driver.close();
}
}
