package com.bddframework.NewProject;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Orange_Login_feature {
	login_Window_Actions LoginOhrmActions = new login_Window_Actions();
	Home_Window_Actions HomepageOhrmActions = new Home_Window_Actions();
	Class_data data = new Class_data();
	@Given("go to url page")
	public void go_to_url_page() {
		Helper_Class1.openPage(data.url);
	}

	@When("type the valid username")
	public void type_the_valid_username() {
		LoginOhrmActions.setUserName(data.strUsername);
	}

	@When("type the valid password")
	public void type_the_valid_password() {
		LoginOhrmActions.setPassword(data.strPassword);
	}

	@When("click loginButton for login")
	public void click_login_button_for_login() {
		LoginOhrmActions.clickLogin();


	}

	@Then("Check weather the login accure")
	public void check_weather_the_login_accure() {
		Assert.assertEquals(HomepageOhrmActions.dashboardTxt(),"Dashboard");

	   
	}



}
