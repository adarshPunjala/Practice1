package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase9 {

	public static void main(String[] args) {
    
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Adarsh P\\Desktop\\selenium-java-3.0.1\\geckodriver-v0.11.1-win64\\geckodriver.exe");
	WebDriver mdriver = new FirefoxDriver();
		mdriver.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier");
	//mdriver.findElement(By.linkText("Gmail")).click();
	String text = mdriver.findElement(By.className("hidden-small")).getText();
		System.out.println(text);
	WebDriver driver = new ChromeDriver();
    driver.get("http://www.gcrit.com/build3/login.php");
    driver.findElement(By.name("email_address")).sendKeys(text);
    driver.findElement(By.name("password")).sendKeys("Adarsh3033");
    //driver.findElement(By.id("tdb5")).click();
    
    
    
    
	}

}
