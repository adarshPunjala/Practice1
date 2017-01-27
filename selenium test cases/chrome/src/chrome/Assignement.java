package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignement {

	
	@Test
	public void asig(){
	//public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
		driver.findElement(By.linkText("Create account")).click();
		String url = driver.getCurrentUrl();
			System.out.println(url);
		if(url.contains("wikipedia.org")){
			System.out.println("The clicked url is an internal link");
		}
		else{
			System.out.println("The clicked url is an external link");
		}
			driver.navigate().back();
		driver.findElement(By.partialLinkText("seleniumhq.org")).click();
		driver.getCurrentUrl();
		if(! url.contains("wikipedia.org")){
		System.out.println("The clicked url is an internal link");
		}
		else{
			System.out.println("The clicked url is an external link");
		}
driver.close();
	}

}
