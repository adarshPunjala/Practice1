package org.retailmenot.tests;

  

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;

public class TestListenerAdapterEx extends TestListenerAdapter {

	@Override
	public void onTestSuccess(ITestResult tr) {
		try {

			Reporter.log("<font color=\"blue\"><h2> The Test Method "
					+ tr.getName() + " is Success" + " </h2></font>");
			String ImageFileName = new SimpleDateFormat("MM-dd-yyyy_HH-ss")
					.format(new GregorianCalendar().getTime()) + ".png";
			System.out.println(new GregorianCalendar().getTime());
			
	
			File scrFile = ((TakesScreenshot) RetailMeNotTests.driver)
					.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File(ImageFileName));
			String userDirector = System.getProperty("user.dir") + "\\";
			Reporter.log("<a href=\"" + userDirector + ImageFileName
					+ "\"><img src=\"file:///" + userDirector + ImageFileName
					+ "\" alt=\"\"" + "height='100' width='100'/> " + "<br />");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult tr) {
		
			Reporter.log("<font color=\"red\"><h2> The Test Method "
					+ tr.getName() + " is Failed" + "</h2></font>");
			String failureImageFileName = new SimpleDateFormat(
					"MM-dd-yyyy_HH-ss").format(new GregorianCalendar()
					.getTime())
					+ ".png";
			File scrFile = ((TakesScreenshot) RetailMeNotTests.driver)
					.getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(scrFile, new File(failureImageFileName));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String userDirector = System.getProperty("user.dir") + "\\";
			Reporter.log("<a href=\"" + userDirector + failureImageFileName
					+ "\"><img src=\"file:///" + userDirector
					+ failureImageFileName + "\" alt=\"\""
					+ "height='100' width='100'/> " + "<br />");
		
	}
}