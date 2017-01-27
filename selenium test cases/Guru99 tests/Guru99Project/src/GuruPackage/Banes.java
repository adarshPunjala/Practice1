package GuruPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;

public class Banes {
	public static void main(String[] args){
		WebDriver driver = new ChromeDriver();
		driver.get("http://barnesandnoble.com/");
		driver.findElement(By.className("close-modal")).click();
		WebElement link = driver.findElement(By.xpath(".//*[@id='topNav1']/a"));
		
		
	}

}
