package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositiveAndNegative {
static int i;
static String username, password, iteration;

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	for(i=1; i<=2; i++){
		if(i == 1){
			username = "admin";
			password = "admin@123";
			iteration = "iteration 1:";
		}
		else if(i == 2){
			username = "admina";
			password = "admin@123a";
			iteration = "iteration 2:";
		}
	driver.get("http://www.gcrit.com/build3/login.php");
	driver.findElement(By.name("email_address")).sendKeys("adarshpunjala12@gmail.com");
	driver.findElement(By.name("password")).sendKeys("Adarsh3033");
	driver.findElement(By.id("tdb5")).click();
	String url = driver.getCurrentUrl();
	if(url.contains("http://www.gcrit.com/build3/index.php")){
		String ErrorMessage = driver.findElement(By.className("messageStackError")).getText();
		if(ErrorMessage.contains("Error: No match for E-Mail Address and/or Password.")){
			System.out.println("Handling invalid inputs");
		}
		
		else{
			System.out.println("not handling invalid inputs");
		}
	}
	}
	


