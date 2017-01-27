package GuruPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass24 {
	@Test
	public void login() throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Adarsh P\\Desktop\\selenium-java-3.0.1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://live.guru99.com/index.php/");
		driver.findElement(By.linkText("MOBILE")).click();
		driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/ul/li[2]/a")).click();
		//driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[3]/div/div[3]/ul/li[2]/a")).click();
		driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div[3]/div[1]/div[2]/div/button")).click();
		String a = driver.getWindowHandle();
		System.out.println(a);
		Set<String> b = driver.getWindowHandles();
		Iterator<String> iterator = b.iterator();
		while(iterator.hasNext()){
			String childWindow = iterator.next();
			if(!a.equalsIgnoreCase(childWindow)){
				driver.switchTo().window(childWindow);
				System.out.println(driver.getTitle());
				driver.manage().window().maximize();
				Thread.sleep(5000);
				String url =driver.getCurrentUrl();
				if(url.equals("http://live.guru99.com/index.php/catalog/product_compare/index/")){
					System.out.println("Child Window");
				}else{
					System.out.println("Parent Window");
				}
				/*String Xperia=driver.findElement(By.linkText("SONY XPERIA")).getText();
			    System.out.println(Xperia);
			    String Iphone = driver.findElement(By.linkText("Iphone")).getText();
			    System.out.println(Iphone);*/
			    driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div[2]/button")).click();
			    driver.close();
			}
		}
		
		
		
		
		
		
		
	}

}
