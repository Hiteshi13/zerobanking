package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(id="user_login")
	public WebElement usernameTextBox;
	
	@FindBy(id="user_password")
	public WebElement passwordTextBox;
	
	@FindBy(name="submit")
	public WebElement SubmitBtn;

	
	public void doLogin(String myusername, String mypassword) {
		
		usernameTextBox.sendKeys(myusername);
		passwordTextBox.sendKeys(mypassword);
		SubmitBtn.click();
		
	}

}
