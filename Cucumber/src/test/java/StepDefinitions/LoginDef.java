package StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginDef {

	@Then("^User home page displayed \"([^\"]*)\"$")
	public void user_home_page_displayed(String arg1) {
	    System.out.println("Home page displayed - "+arg1);
	}
	
	@Given("^User enters URL \"([^\"]*)\"$")
	public void user_enters_URL(String arg1) throws Throwable {
		 System.out.println("url entered - "+arg1);
	    
	}
	
	@Given("^User enters URL$")
	public void user_enters_URL() throws Throwable {
	   System.out.println("URl Entered");
	}

	@Then("^User enter login details$")
	public void user_enter_login_details() throws Throwable {
		System.out.println("Login details Entered");
	}

	@Then("^User clicks on submit button$")
	public void user_clicks_on_submit_button() throws Throwable {
		System.out.println("Clicked on submit button");
	}

	@Then("^User home page displayed$")
	public void user_home_page_displayed() throws Throwable {
		System.out.println("Home Page Displayed");
	}


}
