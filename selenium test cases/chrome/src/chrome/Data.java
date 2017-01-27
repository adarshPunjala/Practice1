package chrome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data {

	
@Test(dataProvider="WordData")
	
	public void login(String username, String password)throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.demo.guru99.com/V4/index.php");
		

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.demo.guru99.com/V4/index.php");
		
		driver.findElement(By.name("uid")).sendKeys(username);
		
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.name("btnLogin")).click();
		
		//driver.close();
		
		driver.quit();
	}
@DataProvider(name="WordData")

public Object[][] PassData(){

	resusableexcel config = new resusableexcel();
	int x =config.getRowCount(0);
	
	
	Object[][] data = new Object[x][2];
	for (int i=0; i<x;i++){
		data[i][0] = config.getData(0, i, 0);
		data[i][1] = config.getData(0, i, 1);
		return data;
	}
	
}

}



