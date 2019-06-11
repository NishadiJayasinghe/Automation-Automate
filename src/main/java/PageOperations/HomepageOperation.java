package PageOperations;

import org.openqa.selenium.interactions.Actions;
import Base.Base;
import PageElements.HomePage;

public class HomepageOperation extends Base{
	
public static void clickOnSelenium() {
		
		Actions act = new Actions(getDriver());
		act.moveToElement(HomePage.selenium()).perform();
		HomePage.selenium().click();
	}
	
	public static void clickOnYahoo() {
		Actions act = new Actions(getDriver());
		act.moveToElement(HomePage.yahoo()).perform();
		HomePage.yahoo().click();
	}
	
	/*
	public static void captureScreenShot() throws Exception{
		
		Base.CaptureScreenshot(getDriver(), "YahooPage" );
		
	}*/
	
	public static void terminateBrowser() {
		
		getDriver().quit();
	}
}
