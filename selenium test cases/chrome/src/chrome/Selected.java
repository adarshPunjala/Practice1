package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.jabong.com/men/clothing/polos-tshirts/?source=topnav_men");
	    WebElement a = driver.findElement(By.name(""));
System.out.println(a.isDisplayed());//T
System.out.println(a.isEnabled());//T
System.out.println(a.isSelected());//F
a.click();
System.out.println(a.isSelected());//T
a.click();
System.out.println(a.isSelected());//F
	}

}
