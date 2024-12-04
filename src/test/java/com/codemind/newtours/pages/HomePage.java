package com.codemind.newtours.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	// webdriver instance memeber
	WebDriver driver;

	// webelements instance memebrs
	WebElement userNameTextField;
	WebElement passwordTextField;
	WebElement submitBtn;

	// constructor to initialize webdriver driver
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	// webelement related getter methods
	public WebElement getUserNameTextField() {
		return driver.findElement(By.xpath("//input[@name='userName']"));
	}

	public WebElement getPasswordTextField() {
		return driver.findElement(By.xpath("//input[@name='password']"));
	}

	public WebElement getSubmitBtn() {
		return driver.findElement(By.xpath("//input[@name='submit']"));
	}

	// weblements related methods
	public void setUserNameTextField(String userName) {
		getUserNameTextField().sendKeys(userName);
	}

	public void setPasswordTextField(String password) {
		getPasswordTextField().sendKeys(password);
	}

	public void clickOnSubmitBtn() {
		getSubmitBtn().click();
	}

}
