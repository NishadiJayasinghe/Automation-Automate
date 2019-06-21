package PageOperations;

import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Base.Base;
import PageElements.HomePage;
import PageElements.LoginPage;

public class HomepageOperation extends Base{
	
	public static void clickOnSelenium() {
		
		 childTest = parentTest.createNode("Home Test Case - click on Selenium step");
		 childTest.info("click on selenium");
		 
			try {
				if (HomePage.selenium().isDisplayed()) {
					Actions act = new Actions(getDriver());
					act.moveToElement(HomePage.selenium()).perform();
					click(HomePage.selenium());
				childTest.log(Status.PASS, MarkupHelper.createLabel("clicked on selenium", ExtentColor.GREEN));
				}
				
			} catch (Exception e) {
				
				// TODO Auto-generated catch block
				e.printStackTrace();
				childTest.log(Status.FAIL, MarkupHelper.createLabel("selenium element is not recognized  " + e, ExtentColor.RED));       
				
			
			}

	}
	
	public static void clickOnYahoo() {
		
		childTest = parentTest.createNode("Home Test Case - click on yahoo step");
		childTest.info("click on yahoo");
		 
			try {
				if (HomePage.yahoo().isDisplayed()) {
					Actions act = new Actions(getDriver());
					act.moveToElement(HomePage.yahoo()).perform();
					click(HomePage.yahoo());
				childTest.log(Status.PASS, MarkupHelper.createLabel("clicked on yahoo", ExtentColor.GREEN));
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				childTest.log(Status.FAIL, MarkupHelper.createLabel("yahoo element is not recognized  " + e, ExtentColor.RED));       
				
				
			}
		
	}
	
	/*
	public static void captureScreenShot() throws Exception{
		
		Base.CaptureScreenshot(getDriver(), "YahooPage" );
		
	}*/
	
	public static void terminateBrowser() {
		
		getDriver().quit();
	}
}
