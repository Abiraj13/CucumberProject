package com.stepdefinition.files;


import com.base.BaseClass;
import com.exe.page.SearchPageExecution;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlipkartLoginStepDefinition extends SearchPageExecution{
	
	@Given("Open the Browser")
	public void open_the_browser() {
		openBrowser();
		maxmizeScreen();
	    
	}

	@Given("Launch the Flipkart URL")
	public void launch_the_flipkart_url() throws InterruptedException {
		urlLaunch("https://www.flipkart.com/");
		sleep(3000);
		alert();
	}

	@When("Enter the Oppo product in search box")
	public void enter_the_oppo_product_in_search_box() {
		searchBox();
		click();
	   
	}

	@When("Click on the First Product")
	public void click_on_the_first_product() throws InterruptedException {
		sleep(3000);
		firstMobileClick();
	}

	@When("Click on Go to Cart")
	public void click_on_go_to_cart() {
		windowHandles();
		addToCard();
	
	}

	@Then("Get the Product Price")
	public void get_the_product_price() {
		getAmount();
	
	}

}
