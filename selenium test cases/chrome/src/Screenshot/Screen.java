package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Screen {

	public static void Screenshot(WebDriver driver,String ScreenshotName){
		// TODO Auto-generated method stub
		try {
			TakesScreenshot ss = (TakesScreenshot)driver;
			
			File source = ss.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(source, new File("./pics/"+ScreenshotName+".png"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}