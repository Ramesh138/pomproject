package com.pomproject.flows;

import org.openqa.selenium.WebDriver;

import com.pomproject.pages.Page_login;

public class Flow_login  extends Page_login{
	
	
	public Flow_login(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void login(String username,String password) {
		
		getTx_username().sendKeys(username);
		
		getTx_password().sendKeys(password);
		
		getBtn_login().click();
	}

}
