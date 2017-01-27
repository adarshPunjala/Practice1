package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ItemsSelecting {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gcrit.com/build3/");
		driver.findElement(By.xpath(".//*[@id='bodyContent']/div/div[1]/a[1]/u")).click();
		driver.findElement(By.name("email_address")).sendKeys("adarshpunjala12@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Adarsh3033");
		driver.findElement(By.id("tdb5")).click();
		String a = driver.getCurrentUrl();
        System.out.println(a); 
        if(a.equals("http://www.gcrit.com/build3/index.php")){
        	System.out.println("Login successful");
        }
        else{
        	System.out.println("Login failed");
        }
        driver.findElement(By.xpath(".//*[@id='columnLeft']/div[1]/div[2]/a[3]")).click();
        driver.findElement(By.xpath(".//*[@id='bodyContent']/div/div/div/table/tbody/tr/td[2]/a[2]")).click();
        driver.findElement(By.id("tdb5")).click();
        driver.findElement(By.name("cart_quantity[]")).sendKeys("3");
        driver.findElement(By.name("cart_quantity[]")).getText();
        driver.findElement(By.xpath(".//*[@id='tdb5']")).click();
        driver.findElement(By.name("ui-button-text")).click();
	}

}
