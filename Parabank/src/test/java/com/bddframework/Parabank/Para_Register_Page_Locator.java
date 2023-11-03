package com.bddframework.Parabank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Para_Register_Page_Locator {
 @FindBy(xpath = "//*[@id='customer.firstName']")
 WebElement FirstName;
 @FindBy(xpath = "//*[@id='customer.lastName']")
 WebElement LastName;
 @FindBy(xpath = "//*[@id='customer.address.street']")
 WebElement Address;
 @FindBy(xpath = "//*[@id='customer.address.city']")
 WebElement City;
 @FindBy(xpath = "//*[@id='customer.address.state']")
 WebElement State;
 @FindBy(xpath = "//*[@id='customer.address.zipCode']")
 WebElement ZipCode;
 @FindBy(xpath = "//*[@id='customer.phoneNumber']")
 WebElement Phone;
 @FindBy(xpath = "//*[@id='customer.ssn']")
 WebElement SSN;
 @FindBy(xpath = "//*[@id='customer.username']")
 WebElement Username;
 @FindBy(xpath = "//*[@id='customer.password']")
 WebElement Password;
 @FindBy(xpath = "//*[@id='repeatedPassword']")
 WebElement Confirm;
 @FindBy(xpath = "//*[@id='customerForm']/table/tbody/tr[13]/td[2]/input")
 WebElement RegisterButton;
}
