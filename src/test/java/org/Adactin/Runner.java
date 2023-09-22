package org.Adactin;

import org.openqa.selenium.WebDriver;
import org.pom.Login;
import org.pom.PomOfPom;
import org.pom.Search_Hotels;

public class Runner extends BaseClass{
	
	public static WebDriver driver= browser_Launch("https://adactinhotelapp.com/");
	
	public static void main(String[] args) {
		PomOfPom p=new PomOfPom(driver);
		
	    pass_Input(p.getL().getUsername(), "Ragul12345678");
	    pass_Input(p.getL().getPassword(), "Ragul@1710");
	    click(p.getL().getLogin());
	    dropdown(p.getS().getLocation(), "text", "Sydney");
		
	}

}
