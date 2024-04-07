package com.pro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {

	WebDriver driver;

	public AddToCart(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='inventory_list']//div[1]//div[3]//button[1]")

	public WebElement Add;
	
	
	
	public void AddCart() {
		
		Add.click();	
		
		
	}

}
