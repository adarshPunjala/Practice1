package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Error {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gcrit.com/build3/login.php");
		driver.findElement(By.name("email_address")).sendKeys("adarshpunjala12@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Adarsh3033");
		driver.findElement(By.id("tdb5")).click();
		String url = driver.getCurrentUrl();
		System.out.println("url::"+ url);
		String a=" ";
		try
		{
		 a = driver.findElement(By.className("messageStackError")).getText();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
			 System.out.println("before first if :::");
			if (a.contains("Error: No match for E-Mail Address and/or Password")) {
				System.out.println("Test passed");
			}
		 System.out.println("before if :::");
		  if(!url.equals("http://www.gcrit.com/build3/login.php")){
			System.out.println("Test Failed");
		}
		driver.close();	
	}
	
}
