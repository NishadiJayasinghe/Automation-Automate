package PageTestCases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import PageOperations.LoginPageOperations;

public class LoginPage_TestCases extends LoginPageOperations{
  @Test
  public void LoginPageTestCases() throws Exception {
	  
	  parentTest = extent.createTest("Login Test Case_ParentNode");
	  childTest = parentTest.createNode("Login Test Case Steps_ChildNode");
	  childTest.info("Login test case");
	  childTest.log(Status.INFO, "Login test is passed");
		
		LaunchBrowser();
		typeEmail();
		typePassword();
		clickOnLoginButton();
		//compareTitle();
		//captureScreenShot();
		  
	}
}
