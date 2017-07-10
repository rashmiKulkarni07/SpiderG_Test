package SpiderG;

import org.testng.annotations.AfterMethod;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Base_Class {
	//static AndroidDriver<WebElement> driver;
	//static AppiumDriver<WebElement> driver;
	//static WebDriver driver;
	//static RemoteWebDriver driver;
	 //static AndroidDriver<MobileElement> driver;
	 //AndroidDriver driver;
	public static AndroidDriver<MobileElement> driver;
	//static WebDriver driver;

	@BeforeSuite
	public void setUP() throws ExecuteException, IOException{
//		CommandLine command = new CommandLine("cmd");
//		command.addArgument("/c");
//		command.addArgument("C://Program Files (x86)/Appium/node_modules/appium/bin//node.exe");
//		command.addArgument("C://Program Files (x86)/Appium/node_modules/appium/bin//appium.js");
//		command.addArgument("--address");
//		command.addArgument("0.0.0.0");
//		command.addArgument("--port");
//		command.addArgument("4724");
//		command.addArgument("--no-reset");
//		command.addArgument("--log");
//		command.addArgument("C:/SpiderG/Workspace/SpiderG_Android_Test/src/SpiderG/appiumLogs.txt");
//		DefaultExecuteResultHandler resultHandler = new DefaultExecuteResultHandler();
//		DefaultExecutor executor = new DefaultExecutor();
//		executor.setExitValue(1);
//		executor.execute(command, resultHandler);
//		
	setcapabilities();
	
	}

	public void setcapabilities() throws MalformedURLException{
		File app= new File("C:\\Users\\rashm\\Desktop\\version_41.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("BROWSER_NAME", "Android");
		capabilities.setCapability("deviceName","");

		capabilities.setCapability("platformVersion", "4.3");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("app", app.getAbsolutePath());

		//capabilities.setCapability("newCommandTimeout", 60000);
		capabilities.setCapability("appPackage", "com.gladiris.spiderg.android");
		capabilities.setCapability("app-activity", "com.gladiris.spiderg.android.SpiderGIntroActivity");
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//AndroidDriver anroidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		//AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		//driver =new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		 //driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities)
		URL serveraddress = new URL("http://127.0.0.1:4723/wd/hub");  
		driver = new AndroidDriver<MobileElement>(serveraddress, capabilities);
		//AndroidDriver<Object> Adriver = new AndroidDriver<Object>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		//driver.scrollTo("About phone");
		System.out.println("Capabilities are set");
		
	}
	
	@AfterMethod
	@AfterSuite
	public void tearDown(){ // Quit android driver instance here}
		//driver.close();
	}
}
