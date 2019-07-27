package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageClass.LoginPage;
import pageClass.WelcomePage;

public class TC_01_verifyLogin {

	public WebDriver driver;
	public WelcomePage wp;
	public LoginPage lp;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "H:\\JavaPractice\\zerobanking\\src\\test\\resources\\browser_driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		wp = PageFactory.initElements(driver, WelcomePage.class);
		lp = PageFactory.initElements(driver, LoginPage.class);
	}
	
	@Test
	public void verifyLogin() {
		
		wp.clickSignInBtn();
		lp.doLogin("username","password");
		//Soft Assertion in Page Object Model
		/*SoftAssert asr = new SoftAssert();
		 * String Actual = driver.getTitle();
		 * String Expected = "Zero - Personal Banking - Loans - Credit Cards";
		 * asr.assertEquals(Actual,Expected);
		 * asr.assertAll();
		 */
	}
	
	@AfterClass
	public void tearDown() {
		
		driver.quit();
		
	}
}
