package com.capgemini.mrchecker.selenium.mts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.capgemini.mrchecker.common.mts.utils.Utils;

import io.qameta.allure.Step;

public class ThaiLoginPage extends MyThaiStarBasePage {
	
	private static final By	usernameSearch		= By.name("username");
	private static final By	passwordSearch		= By.name("password");
	private static final By	accessButtonSearch	= By.name("submitLogin");
	
	@Override
	protected By getDisplayableElementSelector() {
		return passwordSearch;
	}
	
	@Override
	public String pageTitle() {
		return "";
	}
	
	@Step("Enter credentials")
	public void enterCredentials(String username, String password) {
		WebDriverWait driverWait = new WebDriverWait(getDriver(), 10);
		WebElement usernameTextBox = getDriver().findElementDynamic(usernameSearch);
		WebElement passwordTextBox = getDriver().findElementDynamic(passwordSearch);
		
		Utils.sendKeysWithCheck(username, usernameSearch, getDriver(), getWebDriverWait());
		Utils.sendKeysWithCheck(password, passwordSearch, getDriver(), getWebDriverWait());
		
		getDriver().findElementDynamic(accessButtonSearch)
				.click();
	}
}