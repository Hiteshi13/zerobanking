package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayBillsPage {
	
WebDriver driver;
	
	@FindBy(xpath="//a[text()='Add New Payee']")
	public WebElement AddNewPayeeLink;

	@FindBy(id="np_new_payee_name")
	public WebElement NewPayeeNameTextBox;
	
	@FindBy(id="np_new_payee_address")
	public WebElement NewPayeeAddressTextBox;
	
	@FindBy(id="np_new_payee_account")
	public WebElement NewPayeeAccountTextBox;
	
	@FindBy(id="np_new_payee_details")
	public WebElement NewPayeeDetailsTextBox;
	
	@FindBy(id="add_new_payee")
	public WebElement AddPayeeBtn;
	
	public void clickAddNewPayeeLink() {
		AddNewPayeeLink.click();
	}
	
	public void fillNewPayeeDetails(String newPayeeName, String newPayeeAddress, String newPayeeAccount, String newPayeeDetails) {
		NewPayeeNameTextBox.sendKeys(newPayeeName);
		NewPayeeAddressTextBox.sendKeys(newPayeeAddress);
		NewPayeeAccountTextBox.sendKeys(newPayeeAccount);
		NewPayeeDetailsTextBox.sendKeys(newPayeeDetails);
		AddPayeeBtn.click();
	}
}
