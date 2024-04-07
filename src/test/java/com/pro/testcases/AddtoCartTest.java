package com.pro.testcases;

import org.testng.annotations.Test;

import com.pro.pages.AddToCart;
import com.pro.pages.LOginPage;
import com.pro.pages.TestBase;

public class AddtoCartTest extends TestBase {

	//String filename = System.getProperty("user.dir") + "./TestData/New XLSX Worksheet.xlsx";

	
	@Test
	void addToCart() {

		LOginPage Lp = new LOginPage(driver);

		String username = "standard_user";

		String Password = "secret_sauce";

		Lp.loginPortal(username, Password);

		AddToCart add = new AddToCart(driver);
		add.AddCart();

	}

}
