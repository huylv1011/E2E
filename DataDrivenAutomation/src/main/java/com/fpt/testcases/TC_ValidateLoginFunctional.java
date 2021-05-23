package com.fpt.testcases;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fpt.base.DriverInstance;
import com.fpt.datagenerators.DataGenerator;
import com.fpt.pages.LoginPage;

public class TC_ValidateLoginFunctional extends DriverInstance {

	@Test(dataProvider = "Excell", dataProviderClass = DataGenerator.class)
	public void tc_validate_login_functional(String uname, String pass) {
		LoginPage login = new LoginPage(driver);
		login.enterUsername(uname);
		login.enterPassword(pass);
		login.clickLogin();
	}

	// static way data driven
	/*
	 * @DataProvider(name = "static") public Object[][] testDataGenerator(){
	 * Object[][] data =
	 * {{"user111","pass11111"},{"user222","pass2222"},{"user111","pass11111"}};
	 * return data; }
	 */

	

}
