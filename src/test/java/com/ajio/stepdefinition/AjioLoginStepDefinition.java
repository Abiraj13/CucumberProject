package com.ajio.stepdefinition;

import com.exe.page.KitchenExePage;
import com.locators.HomeAndKitchenLocators;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AjioLoginStepDefinition extends KitchenExePage{
	@Given("Open Browser")
	public void open_browser() {
		openBrowser();
		maxmizeScreen();
	   
	}

	@Given("Launch Url")
	public void launch_url() throws InterruptedException {
		urlLaunch("https://www.ajio.com/");
	
		
	}

	@When("MouseHover on Home and Kitchen")
	public void mouse_hover_on_home_and_kitchen() {
		homeAndKitchen();
	}

	@When("Click on Serveware & Drinkware \\(under Dining)")
	public void click_on_serveware_drinkware_under_dining() {
		clickDrinkware();
	}

	@When("Click on Any Product & get the product name")
	public void click_on_any_product_get_the_product_name() throws InterruptedException {
		sleep(3000);
	   clickProduct();
	}

	@When("Click on Add To Bag")
	public void click_on_add_to_bag() throws InterruptedException {
		windowHandles();
		sleep(3000);
		getProductNamefirst();
		clickAddToCard();
		
	
	}

	@When("Click on Mini Bag")
	public void click_on_mini_bag() throws InterruptedException {
		sleep(2000);
		clickGoToBag();
	 
	}

	@Then("In ShoppingBag, Validate product name same or not")
	public void in_shopping_bag_validate_product_name_same_or_not() {
		getProductNameLast();
		validation();
	  
	}

}
