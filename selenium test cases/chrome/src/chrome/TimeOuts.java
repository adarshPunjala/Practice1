package chrome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.testng.annotations.Test;

public class TimeOuts {
public static void main(String[]args) throws Exception{
	//@Test
//	public void gmailLogin(){
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
		driver.findElement(By.id("Email")).sendKeys("adarshpunjala12");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys("9989535879");
		
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(8000);
		WebElement count=driver.findElement(By.xpath(".//*[@id=':io']/span/span[3]"));
		
		
		System.out.println(count.getText());
		System.out.println("TestCase Finished");
		driver.close();
		
	}
}