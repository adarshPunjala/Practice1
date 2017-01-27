package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.carmax.com/");
	Actions builder = new Actions(driver);
	WebElement menuElement = driver.findElement(By.linkText("FIND YOUR CAR"));
	builder.moveToElement(menuElement).build().perform();
	driver.findElement(By.className("global-nav--item--subnav--item")).click();

	}

}
