package PageOperations;

import org.testng.Assert;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Base.Base;
import PageElements.LoginPage;

public class LoginPageOperations extends Base{
	
	public static void LaunchBrowser() {
		
		 childTest = parentTest.createNode("Login Test Case childNode - launching browser Step");
		 childTest.info("typeEmail");
		try {
				openURL();
			childTest.log(Status.PASS, MarkupHelper.createLabel("browser launched", ExtentColor.GREEN));
					
		} catch (Exception e) {
			// TODO Auto-generated catch block
			childTest.log(Status.FAIL, MarkupHelper.createLabel("error in launching browser", ExtentColor.RED));       
			
			e.printStackTrace();
		}
		
		
	}
  
	public static void typeEmail() {
		 childTest = parentTest.createNode("Login Test Case childNode - typeEmail Step");
		 childTest.info("typeEmail");
		try {
			if (LoginPage.email().isDisplayed()) {
			LoginPage.email().sendKeys("jayasingheane@gmail.com");
			childTest.log(Status.PASS, MarkupHelper.createLabel("email is typed", ExtentColor.GREEN));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			childTest.log(Status.FAIL, MarkupHelper.createLabel("email element is not recognized", ExtentColor.RED));       
			
			e.printStackTrace();
		}
	}
	
	public static void typePassword() { 
		
		 childTest = parentTest.createNode("Login Test Case childNode - typePassword Step");
		 childTest.info("typePassword");
		 
		 try {
			 if (LoginPage.password().isDisplayed()) {
					LoginPage.email().sendKeys("123456789");
					childTest.log(Status.PASS, MarkupHelper.createLabel("password is typed", ExtentColor.GREEN));
			 }
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				childTest.log(Status.FAIL, MarkupHelper.createLabel("password element is not recognized", ExtentColor.RED));
				
				e.printStackTrace();
			}
				
	}
	
	public static void clickOnLoginButton() {
		
		 childTest = parentTest.createNode("Login Test Case childNode - clickOnLoginButton Step");
		 childTest.info("click On Login Button");
		 
		 try {
			 if (LoginPage.login().isDisplayed()) {
				 LoginPage.login().click();
					childTest.log(Status.PASS, MarkupHelper.createLabel("clicked On Login Button", ExtentColor.GREEN));
			 }
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				childTest.log(Status.FAIL, MarkupHelper.createLabel("login  element is not recognized", ExtentColor.RED));
				
				e.printStackTrace();
			}
			
	}
	
	public static void compareTitle() {
		
		 childTest = parentTest.createNode("Login Test Case childNode - compareTitle Step");
		 childTest.info("Compare Title on home page");
		 
		 try {
				 Assert.assertEquals("Insurance Broker System", getDriver().getTitle());
				 childTest.log(Status.PASS, MarkupHelper.createLabel("home page title compared correctly", ExtentColor.GREEN));
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				childTest.log(Status.FAIL, MarkupHelper.createLabel("home page title doesn't compared correctly", ExtentColor.RED));
				
				e.printStackTrace();
			}
		
		
	}

	
	/*
	public static void captureScreenShot() throws Exception{
		
		Base.CaptureScreenshot(getDriver(), "HomePage" );
		
	}*/
}
