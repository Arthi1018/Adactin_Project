package org.testng;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNG_Clas {
	
	@Test(priority = -1, timeOut = 2000, groups = "a")
	private void browser_Launch() throws InterruptedException {
    System.out.println("LAUNCH THE BROWSER");
	}
	
	@Test(dependsOnMethods = "browser_Launch", groups = "a")
	private void url() {
    System.out.println("PASS THE URL");
	}
	
	@Test(priority = 3, invocationCount = 3, groups = "b")
	private void max() {
    System.out.println("MAXIMIZE THE WINDOW");
	}
	
	@Test(priority = 4, groups = "b")
	private void search() {
    System.out.println("SEARCH FOR MOBILES");
	}
	
	

}
