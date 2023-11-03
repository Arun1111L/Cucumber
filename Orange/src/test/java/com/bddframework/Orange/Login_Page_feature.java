package com.bddframework.Orange;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Page_feature {
	WebDriver driver;
	@Before
	public void beforemethod() {
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}
	@Given("User is on HRMLogin page {string}")
	public void user_is_on_hrm_login_page(String url) {
		System.out.println("open Webpage");
		driver.get(url);
	}

	@When("user enter valid username as {string}")
	public void user_enter_valid_username_as(String username) {
		driver.findElement(By.name("username")).sendKeys(username);
		System.out.println("User name entered");
	}

	@When("user enter valid password as {string}")
	public void user_enter_valid_password_as(String password) {
		System.out.println("Enter password");
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@When("user click loginButton")
	public void user_click_login_button() {
		System.out.println("click login");
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	}
	@Then("user should be able to login successfully")
	public void user_should_be_able_to_login_successfully() {
		//Assert.assertTrue(driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).isDisplayed());
	}
	@Then("user shouldnot able to login bcz of invalid Password")
	public void user_shouldnot_able_to_login_bcz_of_invalid_password() {
		System.out.println("hh");
	}

	@Then("user shouldnot able to login bcz of invalid Password message required")
	public void user_shouldnot_able_to_login_bcz_of_invalid_password_message_required() {
	System.out.println("hjh");
	}


	@After
	public void aftermethod() {
		//driver.quit();
	}
}
