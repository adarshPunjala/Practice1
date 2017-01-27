package chrome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
//Launch browser
	WebDriver driver = new ChromeDriver();
	
public void adminlogin(){
	//WebDriver driver = new ChromeDriver();
	driver.get("http://www.gcrit.com/build3/admin/login.php");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("password")).sendKeys("admin@123");
	driver.findElement(By.id("tdb1")).click();	
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
}
public void adminlogin(String username, String password){
	driver.get("http://www.gcrit.com/build3/admin/login.php");
	driver.findElement(By.name("username")).sendKeys("username");
	driver.findElement(By.name("password")).sendKeys("password");
	driver.findElement(By.id("tdb1")).click();
	driver.close();
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Methods obj = new Methods();
obj.adminlogin("admina", "uuda");
	}
	
}
