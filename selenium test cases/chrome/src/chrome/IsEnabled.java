package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {
	public static void main(String [] args){
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.fullerton.edu/");
        boolean a= driver.findElement(By.xpath(".//*[@id='CSUFGeneral']")).isSelected();
        		System.out.println(a);
        driver.findElement(By.xpath(".//*[@id='CSUFPeople']")).click();
        System.out.println(a);
        a= driver.findElement(By.xpath(".//*[@id='CSUFPeople']")).isSelected();
        System.out.println(a);
        String b= driver.findElement(By.xpath(".//*[@id='content']/div/div[2]/h3[1]")).getText();
        System.out.println(b);
	driver.quit();
	
	}

}
