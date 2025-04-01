package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy (id = "nav-hamburger-menu")
	private WebElement allButton;
	
	//Action
	public void verifyHomeScreen() {
		WebDriverWait wait= new WebDriverWait (driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(allButton));
		System.out.println("allButton is vissible");
	}
}
