package com.bddframework.Parabank;
import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Para_Register_Page_feature {
	Para_Register_Action ParaRegisterAction = new Para_Register_Action();
	Para_Home_Page_Action ParaHomeLocator = new Para_Home_Page_Action();
	Utility_Class Para_data = new Utility_Class();
	@Given("User is on the Parabank Register page")
	public void user_is_on_the_parabank_register_page() {
		Para_Helper_Class.openPage(Para_data.url);
	}
	@When("user enter the FirstName")
	public void user_enter_the_first_name() {
		ParaRegisterAction.setFirstName(Para_data.strFirstName);
	}
	@When("user enter the LastName")
	public void user_enter_the_last_name() {
		ParaRegisterAction.setLastName(Para_data.strLastName);
	}
	@When("user enter the Address")
	public void user_enter_the_address() {
		ParaRegisterAction.setAddress(Para_data.strAddress);
	}
	@When("user enter the City")
	public void user_enter_the_city() {
		ParaRegisterAction.setCity(Para_data.strCity);
	}
	@When("user enter the State")
	public void user_enter_the_state() {
		ParaRegisterAction.setState(Para_data.strState);
	}
	@When("user enter the ZipCode")
	public void user_enter_the_zip_code() {
		ParaRegisterAction.setZipCode(Para_data.strZipCode);
	}
	@When("user enter the Phone")
	public void user_enter_the_phone() {
		ParaRegisterAction.setPhone(Para_data.strPhone);
	}
	@When("user enter the SSN")
	public void user_enter_the_ssn() {
		ParaRegisterAction.setSSN(Para_data.strSSN);
	}
	@When("user enter the Username")
	public void user_enter_the_username() {
		ParaRegisterAction.setUsername(Para_data.strUsername);
	}
	@When("user enter the Password")
	public void user_enter_the_password() {
		ParaRegisterAction.setPassword(Para_data.strPassword);
	}
	@When("user enter the Confirm")
	public void user_enter_the_confirm() {
		ParaRegisterAction.setConfirm(Para_data.strConfirm);
	}
	@When("user click the RegisterButton")
	public void user_click_the_register_button() {
		ParaRegisterAction.RegisterButton();
	}
	@Then("check user is in Welcomepage")
	public void check_user_is_in_welcomepage() {
		Assert.assertEquals(ParaHomeLocator.Welcomepage(),"Your account was created successfully. You are now logged in.");		
	}
	@Then("click logout button")
	public void click_logout_button() {
		ParaHomeLocator.Logout_button();
	}



}
