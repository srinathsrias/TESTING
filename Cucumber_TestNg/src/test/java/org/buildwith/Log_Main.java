package org.buildwith;

import java.util.List;

import org.test.parent.BaseClass;

import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Then;

public class Log_Main extends BaseClass {
	@Then("The user should enter emailid and password.")
	public void the_user_should_enter_emailid_and_password(io.cucumber.datatable.DataTable data) {
		SoftAssert s = new SoftAssert();
		List<String> l = data.asList();
		sendKeys(Reg_Main.l.getEmail(), l.get(0));
		sendKeys(Reg_Main.l.getPassword(), l.get(1));
		s.assertEquals(getAttribute(Reg_Main.l.getPassword(), "value"), "9360772960");
		s.assertAll();
	}

	@Then("The user should click the login button.")
	public void the_user_should_click_the_login_button() {
		click(Reg_Main.l.getLogiinbtn());
	}

	@Then("The user will be in login page.")
	public void the_user_will_be_in_login_page() {
		webwait(20, "login");
	}

}
