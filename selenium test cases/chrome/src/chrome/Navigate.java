package chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.getCurrentUrl();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate().to("https://www.facebook.com/login/");
		String link = driver.getCurrentUrl();
		System.out.println(link);

	}

}
