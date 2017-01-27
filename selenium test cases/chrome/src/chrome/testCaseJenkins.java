package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testCaseJenkins {
	public void loginGmail(){
		WebDriver driver = new ChromeDriver();
		driver.get("www,google.com");
		driver.findElement(By.linkText("Gmail")).click();
		driver.close();
	}

}
