package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pages.SauceDemoLogin;
import utilities.DriverFactory;

public class LoginSteps {

	 WebDriver driver;
	 SauceDemoLogin sd;
	
	   // WebDriver driver = DriverFactory.getDriver();
	   // SauceDemoLogin sd = new SauceDemoLogin(driver);
	    
	  

	    @Given("User is on sauce demo login page")
	    public void User_is_on_sauce_demo_login_page() {
	    	driver = DriverFactory.getDriver();  // Initialize driver
	        sd = new SauceDemoLogin(driver);    // Initialize Page Object
	        driver.get("https://www.saucedemo.com/");
	    }

	    @When("User enters valid username and password")
	    public void User_enters_valid_username_and_password() {
	    	sd.enterUserName("standard_user");
	    	sd.enterPassword("secret_sauce");
	    }

	    @And("User hits login button")
	    public void User_hits_login_button() {
	        sd.loginBtn();
	    }

	    @Then("User is navigated to the home page")
	    public void User_is_navigated_to_the_home_page() {
	        
	    }
	}
