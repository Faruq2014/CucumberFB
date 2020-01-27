package com.FB.CucumberFB.StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TagTest {
	static WebDriver driver;
	
	//scenario 1
	@Given("^open facebook$")
	public void open_facebook() throws Throwable {
		//System.setProperty("webdriver.gecko.driver","C:\\gecko\\geckodriver\\geckodriver.exe");
		   // driver = new FirefoxDriver();
		  System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		  		 driver = new ChromeDriver();
		  		
		    
			driver.get("https://www.facebook.com/"); 
			driver.manage().window().maximize();
	    
	}

	@When("^enter invalid username and invalid password$")
	public void enter_invalid_username_and_invalid_password() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("xyz@gmail.com"); 
		  driver.findElement(By.id("pass")).sendKeys("avc123");
		  driver.findElement(By.id("loginbutton")).click(); 
	}

	@Then("^should be land on forget page$")
	public void should_be_land_on_forget_page() throws Throwable {
	  System.out.println("Facebook title is "+" "+driver.getTitle()); 
	  driver.quit();
	}
	
	//scenario 2

	@Given("^open yahoo on chrom$")
	public void open_yahoo_on_chrom() throws Throwable {
		//System.setProperty("webdriver.gecko.driver","C:\\gecko\\geckodriver\\geckodriver.exe");
		   // driver = new FirefoxDriver();
		  System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		  		 driver = new ChromeDriver();
		  		
		    
			driver.get("https://www.yahoo.com/"); 
			driver.manage().window().maximize();
 
	}

	@When("^click on signup button$")
	public void click_on_signup_button() throws Throwable {
	   driver.findElement(By.xpath("//*[@id='uh-signin']")).click();
		////*[@id='uh-signin']
	}

	@Then("^signup page should open$")
	public void signup_page_should_open() throws Throwable {
		  System.out.println("Yahoo title is "+" "+driver.getTitle()); 
		  driver.quit();
	}
	
	//scenario 3

	@Given("^open google and start application$")
	public void open_google_and_start_application() throws Throwable {
		//System.setProperty("webdriver.gecko.driver","C:\\gecko\\geckodriver\\geckodriver.exe");
		   // driver = new FirefoxDriver();
		  System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		  		 driver = new ChromeDriver();
		  		
		    
			driver.get("https://www.google.com/"); 
			driver.manage().window().maximize();
 
	}

	@When("^enter cucumber tag on search button$")
	public void enter_cucumber_tag_on_search_button() throws Throwable {
	   driver.findElement(By.xpath("//*[@name='q']")).sendKeys("cucumber tag"); 
	   Thread.sleep(5000);
	}

	@Then("^should land on serch page$")
	public void should_land_on_serch_page() throws Throwable {
		 System.out.println("Google title is "+" "+driver.getTitle()); 
		 driver.quit();
	}
	
	//scenario 4

	@Given("^open amazon application$")
	public void open_amazon_application() throws Throwable {
		//System.setProperty("webdriver.gecko.driver","C:\\gecko\\geckodriver\\geckodriver.exe");
		   // driver = new FirefoxDriver();
		  System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		  		 driver = new ChromeDriver();
		  		
		    
			driver.get("https://www.amazon.com/"); 
			driver.manage().window().maximize();

	}

	@When("^click on todays deal$")
	public void click_on_todays_deal() throws Throwable {
	 driver.findElement(By.linkText("Today's Deals")).click();  
	}

	@Then("^should land on serch todays page\\.$")
	public void should_land_on_serch_todays_page() throws Throwable {
		 System.out.println("Amazon title is "+" "+driver.getTitle());
		 driver.quit();
	}
	
	//scenario 5

	@Given("^open ebay application$")
	public void open_ebay_application() throws Throwable {
		//System.setProperty("webdriver.gecko.driver","C:\\gecko\\geckodriver\\geckodriver.exe");
		   // driver = new FirefoxDriver();
		  System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		  		 driver = new ChromeDriver();
		  		
		    
			driver.get("https://www.ebay.com/"); 
			driver.manage().window().maximize();
 
	}

	@When("^click on login link deal$")
	public void click_on_login_link_deal() throws Throwable {
		driver.findElement(By.xpath(" //a[text()='Sign in']")).click();
	    	}

	@Then("^should land on serch login page\\.$")
	public void should_land_on_serch_login_page() throws Throwable {
		 System.out.println("Ebay title is "+" "+driver.getTitle());
		 driver.quit();
	    	}



}
