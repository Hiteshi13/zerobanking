package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageClass.AccountSummaryPage;
import pageClass.LoginPage;
import pageClass.PayBillsPage;
import pageClass.WelcomePage;

public class TC_02_verifyAddPayee {

	public WebDriver driver;
	public WelcomePage wp;
	public LoginPage lp;
	public AccountSummaryPage asp;
	public PayBillsPage pbp;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "H:\\JavaPractice\\zerobanking\\src\\test\\resources\\browser_driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		wp = PageFactory.initElements(driver, WelcomePage.class);
		lp = PageFactory.initElements(driver, LoginPage.class);
		asp = PageFactory.initElements(driver, AccountSummaryPage.class);
		pbp = PageFactory.initElements(driver, PayBillsPage.class);
	}
	
	@Test
public void verifyLogin() {
		
		wp.clickSignInBtn();
		lp.doLogin("username","password");
		asp.clickPayBillsLink();
		pbp.clickAddNewPayeeLink();
		pbp.fillNewPayeeDetails("User1", "123, Selum Drive", "178451", "Water Tax");
	}
	
	@AfterClass
	public void tearDown() {
		
		driver.quit();
		
	}
	
	
}
