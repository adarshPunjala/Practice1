package chrome;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {
	public static void main(String[] args){
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElement(By.xpath("#demon_content>div>input")).click();
		driver.findElement(By.id("usernameId")).sendKeys("gcreddy7");
		driver.findElement(By.className("loginPassword")).sendKeys("gld938");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Captcha");
		String captcha = scan.nextLine();
		driver.findElement(By.className("loginCaptcha")).sendKeys(captcha);
		driver.findElement(By.id("loginbutton")).click();
		
	} 

}
