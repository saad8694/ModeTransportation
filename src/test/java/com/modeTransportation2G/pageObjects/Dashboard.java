package com.modeTransportation2G.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {

WebDriver ldriver;
	
	public Dashboard(WebDriver rdriver)
	
	{
		ldriver = rdriver ;
		PageFactory.initElements(rdriver, this);
	}
	
	//Dashboard fields
	
}
