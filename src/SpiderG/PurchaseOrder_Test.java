package SpiderG;

import org.testng.annotations.Test;

import Utility.Utility;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class PurchaseOrder_Test extends Base_Class {
  @Test(dependsOnMethods={"SpiderG.Login_Test.Login"})
  public void PurchaseOrder() throws Exception {
	  //driver.navigate().back();
	  
	  System.out.println("You are in Purchase Order Test");
	  WebElement backButton =  driver.findElement(By.xpath("//android.widget.ImageButton[@bounds='[0,50][112,162]']"));
	  backButton.click();
	  System.out.println("Back button is clicked");
			  
	  WebElement Ndrawer=driver.findElement(By.id("com.gladiris.spiderg.android:id/menuLeft"));
	  driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	  
	  if(Ndrawer.isDisplayed())
	  {	
		  Ndrawer.click();
	  }
	  else
	  {
		  System.out.println("Sales & purchase is not displayed/ You are not allowed to open Sales & Purchase");
	  }                                                           
			  	
	  System.out.println("Nevigation drawer is open");
	  

	  // Thread.sleep(1000);
	  Utility.captureScreenshot(driver, "Navigation Drawer");
	  WebElement SaleAndPurchase=  driver.findElement(By.xpath("//android.support.v7.widget.LinearLayoutCompat[@bounds='[0,482][560,578]']"));
	  //SaleAndPurchase.click();
	  //Assert.assertEquals(SaleAndPurchase.getText(), "Sales & Purchase"); 
	  Thread.sleep(1000);
	  SaleAndPurchase.click();
	  System.out.println("Sales and purchase is open");
	  
	  
	   
  }
  
  @Test(dependsOnMethods={"PurchaseOrder"})
  public void POTabClick() throws Exception {
	  
	  WebElement POTab = driver.findElement(By.name("PO"));
	  POTab.click();
	  
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  WebElement FABButtonPO = driver.findElement(By.xpath("//android.widget.ImageButton[@bounds='[588,1044][720,1184]']"));
	  FABButtonPO.click();
	  System.out.println("FAB button is clicked");
	  
	  
  }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before test");
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
