package com.pro.pages;

import java.awt.Desktop;
import java.io.File;
import java.lang.reflect.Method;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.pro.Utilities.BrowserFactory;
import com.pro.Utilities.ConfigDataProvider;
import com.pro.Utilities.ExcelDataProvider;


public class TestBase {

	public WebDriver driver;
	public ConfigDataProvider config=new ConfigDataProvider();
	
	@BeforeClass
public void setup() {
	
	
	driver = BrowserFactory.launchapplication(driver, config.getBrowser(), config.getUrl());

	
}
	
	
@AfterClass
public void Teardown() {

	BrowserFactory.quitBrowser(driver);

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
