package com.pro.testcases;

import org.testng.annotations.Test;

import com.pro.pages.AddToCart;
import com.pro.pages.Checkout;
import com.pro.pages.LOginPage;
import com.pro.pages.TestBase;

public class CheckoutTest extends TestBase {

	@Test
	void checkout() throws Exception {

		LOginPage Lp = new LOginPage(driver);

		String username = "standard_user";

		String Password = "secret_sauce";

		Lp.loginPortal(username, Password);

		AddToCart add = new AddToCart(driver);
		add.AddCart();

		Checkout check = new Checkout(driver);

		
		
		check.BuyProduct("Saiful", "Chowdhury", "14235");
		Thread.sleep(4000);

	}

}
