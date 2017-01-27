package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		driver.switchTo().frame("classFrame");
		
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		System.out.println(driver.getCurrentUrl());
		//System.out.println();
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
	}

}
