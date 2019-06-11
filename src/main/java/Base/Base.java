package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	public static String baseURL = "http://demo.guru99.com/insurance/v1/index.php";
	
	public static void openURL() {
		
		System.getProperty("wbdriver.chrome.driver","E:\\software\\chromedriver_win32\\chromedriver.exe\\");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	public static WebDriver getDriver() {
		  
		  return driver;
	  }
	  
	/*
	public static void CaptureScreenshot(WebDriver driver, String screenshotname) {
		  
		try {
			TakesScreenshot scrShot= (TakesScreenshot)driver;
			File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
			
			File DestFile = new File("./proof/"+screenshotname+".png");
			FileUtils.copyFile(srcFile, DestFile); 
			System.out.println("Screenshot taken");
		} catch (Exception e) {
			
			System.out.println("exception while taking screenshot" +  e.getMessage());
		}
	}
*/
}
