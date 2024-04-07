package com.pro.Utilities;


import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ITestListenersClass implements ITestListener {
	
	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;

	
 
	
	// for report and attatch screenshot
	
//	extentTest = extentReports.createTest(context.getName());
	
	public void configurReport() 
	{
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("Reports/report.html");
		//htmlReporter = new ExtentSparkReporter("ExtentListenerReportDemo.html");

		 reports = new ExtentReports();

		//reports = new ExtentReports(); // for report and attatch screenshot
		//ExtentSparkReporter htmlReporter = new ExtentSparkReporter("Reports/report.html"); // for report and attatch

		 
		 reports.attachReporter(htmlReporter);
		//reports.attachReporter(htmlReporter);

		 reports.setSystemInfo("Machine", "RaviPc");

		 reports.setSystemInfo("OS", "Windows11");

		//reports.setSystemInfo("OS", System.getProperty("os.name")); // for report and attatch screenshot
		//reports.setSystemInfo("Java Version", System.getProperty("java.version")); // for report and attatch
																					// screenshot

		 htmlReporter.config().setDocumentTitle("Extent listener Report demo");

		 htmlReporter.config().setReportName("This is my first report");

		 htmlReporter.config().setTheme(Theme.STANDARD);

	}

	
	
	
	
	public void OnTestStart(ITestResult result)
	{
		System.out.println("Name of the Test Method succesfully executed" + result.getName());
	}

	
	
	
	
	
	
	public void OnTestSuccess(ITestResult result,String browserName, ITestContext context) {

		System.out.println("Name of the Test Method succesfully executed" + result.getName());

		test = reports.createTest(context.getName());
		
		
		
		test.log(Status.PASS,MarkupHelper.createLabel("Name of the Skip case is: " + result.getName(), ExtentColor.GREEN));

	}

	
	
	
	
	
	
	
	
	
	
	
	public void OnTestFailure(ITestResult result,String browserName, ITestContext context) {

		System.out.println("Name of the Test Method Failed:" + result.getName());

		test = reports.createTest(context.getName());
		test.log(Status.FAIL,MarkupHelper.createLabel("Name of the failed  case is:" + result.getName(), ExtentColor.RED));

		String screenshotPath = System.getProperty("user.dir") + "\\ScreenShot\\" + result.getName() + ".png";

		File screenShotFile = new File(screenshotPath);

		if (screenShotFile.exists()) {

			test.fail("Capture screenshot are bellow:" + test.addScreenCaptureFromPath(screenshotPath));

		}

	}

	public void OnTestSkip(ITestResult result) {

		System.out.println("Name of the Test Method Skiped" + result.getName());

		test = reports.createTest(result.getName());
		test.log(Status.SKIP,MarkupHelper.createLabel("Name of the skip  case is:" + result.getName(), ExtentColor.YELLOW));

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithinTimeOut(ITestResult result,String browserName, ITestResult context) {

		onTestFailure(context);

	}

	public void onStart(ITestContext context) {
		 configurReport();
		System.out.println("On start method invoked");

	}

	public void onFinish(ITestContext context) {

		
		  System.out.println("On Finish method invoked");
		  reports.flush(); // for report and attatch screenshot 
		  try {
			  Desktop.getDesktop().open(new File("Reports/report.html")); }
		  catch (IOException e) {
		  
		  System.out.println("Flashed" + e.getMessage());
		  
		  }
		  
		 
	}

}
