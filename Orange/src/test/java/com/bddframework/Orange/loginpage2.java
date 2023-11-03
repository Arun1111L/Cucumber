package com.bddframework.Orange;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginpage2 {
	WebDriver driver;
	@Before
	public void beforemethod() {
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}
	@Given("is on HRMLogin page {string}")
	public void is_on_hrm_login_page(String url) {
		System.out.println("open Webpage");
		driver.get(url);
	}

	@When("enter valid username as {string}")
	public void enter_valid_username_as(String username2) {
		driver.findElement(By.name("username")).sendKeys(username2);
		System.out.println("User name entered");
	}

	@When("enter valid password as {string}")
	public void enter_valid_password_as(String password2) {
		System.out.println("Enter password");
		driver.findElement(By.name("password")).sendKeys(password2);
	}

	@When("click loginButton")
	public void click_login_button() {
		System.out.println("click login");
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	}

	@Then("should be able to login successfully")
	public void should_be_able_to_login_successfully() {
	//Assert.assertTrue(driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).isDisplayed());
	}



}
