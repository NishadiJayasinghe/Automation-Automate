package PageTestCases;

import org.testng.annotations.Test;

import PageOperations.HomepageOperation;

public class HomePageTestCases  {
  @Test
  public void HomePage_TestCases() throws Exception {
	  
 	  clickOnSelenium();
	  clickOnYahoo();
	//  captureScreenShot();
	 terminateBrowser();
	  
  }
}
