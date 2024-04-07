package com.pro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LOginPage {

	WebDriver driver;

	public LOginPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name=\"user-name\"]")

	public WebElement User;

	@FindBy(xpath = "//input[@name=\"password\"]")

	public WebElement Pass;

	@FindBy(xpath = "//input[@class=\"btn_action\"]")

	public WebElement login;

	@FindBy(xpath = "//button[normalize-space()='Open Menu']")

	public WebElement Button;

	@FindBy(xpath = "//a[@id='logout_sidebar_link']")

	public WebElement Logout;

	public void loginPortal(String username, String password) {

		User.sendKeys(username);
		Pass.sendKeys(password);
		login.click();

	}

	public void logout() {

		Button.click();
		Logout.click();

	}
}
