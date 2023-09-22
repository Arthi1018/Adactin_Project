package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotels {
	
	public WebDriver driver;
	
	@FindBy(id = "location")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}

	public Search_Hotels(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
