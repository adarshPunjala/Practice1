package com.demoaut.newtours.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoaut.newtours.Pages.LoginPage;
import com.demoaut.newtours.Pages.details;
import com.demoaut.newtours.Pages.flightFinder;
import com.demoaut.newtours.Pages.selectFlight;

public class newTours {
	WebDriver driver;

	@BeforeTest
	public void Launch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Adarsh P\\Desktop\\selenium-java-3.0.1\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void TestCase() {
		LoginPage a = new LoginPage(driver);
		flightFinder b = new flightFinder(driver);
		selectFlight c = new selectFlight(driver);
		details d = new details(driver);
		a.applicationLogin("mercury", "mercury");
		b.flight();
		c.travel();
		d.payment();
	}

	@AfterTest
	public void Close() {
		driver.close();
	}

}
