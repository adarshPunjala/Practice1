package chrome;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Screenshot.SS;

public class AccountRegistration {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.gcrit.com/build3/login.php");
	driver.findElement(By.xpath(".//*[@id='tdb4']/span[2]")).click();
	driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")).click();
	driver.findElement(By.name("firstname")).sendKeys("Adarsh");
	driver.findElement(By.name("lastname")).sendKeys("Punjala");
	driver.findElement(By.id("dob")).sendKeys("07/12/1992");
	driver.findElement(By.name("email_address")).sendKeys("adarshpunjala120@gmail.com");
	driver.findElement(By.name("street_address")).sendKeys("22-20, V.V.Nagar");
	driver.findElement(By.name("postcode")).sendKeys("500035");
	driver.findElement(By.name("city")).sendKeys("DSNR");
	driver.findElement(By.name("state")).sendKeys("Telangana");
	driver.findElement(By.name("country")).sendKeys("india");
	driver.findElement(By.name("telephone")).sendKeys("9989535879");
	driver.findElement(By.name("password")).sendKeys("Adarsh3033");
	driver.findElement(By.name("confirmation")).sendKeys("Adarsh3033");
	driver.findElement(By.id("tdb4")).click();
	
	

	}

}
