package PageOperations;

import org.testng.Assert;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Base.Base;
import PageElements.LoginPage;

public class LoginPageOperations extends Base{
	
	public static void LaunchBrowser() {
		
		 childTest = parentTest.createNode("Login Test Cases - launching browser Step");
		 childTest.info("typeEmail");
		try {
				openURL();
			childTest.log(Status.PASS, MarkupHelper.createLabel("browser launched", ExtentColor.GREEN));
					
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			childTest.log(Status.FAIL, MarkupHelper.createLabel("error in launching browser  "+ e, ExtentColor.RED));  
			
			
			
		}
		
		
	}
  
	public static void typeEmail() {
		 childTest = parentTest.createNode("Login Test Cases - typeEmail Step");
		 childTest.info("typeEmail");
		try {
			if (LoginPage.email().isDisplayed()) {
				type(LoginPage.email(), getPropertyValue("email"));
			childTest.log(Status.PASS, MarkupHelper.createLabel("email is typed", ExtentColor.GREEN));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			childTest.log(Status.FAIL, MarkupHelper.createLabel("email element is not recognized  "+"\n" + e, ExtentColor.RED));       
			
			
		}
	}
	
	public static void typePassword() { 
		
		 childTest = parentTest.createNode("Login Test Cases - typePassword Step");
		 childTest.info("typePassword");
		 
		 try {
			 if (LoginPage.password().isDisplayed()) {
					type(LoginPage.password(), getPropertyValue("password"));
					childTest.log(Status.PASS, MarkupHelper.createLabel("password is typed", ExtentColor.GREEN));
			 }
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				childTest.log(Status.FAIL, MarkupHelper.createLabel("password element is not recognized  "+ e, ExtentColor.RED));
				
				
			}
				
	}
	
	public static void clickOnLoginButton() {
		
		 childTest = parentTest.createNode("Login Test Cases - clickOnLoginButton Step");
		 childTest.info("click On Login Button");
		 
		 try {
			 if (LoginPage.login().isDisplayed()) {
				 click(LoginPage.login());
					childTest.log(Status.PASS, MarkupHelper.createLabel("clicked On Login Button", ExtentColor.GREEN));
			 }
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				childTest.log(Status.FAIL, MarkupHelper.createLabel("login  element is not recognized  " + e, ExtentColor.RED));
				
				
			}
			
	}
	
	public static void compareTitle() {
		
		 childTest = parentTest.createNode("Login Test Cases - compareTitle Step");
		 childTest.info("Compare Title on home page");
		 
		 try {
				 Assert.assertEquals(getDriver().getTitle(),getPropertyValue("expectedTitle1" ));
				 childTest.log(Status.PASS, MarkupHelper.createLabel("home page title compared correctly", ExtentColor.GREEN));
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
			  //e.printStackTrace();
			//childTest.log(Status.FAIL, MarkupHelper.createLabel("home page title doesn't compared correctly  "+"\n" + e, ExtentColor.RED));
				childTest.log(Status.FAIL, MarkupHelper.createLabel("home page title doesn't compared correctly", ExtentColor.RED));
				//System.out.println(e); 
				//System.out.println(e.toString());
				//System.out.println(e.getMessage());
				
			
			}
		
		
	}

	
	/*
	public static void captureScreenShot() throws Exception{
		
		Base.CaptureScreenshot(getDriver(), "HomePage" );
		
	}*/
}
