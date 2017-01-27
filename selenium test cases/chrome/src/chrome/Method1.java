package chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method1 extends Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
    Method1 obj1 = new Method1();
    obj1.adminlogin();
   String a = driver.getCurrentUrl();
    
    System.out.println(a);
    if(a.equals("http://www.gcrit.com/build3/admin/index.php")){
    	System.out.println("Login Successful");
    }
    else{
    System.out.println("login successful");
	}
    driver.quit();
	}
}

