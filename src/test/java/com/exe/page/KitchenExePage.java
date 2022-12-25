package com.exe.page;

import com.locators.HomeAndKitchenLocators;

public class KitchenExePage extends HomeAndKitchenLocators{
	static String textFirst= null;
	static String textLast= null;
	public static void homeAndKitchen() {
		mousehover(findElementXpath(homeAndKitchen));
	}
	public static void clickDrinkware() {
		clickElement(findElementXpath(drinkware));
	}
	public static void clickProduct() {
		clickElement(findElementXpath(product));
	}
	public static void getProductNamefirst() {
		 textFirst = getTextMethod(findElementXpath(productName1));
	}
	public static void clickAddToCard() {
		clickElement(findElementXpath(addToCard));
	}
	
	public static void clickGoToBag() {
		clickElement(findElementXpath(goToBag));
	}
	public static void getProductNameLast() {
		 textLast = getTextMethod(findElementXpath(productName2));
	}
	public static void validation() {
		boolean equals = textLast.equals(textFirst);
		System.out.println(equals);
	}
}
