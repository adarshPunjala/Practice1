package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UDTestCase1 {
	@Test
	public void login(){
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier");
	//	driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.id("Email")).sendKeys("adarshpunjala12");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.name("Passwd")).sendKeys("9989535879");
		driver.findElement(By.id("signIn")).click();
	}
	

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
//UDTestCase1 obj = new UDTestCase1();
//obj.login();
	

}
