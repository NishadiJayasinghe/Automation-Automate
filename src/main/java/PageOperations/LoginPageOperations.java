package PageOperations;

import org.testng.Assert;
import Base.Base;
import PageElements.LoginPage;

public class LoginPageOperations extends Base{
public static void LaunchBrowser() {
		
		openURL();
	}
  
	public static void typeEmail() {
		if element is exist
		LoginPage.email().sendKeys("jayasingheane@gmail.com");
		extent.log();
	}
	
	public static void typePassword() {
		
		LoginPage.password().sendKeys("123456789");		
	}
	
	public static void clickOnLoginButton() {
		
		LoginPage.login().click();	
	}
	
	public static void compareTitle() {
		
		Assert.assertEquals("Insurance Broker System", getDriver().getTitle());
	}

	
	/*
	public static void captureScreenShot() throws Exception{
		
		Base.CaptureScreenshot(getDriver(), "HomePage" );
		
	}*/
}
