package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoLogin {



	WebDriver driver;

	public SauceDemoLogin(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
    @FindBy(xpath = "//input[@placeholder= 'Username']")
    private WebElement userName;
    
    @FindBy(id = "password")
    private WebElement password;
    
    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement loginBtn;
    
    //Actions
    
   public void enterUserName(String username) {
	   userName.sendKeys(username);
   }
   
   public void enterPassword(String pwd) {
	   password.sendKeys(pwd);
   }
   
   public void loginBtn() {
	   loginBtn.click();
   }
    
}
