package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CarMax {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	@Test
	public void Max(){	
	WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.carmax.com/search#Zip=28081");
		driver.findElement(By.xpath(".global-nav--link")).click();
		driver.findElement(By.xpath(".global-nav--item--subnav--item")).click();
		driver.findElement(By.xpath(".btn")).click();
		driver.close();

	}

}
