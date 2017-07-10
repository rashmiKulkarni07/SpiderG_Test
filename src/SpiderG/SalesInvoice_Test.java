package SpiderG;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import Utility.Utility;
import bsh.commands.dir;
import bsh.util.Util;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Facet;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class SalesInvoice_Test extends Base_Class {
	
  @Test(dependsOnMethods={"SpiderG.Login_Test.Login"})
  public void SalesAndPurchase() throws InterruptedException {
	  System.out.println("You are in Sales Invoice test");
	 
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
	  Thread.sleep(1000);
	  Utility.captureScreenshot(driver, "Navigation Drawer");
	   
	  WebElement SaleAndPurchase=  driver.findElement(By.name("Sales & Purchase"));
	  Assert.assertEquals(SaleAndPurchase.getText(), "Sales & Purchase"); 
	  SaleAndPurchase.click();
	  System.out.println("Sales and purchase is open");
	  Thread.sleep(3000);
	  Utility.captureScreenshot(driver, "Sales & Purchase Open");
	  
	  WebElement purchaseTab=driver.findElement(By.name("Purchase"));
	  System.out.println("Size of purchase tab : " +purchaseTab.getSize());
	  
	  WebElement InvoiceBottomTab=driver.findElement(By.name("Invoice"));
	  System.out.println("Size of Invoice bottom tab : " +InvoiceBottomTab.getSize());
	  
//	  WebElement FABbutton=  driver.findElement(By.xpath("//android.widget.ImageButton[@bounds='[588,1044][720,1184]']"));
//	  System.out.println("Size of FAB button: " + FABbutton.getSize());
  
	 
   
	  //WebElement purchaseEntryIcon=driver.findElement(By.className("com.gladiris.spiderg.android:id/fab_purchase_entry"));

	  
	  
	  if(purchaseTab.isDisplayed())
	  {
		  if(purchaseTab.isSelected())
		  {
			  if(InvoiceBottomTab.isDisplayed() && InvoiceBottomTab.isSelected())
			  {
				  
				  driver.findElement(By.xpath("//android.widget.ImageButton[@bounds='[588,1044][720,1184]']")).click();
				  
				  
				  System.out.println("You click on FAB button on right bottom corner");
				  Thread.sleep(6000);
				  Utility.captureScreenshot(driver, "FAB button view");
				  
				  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				 // WebElement SalesInvoiceIcon=driver.findElement(By.className("com.gladiris.spiderg.android:id/fab_sales_invoice"));
				  
				  driver.findElement(By.xpath("//android.widget.ImageButton[@bounds='[604,828][704,936]']")).click();
				  System.out.println("Yo clicked on Create Sales Invoice button");
				  
				  if(driver.findElement(By.className("android.widget.TextView")).isDisplayed())
				  {
					  	  if(driver.findElement(By.className("android.widget.TextView")).isDisplayed())
					  	  {
					  		  
					  		WebElement InvoiceNumber=driver.findElement(By.id("com.gladiris.spiderg.android:id/tvCreateDocNumber"));
					  		InvoiceNumber.click();
					  		System.out.println("Invoice Number button is clicked");
					  		
					  		WebElement InvoiceNumberTital= driver.findElement(By.id("com.gladiris.spiderg.android:id/tvDocNumDialogTitle"));
					  		if(InvoiceNumberTital.isDisplayed())
					  		{
					  			System.out.println("You are in Invoice Number adding screen");
					  			WebElement PNumber=driver.findElement(By.id("com.gladiris.spiderg.android:id/etDocNumDialogPrefix"));
					  			PNumber.clear();
					  			PNumber.sendKeys("Invoice");
					  			Utility.captureScreenshot(driver, "Prefix Adding");
					  				
//					  			WebElement INumber=driver.findElement(By.id("com.gladiris.spiderg.android:id/etDocNumDialogPrefix"));
//					  			INumber.clear();
					  			
					  			//Set Default button of Invoice number
					  			WebElement INSetDefaultButton=driver.findElement(By.id("com.gladiris.spiderg.android:id/btnDocNumDialogSetDefault"));
					  			System.out.println("Size of Set Default Button on Invoice Adding screen"+ INSetDefaultButton.getSize());
					  			System.out.println("Location of Set Default Button on Invoice Adding screen"+INSetDefaultButton.getLocation());
					  			INSetDefaultButton.click();
					  			Utility.captureScreenshot(driver, "Click on Set default Button");
					  			
					  			
					  			//For issue date 
					  			System.out.println("Issue date checking");
					  			WebElement IssueDateClick=driver.findElement(By.xpath("//android.widget.TextView[@bounds='[526,180][696,231]']"));
					  			IssueDateClick.click();
					  			
					  			WebElement IssuePickerMonth = driver.findElement(By.xpath("//android.widget.EditText[@bounds='[128,634][256,730]']"));
					  			WebElement IssuePickerDate = driver.findElement(By.xpath("//android.widget.EditText[@bounds='[288,634][416,730]']"));
					  			WebElement IssuePickerYear = driver.findElement(By.xpath("//android.widget.EditText[@bounds='[448,634][576,730]']"));
					  		
					  			IssuePickerMonth.sendKeys("Jul");
					  			IssuePickerDate.sendKeys("21");
					  			IssuePickerYear.sendKeys("2017");
					  			
					  			WebElement IssueDoneButton=driver.findElement(By.id("android:id/button1"));
					  			IssueDoneButton.click();
					  			
					  			//for Due Date
					  			WebElement DueDateClick= driver.findElement(By.id("com.gladiris.spiderg.android:id/tvCreateDocDueDateValue"));
					  			DueDateClick.click();
					  			System.out.println("Due date click");
					  			
  			
					  			WebElement DuePickerMonth = driver.findElement(By.xpath("//android.widget.EditText[@bounds='[128,634][256,730]']"));
					  			WebElement DuePickerDate = driver.findElement(By.xpath("//android.widget.EditText[@bounds='[288,634][416,730]']"));
					  			WebElement DuePickerYear = driver.findElement(By.xpath("//android.widget.EditText[@bounds='[448,634][576,730]']"));
					  		
					  			DuePickerMonth.sendKeys("Jul");
					  			DuePickerDate.sendKeys("21");
					  			DuePickerYear.sendKeys("2017");
					  			WebElement DueDoneButton=driver.findElement(By.id("android:id/button1"));
					  			DueDoneButton.click();
					  			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					  			
					  			//currency
					  			WebElement CurrencyOnInvoice = driver.findElement(By.id("com.gladiris.spiderg.android:id/spCurrency"));
					  			CurrencyOnInvoice.click();
					  			
					  			WebElement CurrencySelect = driver.findElement(By.name("Indian Rupee"));
					  			CurrencySelect.click();
					  			System.out.println("Indian rupee is clicked");
					  			
					  			//customer selection
					  			WebElement CustomerSelect = driver.findElement(By.id("com.gladiris.spiderg.android:id/rlCreateDocReceiverOrg")); 
					  			CustomerSelect.click();
					  			System.out.println("Select Customer screen get open");
					  			
					  			WebElement SearchCustomer = driver.findElement(By.id("com.gladiris.spiderg.android:id/etBPartnerSearch"));
					  			SearchCustomer.sendKeys("Gladiris");
					  			System.out.println("company name typed");
					  			
					  			WebElement CustomerSearchClick= driver.findElement(By.id("com.gladiris.spiderg.android:id/ivBPartnerSearch"));
					  			CustomerSearchClick.click();
					  			System.out.println("Company searched");
					  			
					  			WebElement ClickOnCompany = driver.findElement(By.id("com.gladiris.spiderg.android:id/tvBPartnerName"));
					  			ClickOnCompany.click();
					  			
					  			//WebElement AddItem = driver.findElement(By.id(""));
					  			
					  			
					  			
//					  			Select dropdownbox = new Select(driver.findElement(By.className("android.widget.FrameLayout")));
//					  			dropdownbox.selectByVisibleText("Indian Rupee");
					  			
					  			
					  			
					  			
					  			
//					  			Calendar now = Calendar.getInstance();
//					  			System.out.println("Current Month is : " + (now.get(Calendar.MONTH) + 1));
//					  			//int month=now.get(Calendar.MONTH) + 2;
//					  			PickerDate.sendKeys("now.get(Calendar.MONTH) + 2");
					  			
					  			
					  		
					  			
					  		//	WebElement 
					  			
					  			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					  			
					  			//WebElement IssueDateClick = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[526,180][696,231]']"));
					  			//WebElement IssueDateClick = 
					  			//driver.findElement(By.name("20/06/2017")).click();
					  			//driver.findElement(By.xpath("//android.widget.TextView[@index='3']")).click();
					  			//driver.findElement(By.xpath("//android.widget.NumberPicker[@index='0']//android.widget.Button[@index=0]"));
					  			//driver.findElement(By.id("com.gladiris.spiderg.android:id/tvCreateDocIssueDateValue")).click();
					  			
					  			//IssueDateClick.click();
		  			
					  		}
					  	  }
					  	  else
					  	  {
					  		  System.out.println("Invoice button unable to click");
					  	  }
				  }
				  else
				  {
					  
					  
				  }
				  
				  
//				  if(SalesInvoiceIcon.isDisplayed())
//				  {
//					  System.out.println("Fab menu-->Sales invoice Icon (size): " +SalesInvoiceIcon.getSize());
//					  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//					 // driver.findElement(By.xpath("//android.widget.ImageButton[@bounds='[604,828][704,936]']")).click();
//					  driver.findElement(By.xpath("//android.widget.ImageButton[@index='1']")).click();
//					 // driver.findElement(By.name("Create Sales Invoice")).click();
//					  
//					  Thread.sleep(4000);
//					  Utility.captureScreenshot(driver, "Create sales Invoice screen");
//				  }
//				  else 
//				  {
//					  System.out.println("Create sales Invoice is not getting display");
//					  
//				  }
				
				  
				  
			 
			  }
			  else 
			  { 
				  System.out.println("You are not in invoice................");
			  }
		  }
		  else
		  {
			  System.out.println("Purchase tab is not selected............");
		  }
		  
	  }
	  else 
	  {
		  
		  System.out.println("Purchase tab getting failed.........");
	  }
	  
  }
  
  @Test(dependsOnMethods={"SalesAndPurchase"})
  public void AddItems() throws InterruptedException {
	  System.out.println("Inside add item test");
	  driver.navigate().back();
	  WebElement AddItems = driver.findElement(By.id("com.gladiris.spiderg.android:id/tvCreateDocAddItems"));
	  AddItems.click();
	  Utility.captureScreenshot(driver, "Add item screen");
	  
	  WebElement ProductName = driver.findElement(By.id("com.gladiris.spiderg.android:id/avAddLineItemProduct"));
	  ProductName.sendKeys("Product 1");
	  System.out.println("Product name get added");
	  
	  WebElement Description =driver.findElement(By.id("com.gladiris.spiderg.android:id/etAddLineItemProductDescription"));
	  Description.sendKeys("cables, testers and cleaners.");
	  System.out.println("Description get added");
	  Utility.captureScreenshot(driver, "Data added");
	  driver.navigate().back();
	  //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	  WebElement SelectUOM = driver.findElement(By.id("com.gladiris.spiderg.android:id/spAddLineItemUOM"));
	  SelectUOM.click();
	  System.out.println("select UOM is click");
	  WebElement UOMFromList= driver.findElement(By.xpath("//android.widget.CheckedTextView[@bounds='[40,346][415,442]']"));
	  //UOMFromList.click();
	  if(UOMFromList.isDisplayed())
	  {
		  System.out.println("UOM is displayed");
		  UOMFromList.click();
	  }
	  
	  WebElement SelectQuantity = driver.findElement(By.id("com.gladiris.spiderg.android:id/etAddLineItemQty"));
	  SelectQuantity.sendKeys("100");
	  System.out.println("Quantity is send");
	 // driver.hideKeyboard();
	  //driver.navigate().back();
	 // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  WebElement SelectPrice = driver.findElement(By.id("com.gladiris.spiderg.android:id/etAddLineItemAmount"));
	  SelectPrice.sendKeys("200");
	  System.out.println("Price is send");
	 // driver.navigate().back();
	  Utility.captureScreenshot(driver, "Price set successfully");
	  
	  WebElement SelectTax = driver.findElement(By.xpath("//android.widget.Spinner[@bounds='[360,878][688,978]']"));
	  SelectTax.click();
	  System.out.println("Tax is set");
	
	  WebElement TaxFromDropDown = driver.findElement(By.xpath("//android.widget.CheckedTextView[@bounds='[368,444][648,540]']"));
	  TaxFromDropDown.click();
	  //driver.navigate().back();
	  
	  WebElement DoneButton = driver.findElement(By.id("com.gladiris.spiderg.android:id/btnAddLineItem"));
	  DoneButton.click();
	  Utility.captureScreenshot(driver,"Item added Succesfully");
	  	  
	  
  }
  
  @Test(dependsOnMethods={"SalesAndPurchase"})
  public void AdvancePayment() throws InterruptedException {
  WebElement AdvancePayment=driver.findElement(By.id("com.gladiris.spiderg.android:id/rlCreateDocPaymentMethod"));
  AdvancePayment.click();
  System.out.println("Advance Payment received clicked");
  
  WebElement ReceivedPayment = driver.findElement(By.name("Received Payment"));
  if(ReceivedPayment.isDisplayed())
  {
	  
	  System.out.println("You are on received payment screen");
	  
	  WebElement paymentMethod = driver.findElement(By.id("com.gladiris.spiderg.android:id/spDocAddPaymentDetailMethod"));
	  paymentMethod.click();
	  System.out.println("Payment method drop down is clicked");
	  
	  WebElement selectPaymentMethod = driver.findElement(By.name("CASH"));
	  selectPaymentMethod.click();
	  System.out.println("Payment method select as CASH"); 
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
//	  WebElement BankAccount = driver.findElement(By.id("com.gladiris.spiderg.android:id/spDocAddPaymentDetailBankAccount"));
//	  BankAccount.click();
	  
	  WebElement Amount = driver.findElement(By.id("com.gladiris.spiderg.android:id/etDocAddPaymentDetailAmount"));
	  Amount.sendKeys("200");
	  
	 // driver.navigate().back();
	  
	  WebElement Done= driver.findElement(By.id("com.gladiris.spiderg.android:id/btnDocAddPaymentDetailDone"));
	  Done.click();
	  Utility.captureScreenshot(driver, "payment received");
	  
	  //WebElement Amount = driver.findElement(By.id("//android.widget.EditText[@bounds='[345,811][667,891]']"));
	  
  }
  }
	
  @Test(dependsOnMethods={"SalesAndPurchase"})
  public void TermsAndConditions() throws InterruptedException { 
		  swipingVertical();
		  WebElement TermsAndConditions = driver.findElement(By.id("com.gladiris.spiderg.android:id/tvCreateDocTerms"));
		  TermsAndConditions.click();
		  System.out.println("Terms and Conditions clicked");
		  
		  WebElement TermsAndConditionsDescription = driver.findElement(By.id("com.gladiris.spiderg.android:id/etCreateDocTnCText"));
		  TermsAndConditionsDescription.sendKeys("Some Terms and Conditions");	  
		  
		  WebElement  SetDefault = driver.findElement(By.id("com.gladiris.spiderg.android:id/btnCreatDocTnCSetDefault"));
		  driver.navigate().back();
		  SetDefault.click();
		  System.out.println("Set default button is clicked");
		  
	  }
	  
  @Test(dependsOnMethods={"SalesAndPurchase"})
  public void saveInvoice() throws InterruptedException { 
		  
		  WebElement saveButton= driver.findElement(By.id("com.gladiris.spiderg.android:id/btnCreateDocSave"));
		  saveButton.click();
		  
		  System.out.println("save button clicked");
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  WebElement FabButton= driver.findElement(By.xpath("//android.widget.ImageView[@bounds='[620,1080][688,1148]']"));
		  if(FabButton.isDisplayed())
		  {
			   System.out.println("Invoice created successfully......");
			   
			   WebElement FabClose = driver.findElement(By.xpath("//android.widget.ImageButton[@bounds='[588,1044][720,1184]']"));
			   FabClose.click();
				  
				 
			  }
		  
		  else
		  {
			    System.out.println("Invoice creation failed.......");
		  }
 }
	  
  @Test(dependsOnMethods={"saveInvoice"})
  public void OpenSavedInvoiceFromDraft() throws InterruptedException { 
	  //driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
//	  WebElement draftInvoiceTabs = driver.findElement(By.id("Draft Invoice"));
//	  if(draftInvoiceTabs.isDisplayed())
//	  {
		  WebElement SaveInvoiceCart = driver.findElement(By.id("com.gladiris.spiderg.android:id/tvInvoiceDocumentNumber"));
			 if(SaveInvoiceCart.isDisplayed())
			 {
				 System.out.println("cart is present");	 
				 SaveInvoiceCart.click();
				 WebElement InvoiceNumberAfterOpen = driver.findElement(By.id("com.gladiris.spiderg.android:id/tvCreateDocNumber"));
				assertEquals(InvoiceNumberAfterOpen.getText(), "Invoice-1");
				 
				 System.out.println("Draft invoice get open");
				 
			 }
			 else
			 {
				 System.out.println("cart is not present");
			 }
	  }
  //}
  
  @Test(dependsOnMethods={"OpenSavedInvoiceFromDraft"})
  public void SendInvoice() throws InterruptedException { 
	  System.out.println("Inside Send Invoice test case");
	  WebElement SendInvoiceButton = driver.findElement(By.id("com.gladiris.spiderg.android:id/btnViewDocChat"));
	  SendInvoiceButton.click();
	  System.out.println("Invoice Document send successfully");
	  Utility.captureScreenshot(driver, "Invoice send");
  }

  @Test(dependsOnMethods={"OpenSavedInvoiceFromDraft"})
  public void ExportInvoice() throws Exception { 
	  System.out.println("Inside Export Invoice test case");
	  WebElement ExportInvoiceButton = driver.findElement(By.id("com.gladiris.spiderg.android:id/btnViewDocExport"));
	  driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	  ExportInvoiceButton.click();
	  System.out.println("Invoice Document Export successfully");
	  Utility.captureScreenshot(driver, "Invoice Exported");
  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  
  }

  @AfterTest
  public void afterTest() {
	  
  }
  public static void swipingVertical() throws InterruptedException { 
	  Dimension size;
	  //Get the size of screen. 
	  size = driver.manage().window().getSize(); 
	  System.out.println(size); 
	  //Find swipe start and end point from screen's with and height. 
	  //Find starty point which is at bottom side of screen. 
	  int starty = (int) (size.height * 0.80); 
	  //Find endy point which is at top side of screen.
	  int endy = (int) (size.height * 0.20);
	  //Find horizontal point where you wants to swipe. It is in middle of screen width. 
	  int startx = size.width / 2; System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx); 
	  //Swipe from Bottom to Top. 
	  driver.swipe(startx, starty, startx, endy, 3000); 
	  Thread.sleep(2000); 
	  //Swipe from Top to Bottom. 
//	  driver.swipe(startx, endy, startx, starty, 3000); 
//	  Thread.sleep(2000);
	  }
  }


