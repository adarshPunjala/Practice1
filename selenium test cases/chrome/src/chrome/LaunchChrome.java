package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/?tab%3Dwm&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1");
		driver.findElement(By.id("Email")).sendKeys("adarshpunjala12");
		driver.findElement(By.id("next")).click();
		//driver.findElement(By.id("Passwd")).sendKeys("9989535879");
		driver.findElement(By.id("signIn")).click();
		
		String url = driver.getCurrentUrl();
				if (url.equals("https://accounts.google.com/signin/challenge/sl/password#password")){
					System.out.println("Testcase is passed");
					}
	else{
		System.out.println("Testcase is failed");
	}
		
   
	}

}
