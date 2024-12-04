package com.codemind.newtours.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginSucessPage {

	// webdriver reference variable
	WebDriver driver;

	WebElement loginSeccessfullyMsg;
	WebElement copyrightTextMsg;

	public LoginSucessPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getLoginSeccessfullyMsg() {
		return driver.findElement(By.xpath("//h3[text()='Login Successfully']"));
	}

	public String getLoginSeccessfullyMagsText() {
		return getLoginSeccessfullyMsg().getText();
	}

	public WebElement getCopyrightTextMsg() {
		return driver.findElement(By.xpath("//div[contains(text(),'2005')]"));
	}

	public String getCopyrightMsgText() {
		return getCopyrightTextMsg().getText();
	}

}
