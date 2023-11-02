package com.bddframework.NewProject;

import org.openqa.selenium.support.PageFactory;

public class Home_Window_Actions {
	Home_Page_Window_Locator Home_page_Locators = null;
	
		public Home_Window_Actions() {
			this.Home_page_Locators = new Home_Page_Window_Locator();
			PageFactory.initElements(Helper_Class1.getDriver(), Home_page_Locators);
		}
		
		public String dashboardTxt() {
			return Home_page_Locators.Dashboard.getText();
		}
	}