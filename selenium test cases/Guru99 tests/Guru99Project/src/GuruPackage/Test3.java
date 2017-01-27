package GuruPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adarsh P\\Desktop\\selenium-java-3.0.1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("mngr57008");
		driver.findElement(By.name("password")).sendKeys("dUjysUr");
		driver.findElement(By.name("btnLogin")).click();
		String a = driver.getCurrentUrl();
		if(a.equals("http://demo.guru99.com/V4/manager/Managerhomepage.php")){
			System.out.println("Login Successful");
		}
		else{
			System.out.println("Login Failed");
		}
driver.close();
	}

}
