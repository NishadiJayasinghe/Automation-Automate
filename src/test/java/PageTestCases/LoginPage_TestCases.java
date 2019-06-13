package PageTestCases;

import org.testng.annotations.Test;

import PageOperations.LoginPageOperations;

public class LoginPage_TestCases extends LoginPageOperations{
  @Test
  public void LoginPageTestCases() throws Exception {
	  
	  parentTest = extent.createTest("Sample Test Case_ParentNode");
	  childTest = parentTest.createNode("Sample Test Case Steps_ChildNode");
	  childTest.info("Sample test case");
	  childTest.log
		
		LaunchBrowser();
		typeEmail();
		typePassword();
		clickOnLoginButton();
		//compareTitle();
		//captureScreenShot();
		  
	}
}
