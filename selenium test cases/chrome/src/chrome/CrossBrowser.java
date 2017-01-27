package chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CrossBrowser {
	public static WebDriver driver;
	public static int browser;
	public static String browserName;

	public static void main(String[] args) {
		for (browser = 1; browser <= 3; browser++) {

			if (browser == 1) {
				System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\Adarsh P\\Desktop\\selenium-java-3.0.1\\geckodriver-v0.11.1-win64\\geckodriver.exe");
				driver = new FirefoxDriver();
				browserName = "Mozilla Firefox Browser: ";
			} else if (browser == 2) {
				System.setProperty("Webdriver.gecko.driver",
						"C:\\Users\\Adarsh P\\Desktop\\selenium-java-3.0.1\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
				browserName = "Chrome browser: ";
			} /*else if (browser == 3) {
				System.setProperty("Webdriver.gecko.driver",
						"C:\\Users\\Adarsh P\\Desktop\\selenium-java-3.0.1\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				browserName = "Internet Explorer: ";
			}*/
			driver.get("https://www.google.com/");

			String Title = driver.getTitle();
			if (Title.equals("Google")) {
				System.out.println(browserName + "Google launched- test passed");
			} else {
				System.out.println(browserName + "Google launch failed- test failed");
			}

		}
	}
}
