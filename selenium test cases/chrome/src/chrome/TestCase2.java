package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.partialLinkText("Gmail")).click();
		String url = driver.getCurrentUrl();
			if(!url.equals("https://mail.google.com/mail/?tab=wm")){
			System.out.println("Google page contains gmail link");
			}
			else
			{
				System.out.println("Google page doesn't contain Gamil link");
			}
			driver.close();
	}

}
