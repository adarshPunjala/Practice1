package org.retailmenot.tests;

import java.io.IOException;

import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.retailmenot.lib.AppLibrary;
import org.retailmenot.pages.HomePage;
import org.retailmenot.pages.ProductDealsPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
@Listeners(TestListenerAdapterEx.class)
public class RetailMeNotTests {
	
	static WebDriver driver;
	ProductDealsPage dealsPage;
	HomePage hPage; 
	@Parameters({"browserType","url"})
	@BeforeClass
	public void setUp(String browserType,String url) throws IOException
	{

	if(browserType.equals("FF"))
	{
		driver = new FirefoxDriver();
	}
	else if(browserType.equals("IE"))
	{
		System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}
	else
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	}		
	driver.get(url);
	
	//loading the property file
	AppLibrary.loadObjectInfo();
	
	hPage = new HomePage(driver);
	
	hPage.waitforMsgBox();
	
	
} 
	//Invoke the readExcel method
	@DataProvider(name="DP")
	public String[][] feedData() throws BiffException, IOException
	{
		
		String input[][] = AppLibrary.readXlsFile();
		return input;		
	}
	
	
	
	
	@Parameters({"expected"})
	@Test
	public void validateProudctDealsPage(String expected)
	{
		 
		 hPage.browseProductDeals();
		 
		 dealsPage = new ProductDealsPage(driver);
		 boolean result = dealsPage.validateText(expected);
		 Assert.assertTrue(result);
		 
	}
	
	@Test(dependsOnMethods={"validateProudctDealsPage"},dataProvider="DP")
	public void validateDealCount(String dealName,String dealCount)
	{		 
         int actual = dealsPage.getDealsCount(dealName);
         int expected = Integer.parseInt(dealCount);
         Assert.assertEquals(actual, expected);
	}


}





