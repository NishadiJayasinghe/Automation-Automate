package PageTestCases;

import org.testng.annotations.Test;

import PageOperations.LoginPageOperations;

public class LoginPage_TestCases extends LoginPageOperations{
  @Test
  public void LoginPageTestCases() throws Exception {
		
		LaunchBrowser();
		typeEmail();
		typePassword();
		clickOnLoginButton();
		//compareTitle();
		//captureScreenShot();
		  
	}
}
