package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

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
	
	
	
	
	
	static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	public static ExtentTest parentTest;
	public static ExtentTest childTest;
    public static ITestResult result;
	   
	@BeforeTest
	public void startReport() {
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/extentReport/ExtentReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		extent.setSystemInfo("Host Name", "SoftwareTestingMaterial");
		extent.setSystemInfo("Environment", "Automation Testing");
		extent.setSystemInfo("User Name","Nishadi");
		//extent.loadConfig(new File(System.getProperty("user.dir" + "\\extent-config.xml")));
		
	}
	
	
	
	@AfterMethod
	public void getResult(ITestResult result) {
		
		if(result.getStatus() == ITestResult.FAILURE)
        {
            childTest.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" Test case FAILED due to below issues:", ExtentColor.RED));
            childTest.fail(result.getThrowable());
        }
		else if(result.getStatus() == ITestResult.SUCCESS)
        {
            childTest.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
        }
		
		else {
            childTest.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" Test Case SKIPPED", ExtentColor.ORANGE));
            childTest.skip(result.getThrowable());
        }
	}
	
	@AfterTest
	public void endReport() {
		
		extent.flush();
		String path = "C:\\Users\\KOKU-NIPUNI\\eclipse-workspace\\Automate\\extentReport\\ExtentReport.html";
		System.out.println("ExtentTest Report : " + path);
		
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
