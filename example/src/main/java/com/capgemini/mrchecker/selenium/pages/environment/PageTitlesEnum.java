package com.capgemini.mrchecker.selenium.pages.environment;

public enum PageTitlesEnum {
	LOGIN_PAGE("Log In to Bank.com"),
	REGISTRATION("Registration | Demoqa"),
	FRAMEANDWINDOWS("Frames and windows | Demoqa"),
	MAIN_PAGE("ToolsQA – Demo Website to Practice Automation – Demo Website to Practice Automation"),
	CREATE_USERNAME_PAGE(""),
	MAIN_PAGE_CLASSIC(""),
	FULL_VIEW_TAB("");

	private final String value;

	PageTitlesEnum(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}
}