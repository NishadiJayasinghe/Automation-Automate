package PageTestCases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import PageOperations.HomepageOperation;

public class HomePageTestCases extends HomepageOperation{
	
  @Test
  public void HomePage_TestCases() throws Exception {
	   
	  parentTest = extent.createTest("Home Test Cases");
	  	  
 	  clickOnSelenium();
	  clickOnYahoo();
	//  captureScreenShot();
	  terminateBrowser();
	 
	 parentTest.log(Status.INFO, "Home test case is passed");
	  
  }
}
