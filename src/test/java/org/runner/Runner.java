package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\org\\feature\\adactin.feature", glue = "org.stepdef", monochrome = true, publish = true)
public class Runner {
	


}
