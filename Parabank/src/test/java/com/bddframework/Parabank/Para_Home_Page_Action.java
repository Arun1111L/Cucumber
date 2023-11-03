package com.bddframework.Parabank;
import org.openqa.selenium.support.PageFactory;
public class Para_Home_Page_Action {
	Para_Home_Page_Locator ParaHomeLocator = null;
	public Para_Home_Page_Action() {
		this.ParaHomeLocator = new Para_Home_Page_Locator();
		PageFactory.initElements(Para_Helper_Class.getDriver(),ParaHomeLocator);	
	}
	public String Welcomepage() {
		return ParaHomeLocator.Welcomepage.getText();
	}
	public void Logout_button() {
		ParaHomeLocator.Logout_button.click();
	}
}
