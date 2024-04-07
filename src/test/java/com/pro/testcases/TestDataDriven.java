package com.pro.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pro.Utilities.ExcelDataProvider;
import com.pro.pages.LOginPage;
import com.pro.pages.TestBase;

public class TestDataDriven extends TestBase {

	String filename = System.getProperty("user.dir") + "./TestData/New XLSX Worksheet.xlsx";

	@Test(priority = 1, dataProvider = "loginDataProvider")
	void VerifyLogin(String userName, String userPass)

	{

		LOginPage Lp = new LOginPage(driver);

		//String username = "standard_user";
		//String Password = "secret_sauce";

		Lp.loginPortal(userName, userPass);
		
		Lp.logout();

	}

	@DataProvider(name = "loginDataProvider")
	public String[][] loginDataProvider()

	{

		int totalrow = ExcelDataProvider.getRowCount(filename, "Credentials");
		int totalcell = ExcelDataProvider.getColumnCount(filename, "Credentials");

		String data[][] = new String[totalrow - 1][totalcell];

		for (int i = 1; i < totalrow; i++) {

			for (int j = 0; j < totalcell; j++)

			{

				data[i - 1][j] = ExcelDataProvider.getCellValue(filename, "Credentials", i, j);

			}
		}

		return data;
	}

}
