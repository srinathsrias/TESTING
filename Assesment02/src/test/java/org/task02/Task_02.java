package org.task02;

import java.io.IOException;

import org.pom.Demo;
import org.utility.BaseClass;

import io.cucumber.java.en.*;

public class Task_02 extends BaseClass {
	Demo d;

	@Given("The user should be in the home page of the applicaion")
	public void the_user_should_be_in_the_home_page_of_the_applicaion() {
		browserLaunch("chrome");
		urlLaunch("https://demo.dealsdray.com/");
		time(20);

	}

	@Then("The user should enter {string} and {string}.")
	public void the_user_should_enter_and(String user, String pass) throws InterruptedException {
		d = new Demo();
		Thread.sleep(4000);
		sendKeys(d.getUsername(), user);
		sendKeys(d.getPassword(), pass);

	}

	@Then("The user need to click login button.")
	public void the_user_need_to_click_login_button() {
		click(d.getLogin());
	}

	@Then("The user need to click orders and click the add bulk orders.")
	public void the_user_need_to_click_orders_and_click_the_add_bulk_orders() {
		click(d.getOrder());
		click(d.getOrders());
		click(d.getBulkOrder());

	}

	@Then("The user need to upload the demo_data file and click import button.")
	public void the_user_need_to_upload_the_demo_data_file_and_click_import_button() {
		sendKeys(d.getUpload(), "C:\\Users\\SRI\\eclipse-workspace\\Assesment02\\src\\test\\resources\\demo-data.xlsx");
		click(d.getImport());
	}

	@Then("The user need to click validate data button and handle the alert message.")
	public void the_user_need_to_click_validate_data_button_and_handle_the_alert_message() throws InterruptedException {
		click(d.getValidate());
		Thread.sleep(4000);
		acceptAlert();
	}

	@Then("The user need to scroll_down and take screenshot.")
	public void the_user_need_to_scroll_down_and_take_screenshot() throws IOException {
		scrollUpAndDown(d.getScroll(), true);
		takeScreenShot("Task_02", "Task_2");
		quit();
	}

}
