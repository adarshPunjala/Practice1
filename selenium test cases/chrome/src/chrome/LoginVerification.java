package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gcrit.com/build3/");
		driver.findElement(By.xpath(".//*[@id='tdb3']/span[2]")).click();
		driver.findElement(By.name("email_address")).sendKeys("adarshpunjala12@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Adarsh3033");
		driver.findElement(By.id("tdb5")).click();

		String url = driver.getCurrentUrl();
		if (url.equals("http://www.gcrit.com/build3/account.php")) {
			System.out.println("login successful");
		} else {
			System.out.println("Login failed");
		}
		driver.close();
	}

}