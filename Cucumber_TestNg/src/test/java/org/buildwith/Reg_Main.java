package org.buildwith;

import java.util.List;

import org.buildwith.pom.Log_pom;
import org.buildwith.pom.Reg_pom;
import org.test.parent.BaseClass;

import io.cucumber.java.en.*;

public class Reg_Main extends BaseClass {
	Reg_pom r;
	static Log_pom l;

	@Given("The user should be in the home page of the application.")
	public void the_user_should_be_in_the_home_page_of_the_application() {
		r = new Reg_pom();
		l = new Log_pom();

	}

	@Then("The user should click {string} button.")
	public void the_user_should_click_button(String btn) {
		switch (btn) {
		case "register":
			click(r.getSignup());
			break;
		case "login":
			click(l.getLog_In());
		default:
			break;
		}
	}

	@Then("The user should enter email and password.")
	public void the_user_should_enter_email_and_password(io.cucumber.datatable.DataTable data) {
		List<String> l = data.asList();
		sendKeys(r.getEmail(), l.get(0));
		sendKeys(r.getPassword(), l.get(1));
	}

	@Then("The user should click the signup button.")
	public void the_user_should_click_the_signup_button() {
		click(r.getSinupbtn());
	}

	@Then("The user will be in signup page.")
	public void the_user_will_be_in_signup_page() {
		webwait(20, "signup");
	}

}
