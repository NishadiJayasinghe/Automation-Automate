 package PageTestCases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import PageOperations.LoginPageOperations;

public class LoginPage_TestCases extends LoginPageOperations{
  @Test
  public void LoginPageTestCases() throws Exception {
	  
	  parentTest = extent.createTest("Login Page Test Cases");
	  
		LaunchBrowser();
		typeEmail();
		typePassword();
		clickOnLoginButton();
		compareTitle();
		//captureScreenShot();
		
		//parentTest.log(Status.INFO, "Login test is passed");
		  
	}
}
