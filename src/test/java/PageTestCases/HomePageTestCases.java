package PageTestCases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import PageOperations.HomepageOperation;

public class HomePageTestCases extends HomepageOperation{
  @Test
  public void HomePage_TestCases() throws Exception {
	  
	  parentTest = extent.createTest("Home Test Case_ParentNode");
	  childTest = parentTest.createNode("Home Test Case Steps_ChildNode");
	  childTest.info("Home test case");
	  childTest.log(Status.INFO, "My test is passed");
	  
 	  clickOnSelenium();
	  clickOnYahoo();
	//  captureScreenShot();
	 terminateBrowser();
	  
  }
}
