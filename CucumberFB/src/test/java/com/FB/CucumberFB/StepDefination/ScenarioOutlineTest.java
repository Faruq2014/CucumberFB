package com.FB.CucumberFB.StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioOutlineTest {
	WebDriver driver;
	@Given("^open chrome browser and start application$")
	public void open_chrome_browser_and_start_application() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
  		 driver = new ChromeDriver();
  		//System.setProperty("webdriver.gecko.driver","C:\\gecko\\geckodriver\\geckodriver.exe");
  	   // driver = new FirefoxDriver();
  		 
  		//driver.get("https://www.facebook.com/"); 
  		driver.navigate().to("https://www.facebook.com/");
  		driver.manage().window().maximize();
 	   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
 		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  		
	}

	@When("^I enter \"(.*?)\" and \"(.*?)\"$")
	public void i_enter_and(String username, String password) throws Throwable {
		driver.findElement(By.id("email")).sendKeys(username); 
		  driver.findElement(By.id("pass")).sendKeys(password);
	}

	@Then("^user should be login$")
	public void user_should_be_login() throws Throwable {
		driver.findElement(By.id("loginbutton")).click(); 
	}

	@Then("^facebook should be closed$")
	public void facebook_should_be_closed() throws Throwable {
		 driver.close();  
	}


}
