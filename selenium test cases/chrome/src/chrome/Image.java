package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		System.out.println(driver.findElement(By.xpath(".//*[@id='hplogo']/a/img")).isDisplayed());
		System.out.println(driver.findElement(By.xpath(".//*[@id='hplogo']/a/img")).getAttribute("title"));
		System.out.println(driver.findElement(By.xpath(".//*[@id='hplogo']/a/img")).getText());
		

	}

}
