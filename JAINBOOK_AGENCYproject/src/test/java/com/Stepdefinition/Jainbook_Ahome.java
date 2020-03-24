package com.Stepdefinition;

import java.io.IOException;

import com.pages.Jainbook_Ahomepage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Jainbook_Ahome {
	Jainbook_Ahomepage e=new Jainbook_Ahomepage();
	@Given("^user launching the chrome application for tenth time$")
	public void user_launching_the_chrome_application_for_tenth_time() {
		e.launch();
	}

	@When("^user opening the jainbookagency and login into the page$")
	public void user_opening_the_jainbookagency_and_login_into_the_page() throws IOException {
		 e.LoginPage();
		    e.login();
	}

	@Then("^the user clicks on Home$")
	public void the_user_clicks_on_Home() {
		e.jhome();
	}

	@Then("^user logout  the page and close the browser$")
	public void user_logout_the_page_and_close_the_browser() throws InterruptedException {
		  e.close();
	}

}
