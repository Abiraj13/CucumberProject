package com.exe.page;


import com.locators.SearchPageLocator;

public class SearchPageExecution extends SearchPageLocator{
	
	public static void alert() {
		clickElement(findElementXpath(alert));
	}
	public static void searchBox() {
		sendKeys(findElementXpath(searchBox), "Oppo");
	}
	public static void click() {
		clickElement(findElementXpath(click));

	}
	public static void firstMobileClick() {
		clickElement(findElementXpath(firstMobile));
	}
	public static void addToCard() {
		clickElement(findElementXpath(addToCard));
	}
	public static void getAmount() {
		getTextMethod(findElementXpath(getAmount));
	}
		
	}
	

