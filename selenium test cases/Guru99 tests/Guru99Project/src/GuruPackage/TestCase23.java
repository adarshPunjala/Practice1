package GuruPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase23 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Adarsh P\\Desktop\\selenium-java-3.0.1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://live.guru99.com/index.php/");
		driver.findElement(By.linkText("MOBILE")).click();
		Select x = new Select(driver.findElement(
				By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select")));
		x.selectByIndex(1);
		Thread.sleep(3000);
		driver.findElement(By.id("product-collection-image-1")).click();
		System.out.println("Item clicked");
		driver.findElement(By.xpath(".//*[@id='product_addtocart_form']/div[4]/div/div/div[2]/button")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("qty")).click();
		driver.findElement(By.id("qty")).clear();
		driver.findElement(By.id("qty")).sendKeys("1000");
		//driver.findElement(By.xpath(".//*[@id='product_addtocart_form']/div[4]/div/div/div[2]/button")).click();
		
		
		System.out.println("qty selected");
		driver.findElement(By.xpath(".//*[@id='product_addtocart_form']/div[4]/div/div/div[2]/button")).click();
		
		System.out.println("qty updated");
		String a =driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div/div/ul/li/ul/li/span")).getText();
		System.out.println(a);
		driver.findElement(By.id("empty_cart_button")).click();
		String b =driver.getCurrentUrl();
		if(b.equals("http://live.guru99.com/index.php/checkout/cart/")){
			System.out.println("Entered in to Cart");
			String c =driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div/div[2]/p[1]")).getText();
			System.out.println(c);
System.out.println("Test Case Passed");
		}else{
			System.out.println("Test Case Failed");
		}
		driver.close();
System.out.println("Test case finished");		

	}
}