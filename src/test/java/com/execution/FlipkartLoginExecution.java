package com.execution;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\ADMIN\\SeleniumPratices\\CucumberProject\\src\\test\\java\\Flipkart.feature", glue = {"com.stepdefinition.files"})
public class FlipkartLoginExecution {

}
