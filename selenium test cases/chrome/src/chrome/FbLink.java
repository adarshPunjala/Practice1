package chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLink {
	public static void main (String[] args){
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		String title = driver.getTitle();
		String pagesource = driver.getPageSource();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		
		
		
		/*System.out.println(pagesource);
		System.out.println(title);*/
	}

}
