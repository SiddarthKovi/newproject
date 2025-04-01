package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pages.LoginPage;
import utilities.DriverFactory;

public class HomePageSteps {

	WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);
    
    @Given("User is on the Amazon login page")
    public void user_is_on_amazon_login_page() {
    	driver.get("https://www.amazon.in/");
    }
    
    @And("Verify able to see the amazon page")
    public void verify_able_to_see_the_amazon_page() {
    	loginPage.verifyHomeScreen();
    }
}
