package com.bddframework.NewProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page_Window_Locator {
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	WebElement username;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	WebElement loginbuttton;
}
