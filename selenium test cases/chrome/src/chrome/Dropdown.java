package chrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.travelmath.com/drive-distance/");
		Select dropdown = new Select(driver.findElement(By.name("path")));
		
		//driver.findElement(By.xpath("#SelectClass")).click();
		dropdown.selectByVisibleText("bus or train");
		
		List<WebElement> e = dropdown.getOptions();
		int itemscount = e.size();
		System.out.println(itemscount);
		
		

	}

}
