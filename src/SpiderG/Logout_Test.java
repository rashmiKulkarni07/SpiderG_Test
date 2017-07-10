package SpiderG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;

import java.lang.reflect.GenericArrayType;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Logout_Test extends Base_Class {
	Dimension size;
	AppiumDriver<WebElement> Adriver;
	//AndroidDriver<WebElement> andDriver;
	
	  @Test(dependsOnMethods={"SpiderG.Login_Test.Login"})
	  public void Logout() throws InterruptedException {
		//Logout Functionality
		  	
		  if(driver.findElement(By.id("com.gladiris.spiderg.android:id/toolbar")).isDisplayed())
		  {
			  System.out.println("Login successful");
			  driver.findElement(By.id("com.gladiris.spiderg.android:id/menuLeft")).click();
			  
			 // AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap1);
			  
			  
			T4b_logout();
			  
			 // AndroidDriver Adriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), Base_Class.driver);
			  
			  
			  //driver.findElement(By.name("Logout")).click();
			 // swipingVertical();
//			  if(driver.findElement(By.id("com.gladiris.spiderg.android:id/btn1")).isDisplayed())
//			  {
//				  //driver.scrollTo("Place Order");
//				  //driver.findElement(By.name("Logout")).click();
//				 // driver.findElement(By.id("com.gladiris.spiderg.android:id/btn2")).click();
//			  }
		  }
		  else
		  {
			  System.out.println("Login not successful");
		  } 
	  }
	  
	  public void T4b_logout() throws InterruptedException{  

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
          size = driver.manage().window().getSize(); //Get the size of screen.
          System.out.println(size);                   
          int starty = (int) (size.height * 0.80);//Find starty point which is at bottom side of screen.
          int endy = (int) (size.height * 0.20);  //Find endy point which is at top side of screen.          
          int startx = size.width / 2; //Find horizontal point where you wants to swipe. It is in middle of screen width.       
          System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);   // int startx = size.width;
          
         
        // driver .swipe(startx, starty, startx, endy, 3000);//Swipe from Bottom to Top.
          Thread.sleep(2000);
          driver.findElement(By.name("Logout")).click();
          driver.findElement(By.xpath("//android.widget.Button[@text='Ok']")).click();

     }
		  
//	 
//		  public void swipingVertical() throws InterruptedException {
//		   //Get the size of screen.
//		   size = driver.manage().window().getSize();
//		   System.out.println(size);
//		    
//		   //Find swipe start and end point from screen's with and height.
//		   //Find starty point which is at bottom side of screen.
//		   int starty = (int) (size.height * 0.80);
//		   //Find endy point which is at top side of screen.
//		   int endy = (int) (size.height * 0.20);
//		   //Find horizontal point where you wants to swipe. It is in middle of screen width.
//		   int startx = size.width / 2;
//		   System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);
//
//		   //Swipe from Bottom to Top.
//		  
//		   System.out.println("Swipe from bottom to top...");
//		   //Adriver.swipe(startx, starty, startx, endy, 3000);
//		   Thread.sleep(2000);
////		   //Swipe from Top to Bottom.
//		   Adriver.swipe(startx, endy, startx, starty, 1000);
////		   Thread.sleep(2000);
//		  }
//			
	  
	
  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("In Logout test");
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
