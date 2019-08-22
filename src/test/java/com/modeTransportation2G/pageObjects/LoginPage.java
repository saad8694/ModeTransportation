package com.modeTransportation2G.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	
	{
		ldriver = rdriver ;
		PageFactory.initElements(rdriver, this);
	}
	
	// Login Form fields
	
	@FindBy (name = "Username")
	WebElement txtUserName;
	
	@FindBy (name = "Password")
	WebElement txtPassword;
	
	@FindBy (id = "m_login_signin_submit")
	WebElement btnSignin;
	
	
	//Dashboard fields
	
	
	
	// Action Methods
	
	public void setUserName (String uname) {
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword (String pwd) {
		txtPassword.sendKeys(pwd);
	}
	
	public void clickSubmit () {
		btnSignin.click();
	}

}
