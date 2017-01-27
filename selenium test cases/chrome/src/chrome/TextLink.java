package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextLink {
	public static void main(String []args){
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.findElement(By.linkText("Gmail")).click();
		String link = driver.getCurrentUrl();
		System.out.println(link);
		driver.navigate().back();
		String back = driver.getCurrentUrl();
		System.out.println(back);
		driver.navigate().forward();
		String forward = driver.getCurrentUrl();
		System.out.println(forward);
		driver.navigate().refresh();
		String refresh = driver.getCurrentUrl();
		System.out.println(refresh);
		driver.close();
	}

}
