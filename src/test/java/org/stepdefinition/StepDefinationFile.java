package org.stepdefinition;

import org.mainbase.com.MainLines;
import org.pojoclass.PojoClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinationFile extends MainLines {
	
	PojoClass l;
	


	@Given("To launch the browser and maximize the window")
	public void to_launch_the_browser_and_maximize_the_window() {
		browserLaunch(); 
		maxWindow();
	}

	@When("To launch the url of the facebook appliaction")
	public void to_launch_the_url_of_the_facebook_appliaction() {
		l= new PojoClass();
		provideUrl("https://www.facebook.com/");
	    
	}

	@When("To pass the username or {string} in email field")
	public void to_pass_the_username_or_in_email_field(String ame) {
	   parVal(l.getEmailText(),ame);
	}

	@When("To pass the password or {string} in password field")
	public void to_pass_the_password_or_in_password_field(String pass) {
		parVal(l.getPassword(),pass);
	   
	}

	@Then("To click the login button")
	public void to_click_the_login_button() {
	    
	}
}







