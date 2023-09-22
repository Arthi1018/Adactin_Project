package org.stepdef;

import org.Adactin.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.pom.PomOfPom;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition extends BaseClass{
	public static WebDriver driver= browser_Launch("https://adactinhotelapp.com/");
	PomOfPom p=new PomOfPom(driver);
	
	@Before
	public void startBrowser() {
    System.out.println("BROWSER LAUNCHED");
	}
	
	@After
	public void scenario_Complete() {
    System.out.println("COMPLETED THE SCENARIO");
	}
	
	@Given("Url should be launched")
	public void url_should_be_launched() {
	   System.out.println("URL LAUNCHED");
	}
	@When("User enters the username in the username field")
	public void user_enters_the_username_in_the_username_field() {
		pass_Input(p.getL().getUsername(), "Ragul12345678");
	}
	@When("User enters the password in the password field")
	public void user_enters_the_password_in_the_password_field() {
		 pass_Input(p.getL().getPassword(), "Ragul@1710");
	}
	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		click(p.getL().getLogin());
	}
	@Then("User gets navigated to the Search hotels page")
	public void user_gets_navigated_to_the_search_hotels_page() {
		 String title="Adactin.com - Search Hotel";
		 Assert.assertEquals(title, driver.getTitle());
	}
	
	@Given("User should get navigated to Search hotel page")
	public void user_should_get_navigated_to_search_hotel_page() {
	    System.out.println("USER HAS NAVIGATED");
	}
	@When("User selects an location from the dropdown")
	public void user_selects_an_location_from_the_dropdown() {
	   dropdown(p.getS().getLocation(), "value", "Sydney");
	}



}
