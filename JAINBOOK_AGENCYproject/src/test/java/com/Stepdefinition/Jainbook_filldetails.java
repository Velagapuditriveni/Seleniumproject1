package com.Stepdefinition;

import com.pages.Jainbook_Afilldetailspage;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Jainbook_filldetails {
	Jainbook_Afilldetailspage c=new Jainbook_Afilldetailspage();
	@Given("^user launches chrome application for eigth time$")
	public void user_launches_chrome_application_for_eigth_time() {
		c.launch();
	}

	@When("^user open  jainbookagency and login into the page$")
	public void user_open_jainbookagency_and_login_into_the_page() {
		c.LoginPage();
		c.login();
	}

	@Then("^the user  fills the details and clicks on search button$")
	public void the_user_fills_the_details_and_clicks_on_search_button() {
		c.Filldetails();
	}

	@Then("^the user logout the page and close the browser$")
	public void the_user_logout_the_page_and_close_the_browser() throws InterruptedException {
		c.close();	
	}

}
