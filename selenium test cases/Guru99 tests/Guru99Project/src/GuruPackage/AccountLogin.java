package GuruPackage;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountLogin {
	public static void main (String[]args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adarsh P\\Desktop\\selenium-java-3.0.1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://live.guru99.com/index.php/");
		driver.findElement(By.xpath("//span[text()='Account'][contains(@class,'label')]")).click();
		driver.findElement(By.linkText("My Account")).click();
		String a = driver.getCurrentUrl();
		System.out.println(a);
		if(a.equals("http://live.guru99.com/index.php/customer/account/login/")){
			System.out.println("Login Account page");
		}else{
			System.out.println("Home Page");
		}
        driver.findElement(By.id("email")).sendKeys("adarshpunjala12@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("9989535879");
        driver.findElement(By.linkText("MY WISHLIST")).click();
        driver.findElement(By.className("button btn-cart")).click();
        driver.findElement(By.className("button btn-proceed-checkout btn-checkout")).click();
        driver.findElement(By.id("billing:street1")).sendKeys("2650 E Clg pl");
        driver.findElement(By.id("billing:city")).sendKeys("Fullerton");
        driver.findElement(By.id("billing:region_id")).click();
        driver.findElement(By.id("billing:region_id")).sendKeys("c");
        driver.findElement(By.id("billing:region_id")).click();
        Select opt = Select(driver.findElement(By.id("billing:country_id")));
        
        
}

	private static Select Select(WebElement findElement) {
		// TODO Auto-generated method stub
		return null;
	}
}