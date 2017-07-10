package SpiderG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Utility.ExcelUtils;
import Utility.Utility;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.util.concurrent.TimeUnit;

import org.hamcrest.SelfDescribing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;


public class Login_Test extends Base_Class {
	private String sTestCaseName;

	private int iTestCaseRow;
	public boolean isAlreadyLogIn=false;

  @BeforeTest
  public void beforeTest() {
	  
	  
  }
  
  @Test(dependsOnMethods={"SpiderG.Walkthrough_Test.walkthrough"}, dataProvider = "Authentication")
  public void Login(String username, String password) throws InterruptedException {
	  //	System.out.println(driver.getTitle());
	  
	  	System.out.println("You are in Login test");
	  	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	  		driver.navigate().back();
	  		WebElement Email= driver.findElement(By.name("Email id/Phone number"));
		 	Email.sendKeys(username);;
			System.out.println("User name provided is:"+username);
	  	 
			
			if(!isAlreadyLogIn){
	  	        //If Not login then login In to your account
	  		 	//WebElement Email= driver.findElement(By.id("com.gladiris.spiderg.android:id/etLoginUser"));
	  
	  			
	  			driver.findElement(By.id("com.gladiris.spiderg.android:id/etLoginPassword")).sendKeys(password);
	  			System.out.println("Password provided is:"+password);
	  			
	  			
	  		     WebElement loginButton = driver.findElement(By.id("com.gladiris.spiderg.android:id/btnLogin"));
	  		     loginButton.click();
	  		     System.out.println("You clicked on Login button");
	  		     Thread.sleep(6000);
	  		     
	  			 Utility.captureScreenshot(driver, "LoginProcess"); 
		  	    
	  			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	  			
//	  	
//	  				WebDriverWait wait = new WebDriverWait(driver,30);     
//	  				wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className(("android.widget.FrameLayout"))));
	  		
	  		
	  	       
	  	 }
	  
  }
//
//  @Test(dependsOnMethods={"Login"})
//  public void LogOut(){
//	//Logout Functionality
//	  System.out.println("Logout");
//	  WebDriverWait wait = new WebDriverWait(driver,30);     
//	  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className(("android.widget.FrameLayout"))));
//	 
//	  
//	  }
  
//	  	driver.findElement(By.id("com.gladiris.spiderg.android:id/ivLoginLogo")).isDisplayed();
//	 	System.out.println("Logo is present");
//	 	
//	 // WebDriver driver=newWalkthrough.driver;
//	 	driver.findElement(By.id("com.gladiris.spiderg.android:id/etLoginUser")).sendKeys(username);
//		System.out.println("User name provided is:"+username);
//		
//		driver.findElement(By.id("com.gladiris.spiderg.android:id/etLoginPassword")).sendKeys(password);
//		System.out.println("User name provided is:"+password);
//		
//	    driver.findElement(By.id("com.gladiris.spiderg.android:id/btnLogin")).click();
//		System.out.println("You clicked on Login button");
//		
//		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	
//		
//		Utility.captureScreenshot(driver, "LoginProcess");
//		
//		//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
//		
////		String bodyText = driver.findElement(By.tagName("android.widget.LinearLayout")).getText();
////		Assert.assertTrue(bodyText.contains("SpiderG"));
//		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
//		Boolean SpiderGTital=driver.findElement(By.id("com.gladiris.spiderg.android:id/tvActionBarTitle")).isDisplayed();
//		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
//		if(SpiderGTital)
//		{
//			System.out.println("Login Successful");
//		}
//		else 
//		{
//			System.out.println("Login Unsuccessful");
//		}
//	
//  }
  
  @DataProvider(name = "Authentication")
  
  public  Object[][] credentials() throws Exception {
	 

 
	 	ExcelUtils.setExcelFile("C:/SpiderG/Workspace/SpiderG_Android_Test/src/TestData/TestData.xlsx","Sheet1");
	 	 
	 	sTestCaseName = this.toString();

	  	// From above method we get long test case name including package and class name etc.

	  	// The below method will refine your test case name, exactly the name use have used

	  	sTestCaseName = ExcelUtils.getTestCaseName(this.toString());

	    // Fetching the Test Case row number from the Test Data Sheet

	    // Getting the Test Case name to get the TestCase row from the Test Data Excel sheet

	 	iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);

	    Object[][] testObjArray = ExcelUtils.getTableArray("C:/SpiderG/Workspace/SpiderG_Android_Test/src/TestData/TestData.xlsx","TestData",iTestCaseRow);

	   return (testObjArray);
  }
  
  @AfterTest
  public void afterTest() {
  }

}

