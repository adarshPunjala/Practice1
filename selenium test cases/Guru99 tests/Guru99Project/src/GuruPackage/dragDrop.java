package GuruPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class dragDrop {
	
	//public static void main(String []args){
	@Test
	public void draganddrop(){	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adarsh P\\Desktop\\selenium-java-3.0.1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.findElement(By.id("box1")).click();
		WebElement source = driver.findElement(By.id("box1"));
		WebElement destination = driver.findElement(By.xpath("//div[@id='box101']"));
		
		Actions builder = new Actions(driver);
		builder.dragAndDrop(source, destination).perform();
		System.out.println("Test Case Passed");
		driver.close();
		
	}

}
