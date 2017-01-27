package chrome;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



@Test
public class screenShot {
	public WebDriver driver;
	private File scrFile;
public void openBrowser(){
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	try{
		driver.findElement(By.id("testing")).sendKeys("test");
			}
	catch (Exception e){
		System.out.println("I m in exception");
		getscreenshot();
	}
}
public void getscreenshot() {
	// TODO Auto-generated method stub
	File srcFile = (File) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	try {
		FileUtils.copyFile(scrFile, new File("c:\\screenshot.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
