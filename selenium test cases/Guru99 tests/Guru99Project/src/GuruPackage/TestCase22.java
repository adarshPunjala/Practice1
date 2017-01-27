package GuruPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import GuruPackageScreenShot.Screenshot;

public class TestCase22 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adarsh P\\Desktop\\selenium-java-3.0.1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://live.guru99.com/index.php/");
		driver.findElement(By.linkText("MOBILE")).click();
		Select x = new Select(driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select")));
		x.selectByIndex(1);
		Thread.sleep(3000);
		String c = driver.findElement(By.xpath(".//*[@id='product-price-1']/span")).getText();
		System.out.println(c);
		Screenshot.screenshot(driver, "C");
		driver.findElement(By.id("product-collection-image-1")).click();
		String d =driver.findElement(By.xpath(".//*[@id='product-price-1']/span")).getText();
		Screenshot.screenshot(driver, "d");
		
		if(d.equals(c)){
			System.out.println("Prices Matched");
		}else{
			System.out.println("Prices Not Matched");
		}
       driver.close();
	}

}
