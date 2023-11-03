package com.bddframework.Parabank;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Para_Home_Page_Locator {
	 @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/p")
	 WebElement Welcomepage;
	 @FindBy(xpath = "//*[@id=\"leftPanel\"]/ul/li[8]/a")
	 WebElement Logout_button;
}
