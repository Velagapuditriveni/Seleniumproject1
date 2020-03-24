package com.Stepdefinition;

import java.io.IOException;

import com.pages.Jainbook_Advancesearchpage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Jainbook_Advancesearch {
	Jainbook_Advancesearchpage a=new Jainbook_Advancesearchpage();
	@Given("^the user launch the chrome application for sixth time$")
	public void the_user_launch_the_chrome_application_for_sixth_time() {
		a.launch();
	}

	@When("^the user opened the jainbookagency Home page$")
	public void the_user_opened_the_jainbookagency_Home_page() {
		a.LoginPage();
	}

	@Then("^the user login using valid username and password$")
	public void the_user_login_using_valid_username_and_password() throws IOException {
		a.logine();
	}

	@Then("^click on the Advancesearch$")
	public void click_on_the_Advancesearch() {
		a.search();
	}

	@Then("^logout and close the browser$")
	public void logout_and_close_the_browser() throws InterruptedException {
		a.close();
	}
}
