package com.codemind.newtours.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.codemind.newtours.pages.HomePage;
import com.codemind.newtours.pages.LoginSucessPage;
import com.codemind.newtours.util.Utilities;

public class VerifyValidLogin extends BaseTest {

	HomePage homePage;
	LoginSucessPage loginSucessPage;

	@Test
	public void verifyValidLogin() {

		homePage = new HomePage(driver);
		loginSucessPage = new LoginSucessPage(driver);
		homePage.setUserNameTextField(Utilities.getProperty("username"));
		homePage.setPasswordTextField(Utilities.getProperty("password"));
		homePage.clickOnSubmitBtn();
		Assert.assertEquals(loginSucessPage.getLoginSeccessfullyMagsText(), "Login Successfully",
				"Login successfully msg is incorrect");
		Assert.assertTrue(loginSucessPage.getCopyrightMsgText().contains("2005"), "Copywrite year is incorrect");

	}

	@Test
	public void verifyHomePageTitle() {
		Assert.assertEquals(driver.getTitle(), "Welcome: Mercury Tours", "Title is not matching");
	}

}
