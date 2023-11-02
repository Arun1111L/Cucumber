package com.bddframework.NewProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class login_Window_Actions {
	WebDriver driver;
	Login_Page_Window_Locator loginPageLocators=null;
	
	public login_Window_Actions() {
		loginPageLocators = new Login_Page_Window_Locator();
		PageFactory.initElements(Helper_Class1.getDriver(), loginPageLocators);
	}
	public void setUserName(String strUserName) {
	loginPageLocators.username.sendKeys(strUserName);
	}
	public void setPassword(String strPassword) {
	loginPageLocators.password.sendKeys(strPassword);
	}
	public void clickLogin() {
		loginPageLocators.loginbuttton.click();
	}
	public void loginInfo(String username, String password) {
		setUserName(username);
		setPassword(password);
	}
	public void login(String strUsername,String strPassword) {
		 
		
		
		this.setUserName(strUsername);
		this.setPassword(strPassword);

	}
}
