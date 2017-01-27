package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Banes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.barnesandnoble.com/");
		//WebElement a = 
		Actions builder = new Actions(driver);
		WebElement a = driver.findElement(By.xpath(".//*[@id='topNav1']/a"));
		builder.moveToElement(a).build().perform();
		driver.findElement(By.linkText("Biography")).click();

	}

}
