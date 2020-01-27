package com.FB.CucumberFB.StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BackgroundTest {
	 
	WebDriver driver;
	
	@Given("^open firefox and start application$")
	public void open_firefox_and_start_application() throws Throwable {
		System.setProperty("webdriver.gecko.driver","C:\\gecko\\geckodriver\\geckodriver.exe");
	    driver = new FirefoxDriver();
	   
	    //System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
	    //driver = new ChromeDriver();
	  		
	  
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@When("^I enter invalid username and invalid password$")
	public void i_enter_valid_username_and_valid_password() throws Throwable {
		 driver.findElement(By.id("email")).sendKeys("xyz@gmail.com"); 
		  driver.findElement(By.id("pass")).sendKeys("avc123");
	   	}

	@Then("^user should not be login seccessfully$")
	public void user_should_be_login_seccessfully() throws Throwable {
		 driver.findElement(By.id("loginbutton")).click(); 
		 Thread.sleep(5000);
	}
	
	
	
	
	//scenario 1
	@Then("^click forget link$")
	public void click_forget_link() throws Throwable {
		driver.findElement(By.xpath("//*[text()='Sign up for Facebook']")).click(); 
		 driver.quit(); 
	}
	
	//scenario 2
	@Then("^click for forget link$")
	public void click_for_forget_link() throws Throwable {
	  driver.findElement(By.xpath("//*[@title='Sign Up for Facebook']")).click(); 
	  driver.quit(); 
	}
     
	//scenario 3
	@Then("^click for login link$")
	public void click_for_login_link() throws Throwable {
	    driver.findElement(By.xpath("//*[@title='Log into Facebook']")).click();
	    driver.quit(); 
	}
     
	//scenario 4
	@Then("^close the browser$")
	public void application_should_be_closed() throws Throwable {
		 Thread.sleep(4000);
		driver.getCurrentUrl(); 
		 driver.quit(); 
	}



}
