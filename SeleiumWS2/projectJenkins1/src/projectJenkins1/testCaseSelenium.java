package projectJenkins1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testCaseSelenium {
	@Test
	public void login(){
	//public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adarsh P\\Desktop\\AllSeleniumTools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("u_0_o")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
			
	
	}

}
