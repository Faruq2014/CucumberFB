package com.FB.CucumberFB.StepDefination;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HookTest {
	WebDriver driver;
	@Before()
	public void openBrowser() {
		 System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
  		 driver = new ChromeDriver();
  			
	}
	
	@After()
	public void closeBrowser() {
		driver.quit();	
	}
	
	// scenario 1
	@Given("^open facebook and start application$")
	public void open_facebook_and_start_application() throws Throwable {
		driver.get("https://www.facebook.com/");
	}

	@When("^enter valid username and valid password$")
	public void enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("xyz@gmail.com"); 
		  driver.findElement(By.id("pass")).sendKeys("avc123"); 
		  driver.findElement(By.id("loginbutton")).click(); 
	}

	@Then("^should be login seccessfully$")
	public void should_be_login_seccessfully() throws Throwable {
		System.out.println(driver.getTitle());
		
	}
	
	
	
	// scenario 2
	
	@Given("^open facebookpage and start application$")
	public void open_facebookpage_and_start_application() throws Throwable {
		driver.get("https://www.facebook.com/");  
	}

	@When("^enter valid username and enter valid password$")
	public void enter_valid_username_and_enter_valid_password() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("xyz@gmail.com"); 
		  driver.findElement(By.id("pass")).sendKeys("avc123"); 
		  driver.findElement(By.id("loginbutton")).click();  
	}

	@Then("^should be login facebook seccessfully$")
	public void should_be_login_facebook_seccessfully() throws Throwable {
		System.out.println(driver.getTitle());  
	}



}
