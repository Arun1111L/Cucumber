package com.bddframework.Parabank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Para_Register_Action {

	WebDriver driver;
	Para_Register_Page_Locator ParaRegisterLocator = null;
	
	public Para_Register_Action() {
		this.ParaRegisterLocator = new Para_Register_Page_Locator();
		PageFactory.initElements(Para_Helper_Class.getDriver(), ParaRegisterLocator);	
	}
	public void setFirstName(String strFirstName) {
		ParaRegisterLocator.FirstName.sendKeys(strFirstName);
	}
	public void setLastName(String strLastName) {
		ParaRegisterLocator.LastName.sendKeys(strLastName);
	}
	public void setAddress(String strAddress) {
		ParaRegisterLocator.Address.sendKeys(strAddress);
	}
	public void setCity(String strCity) {
		ParaRegisterLocator.City.sendKeys(strCity);
	}
	public void setState(String strState) {
		ParaRegisterLocator.State.sendKeys(strState);
	}
	public void setZipCode(String strZipCode) {
		ParaRegisterLocator.ZipCode.sendKeys(strZipCode);
	}
	public void setPhone(String strPhone) {
		ParaRegisterLocator.Phone.sendKeys(strPhone);
	}
	public void setSSN(String strSSN) {
		ParaRegisterLocator.SSN.sendKeys(strSSN);
	}
	public void setUsername(String strUsername) {
		ParaRegisterLocator.Username.sendKeys(strUsername);
	}
	public void setPassword(String strPassword) {
		ParaRegisterLocator.Password.sendKeys(strPassword);
	}
	public void setConfirm(String strConfirm) {
		ParaRegisterLocator.Confirm.sendKeys(strConfirm);
	}
	public void RegisterButton() {
		ParaRegisterLocator.RegisterButton.click();
	}
}

