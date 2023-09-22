package org.testng;

import org.Adactin.BaseClass;
import org.openqa.selenium.WebDriver;
import org.pom.PomOfPom;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNg_Adactin extends BaseClass{
	public static WebDriver driver= browser_Launch("https://adactinhotelapp.com/");
	

	@Test(dataProvider = "data")
	public void adactin(String username, String password) {
        PomOfPom p=new PomOfPom(driver);
	    pass_Input(p.getL().getUsername(), username);
	    pass_Input(p.getL().getPassword(), password);
	    click(p.getL().getLogin());
	    String title="Adactin.com - Search Hotel";
//	    Assert.assertEquals(driver.getTitle(), title);
	    SoftAssert s=new SoftAssert();
	    s.assertEquals(driver.getTitle(), title);
	    dropdown(p.getS().getLocation(), "text", "Sydney");
	    s.assertAll();
	}
	
	@DataProvider
	public Object[][] data() {
		return new Object[][]{{"Arthiha1018", "1234567"},{"Hello123","123"}, {"Ragul12345678", "Ragul@1710"}};
	}

}
