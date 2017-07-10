package SpiderG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

public class Walkthrough_Test extends Base_Class {
	
  @BeforeTest
  public void beforeTest() throws MalformedURLException {
	  System.out.println("In walkthrough Test");
  }
	
  @Test
  public void walkthrough() {
	  
//		driver.findElement(By.id("com.gladiris.spiderg.android:id/skip")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		System.out.println("Skip button is clicked");
//	  	WebElement Next=driver.findElement(By.id("com.gladiris.spiderg.android:id/next"));
//	  	if(Next.isDisplayed())
//	  	{
//	  		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//	  		Next.click();
//	  		System.out.println("Next button is clicked");
//	  		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//	  	}else
//	  	{
//	  		driver.findElement(By.id("com.gladiris.spiderg.android:id/skip")).click();
//			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//			System.out.println("Skip button is clicked");
//	  	};
		
//		boolean Next=driver.findElement(By.id("com.gladiris.spiderg.android:id/next")).isDisplayed()==true;
//		
	

//			   //To verify element is present on page or not.
//			   String NextId = "com.gladiris.spiderg.android:id/next";
//			   String DoneId =  "com.gladiris.spiderg.android:id/done";
//			   String SkipId =  "com.gladiris.spiderg.android:id/done";
//			   
//			   Boolean iselementpresentNext = driver.findElements(By.id(NextId)).size()!= 0;
//			   Boolean iselementpresentDone = driver.findElements(By.id(DoneId)).size()!= 0;
//			   Boolean iselementpresentSkip = driver.findElements(By.id(SkipId)).size()!= 0;
//			   if (iselementpresentNext == true)
//			   { 	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//				   	driver.findElement(By.id("com.gladiris.spiderg.android:id/next")).click();
//			  
//			   }
//			   else if( iselementpresentDone==true)
//			   {
//				   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//				   driver.findElement(By.id("com.gladiris.spiderg.android:id/done")).click();
//			   }
//			   else if (iselementpresentSkip==true)
//			   {
//				   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//				   driver.findElement(By.id("com.gladiris.spiderg.android:id/skip")).click();
//			   }

			 
//		
//		while(Next)
//		{
//			driver.findElement(By.id("com.gladiris.spiderg.android:id/next")).click();
//			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//			System.out.println("Next button is clicked");
//		}
//		
//		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		if(driver.findElement(By.id("com.gladiris.spiderg.android:id/done")).isDisplayed())
//		{
//			driver.findElement(By.id("com.gladiris.spiderg.android:id/done")).click();
//		}else
//		{System.out.println("No done button found");
//		}
//		//driver.findElement(By.className("android.widget.Button")).click();
//		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		System.out.println("Done button is clicked");
		
		
		
//		
		driver.findElement(By.id("com.gladiris.spiderg.android:id/skip")).click();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("Skip button is clicked");
		
		//condition to be write
//		
		driver.findElement(By.id("com.gladiris.spiderg.android:id/btnAgreeContinue")).click();
	driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);
		System.out.println("Agree and continue button is clicked");
  }
		
		
		
	  

 

  @AfterTest
  public void afterTest() {
  }

}
