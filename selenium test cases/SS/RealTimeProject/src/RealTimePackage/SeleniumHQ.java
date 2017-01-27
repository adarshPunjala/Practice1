package RealTimePackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
@Test
public class SeleniumHQ {
	public static void main(String [] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adarsh P\\Desktop\\selenium-java-3.0.1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
	driver.switchTo().frame(1);
	TakesScreenshot ss = (TakesScreenshot)driver;
	File source = ss.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source, new File("./Snapshots.png"));
	System.out.println("Screenshot taken");
	}

}
