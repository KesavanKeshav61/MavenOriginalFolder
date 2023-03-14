package org.stepdefinition1;

import org.mainbase.com.MainLines;

import org.pojoclass1.PojoClass1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinationDemo extends MainLines{
	
	PojoClass1 l;
/*	
@When("To launch the url of the demoqa appliaction")
	public void to_launch_the_url_of_the_demoqa_appliaction() {
		
		l= new PojoClass1();
		provideUrl("https://demoqa.com/register");
	    }
	@When("To pass the firstname in field")
public void to_pass_the_firstname_in_field() {
	parVal(l.getFirstName(),"Kesavan");
  
}
@When("To pass the lastname in field")
public void to_pass_the_lastname_in_field() {
	parVal(l.getLastName(),"Keshav");
  
}
@When("To pass the username in field")
public void to_pass_the_username_in_field() {
   parVal(l.getUserName(),"KesavanKesahav");
}
@When("To pass the password in field")
public void to_pass_the_password_in_field() {
	parVal(l.getPassWord(),"Kesavan@1235");

}

//@When("To click the registration button")
//public void to_click_the_registration_button() {
    
//}

//@Then("To close the browser")
	//public void to_close_the_browser() {
	   
	//}
*/
	@Given("To launch the browser and maximize the window")
	public void to_launch_the_browser_and_maximize_the_window() {
		
		browserLaunch();
		maxWindow();
	   }

@When("To launch the url of the demoqa appliaction")
public void to_launch_the_url_of_the_demoqa_appliaction() {
	l= new PojoClass1();
	provideUrl("https://demoqa.com/register");
    }
@When("To pass the firstname{string} in field")
public void to_pass_the_firstname_in_field(String first) {
	parVal(l.getFirstName(), first);
	
}

@When("To pass the lastname {string} in field")
public void to_pass_the_lastname_in_field(String last) {
	parVal(l.getLastName(),last);
    
}

@When("To pass the username {string}in field")
public void to_pass_the_username_in_field(String user) {
	parVal(l.getUserName(), user);
    
}

@When("To pass the password{string} in field")
public void to_pass_the_password_in_field(String pass) {
	parVal(l.getPassWord(), pass);
    
}

@When("To click the registration button")
public void to_click_the_registration_button() {
    
}
@Then("To close the browser")
public void to_close_the_browser() {
   }
}

