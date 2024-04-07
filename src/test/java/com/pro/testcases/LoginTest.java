package com.pro.testcases;


import org.testng.annotations.Test;


import com.pro.pages.LOginPage;
import com.pro.pages.TestBase;

public class LoginTest extends TestBase {

	

	@Test

	void VerifyLogin() {

		LOginPage Lp = new LOginPage(driver);

		String username = "standard_user";
	    String Password = "secret_sauce";

		Lp.loginPortal(username, Password);
       Lp.logout();

}
	
	


}
