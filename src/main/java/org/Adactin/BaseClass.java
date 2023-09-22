package org.Adactin;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver; 
	
	public static WebDriver browser_Launch(String url) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arthiha\\eclipse-workspace\\Adactin\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();   //local variable
	driver.get(url);
	driver.manage().window().maximize();
	return driver;
	}
	
	public static void pass_Input(WebElement element, String input) {
	element.sendKeys(input);
	}
	
	public static void screenshot(String location) throws IOException {
    TakesScreenshot ts=(TakesScreenshot) driver;
    File source = ts.getScreenshotAs(OutputType.FILE);
    File f=new File(location);
    FileHandler.copy(source, f);
	}
	
	public static void click(WebElement element) {
    element.click();
	}
	
	public static void dropdown(WebElement element, String method, String value) {
	Select s=new Select(element);
	if (method.equals("value")) {
		s.selectByValue(value);
	}else if (method.equals("text")) {
		s.selectByVisibleText(value);
	}else {
		int i = Integer.parseInt(value);
		s.selectByIndex(i);
	}
	}
	public static void mouse_Hover(WebElement element) {
    Actions a=new Actions(driver);
    a.moveToElement(element).perform();
	}
	
}
