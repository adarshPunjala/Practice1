package com.demoaut.newtours.TestScripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dataProject {
	WebDriver driver;
	@BeforeTest
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Adarsh P\\Desktop\\selenium-java-3.0.1\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test
	public void data() throws IOException{
	String[][] data = excelDataProvider.getData("seleniumexcel.xlsx", "Credentials");
	for (int i=1; i<data.length;i++){
		String username = data[i][0];
		String password = data[i][1];
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();
	}

}
}