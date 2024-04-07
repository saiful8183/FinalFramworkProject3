package com.pro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout {

	WebDriver driver;

	public Checkout(WebDriver driver) {

		this.driver = driver;
PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[name()='path' and contains(@fill,'currentCol')]")

	public WebElement AddCartButton;

	@FindBy(xpath = "//a[@class='btn_action checkout_button']")

	public WebElement CheckOutBtn;

	@FindBy(xpath = "//input[@id='first-name']")

	public WebElement FirstName;

	@FindBy(xpath = "//input[@id='last-name']")

	public WebElement LastName;

	@FindBy(xpath = "//input[@id='postal-code']")

	public WebElement PostCode;

	@FindBy(xpath = "//input[@value='CONTINUE']")

	public WebElement continueBtn;

	public void BuyProduct(String firstName, String lastName, String zipcode) {

		AddCartButton.click();

		CheckOutBtn.click();

		FirstName.sendKeys(firstName);
		LastName.sendKeys(lastName);
		PostCode.sendKeys(zipcode);
		continueBtn.click();

	}

}
