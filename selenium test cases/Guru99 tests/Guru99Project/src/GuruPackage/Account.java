package GuruPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Account {
	public static void main (String[]args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adarsh P\\Desktop\\selenium-java-3.0.1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://live.guru99.com/index.php/");
		driver.findElement(By.xpath("//span[text()='Account'][contains(@class,'label')]")).click();
		driver.findElement(By.linkText("My Account")).click();
		String a = driver.getCurrentUrl();
		System.out.println(a);
		if(a.equals("http://live.guru99.com/index.php/customer/account/login/")){
			System.out.println("Entered Account page");
		}else{
			System.out.println("Home Page");
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='login-form']/div/div[1]/div[2]/a")).click();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("adarsh");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Punjala");
		driver.findElement(By.id("email_address")).sendKeys("adarshpunjala12@gmail.com");
		driver.findElement(By.id("password")).sendKeys("9989535879");
		driver.findElement(By.id("confirmation")).sendKeys("9989535879");
		driver.findElement(By.xpath("//button[@class='button']")).click();
		


		System.out.println("Test Case ended");
		driver.close();
				
	}

}
