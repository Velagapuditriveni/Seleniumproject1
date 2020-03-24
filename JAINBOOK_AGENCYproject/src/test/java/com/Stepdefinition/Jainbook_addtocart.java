package com.Stepdefinition;





import java.io.IOException;

import com.pages.Jainbook_addtocartpage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Jainbook_addtocart {
	Jainbook_addtocartpage d=new Jainbook_addtocartpage();
	@Given("^launch the chrome application for the nineth time$")
	public void launch_the_chrome_application_for_the_nineth_time() {
		d.launch();
	}

	@When("^opens the jainbookagency Home page and login into the page$")
	public void opens_the_jainbookagency_Home_page_and_login_into_the_page() throws IOException {
		d.LoginPage();
		d.login();
	}

	@Then("^the user clicks add to cart$")
	public void the_user_clicks_add_to_cart() {
		d.addtocart();
	}

	@Then("^logout and Close the browser$")
	public void logout_and_Close_the_browser() throws InterruptedException {
		d.close();
	}
}
