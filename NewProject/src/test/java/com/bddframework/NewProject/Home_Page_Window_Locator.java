package com.bddframework.NewProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_Page_Window_Locator {
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")
	WebElement Dashboard;
}
