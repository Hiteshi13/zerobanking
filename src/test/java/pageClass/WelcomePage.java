package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage {
	WebDriver driver;
	
	@FindBy(id="signin_button")
	public WebElement signInBtn;
	
	public void clickSignInBtn() {
		signInBtn.click();
		
	}

}

//if we are interact with any other object than sign_in button, we need to specify all other objects like above