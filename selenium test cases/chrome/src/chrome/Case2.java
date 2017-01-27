package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case2 {
	public static void main(String[] args){
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys("sizzling_adarsh@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("adarsh3033");
		driver.findElement(By.id("loginbutton")).click();
		//driver.findElement(By.name("q")).sendKeys("Bhanu Prakash");
	
		String url = driver.getCurrentUrl();
		if(url.equals("https://www.facebook.com/")){
			System.out.println("TestCase Passed");
		}
		else{
			System.out.println("TestCase Failed");
		}
		
	}

}
