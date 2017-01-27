package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TravelTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.studentuniverse.com/flights");
		driver.findElement(By.id("origin1")).sendKeys("clt");
		driver.findElement(By.id("destination1")).sendKeys("HYD");
		//driver.findElement(By.id("flightDate1")).click();
		//driver.findElement(By.className("su-datepicker-day ng-binding ng-scope")).click();
		//driver.findElement(By.id("flightDate2")).click();
		//driver.findElement(By.className("su-datepicker-day ng-binding ng-scope")).click();
		WebElement a = driver.findElement(By.id("passengerNumber"));
        Select b =new Select(a);
        b.selectByIndex(2);
       
        b.selectByValue("5");
        driver.close();
	}

}