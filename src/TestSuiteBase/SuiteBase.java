package TestSuiteBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import java.net.MalformedURLException;
import java.net.URL;

import Utility.Read_XLSX;

public class SuiteBase {
	public static Read_XLSX TestSuiteListExcel = null;
	public static Read_XLSX TestCaseListExcelOne = null;
	public static Logger Add_Log = null;
	public boolean BrowseralreadyLoaded = false;
	public static Properties Param = null;

	public static WebDriver driver = null;
	public static WebDriver ExistingchromeBrowser;
	public static WebDriver ExistingmozillaBrowser;
	public static WebDriver ExistingIEBrowser;
	protected static PrintWriter reporter = null;
	static String screenShotPath = "";
	public static int TestfailCounter = 0;
	
	public static ExtentReports extent;
	public static ExtentTest test;
	public static ExtentTest tempTest; 
	
	public static final String USERNAME = "deepak00";
	public static final String ACCESS_KEY = "6636885b-618b-45af-9ef3-7e99a064e393";
	public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	 

	public void init() throws IOException {
		// To Initialize logger service.
		String log4jConfigFile = System.getProperty("user.dir") + "//log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		Add_Log = Logger.getLogger("rootLogger");
		// Please change file's path strings bellow If you have stored them at location
		// other than bellow.
		// Initializing Test Suite List(TestSuiteList.xls) File Path Using Constructor
		// Of Read_XLS Utility Class.
		TestSuiteListExcel = new Read_XLSX(System.getProperty("user.dir")+"//ExcelFiles//TestSuiteList.xlsx");
		// Initializing IRS Test Suite (IRS.xls) File Path Using Constructor Of Read_XLS
		// Utility Class.
		TestCaseListExcelOne = new Read_XLSX(System.getProperty("user.dir")+"//ExcelFiles//SuiteOne.xlsx");
		// Bellow given syntax will Insert log In applog.log file.
		Add_Log.info("All Excel Files Initialised successfully.");

		// Initialize Param.properties file.
		Param = new Properties();
		FileInputStream fip = new FileInputStream(
				System.getProperty("user.dir") + "//property//Param.properties");
		Param.load(fip);
		Add_Log.info("Param.properties file loaded successfully.");
	}

	// Edited Time format used while saving screen shots
	public static String Time() {
		SimpleDateFormat NewDateformat = new SimpleDateFormat("dd-MM-yy HH:mm:ss:SSS");
		Date now = new Date();
		String Date = NewDateformat.format(now);
		return Date.replace(":", "-");
	}
	
	public static void CheckBox(WebElement element, String CheckBoxStatus, String CheckBoxValue)
	{
		try{
		if(element.isSelected())
		{
			if(CheckBoxValue.equals("No"))
			{
				click(element, CheckBoxStatus);
			}
			tempTest.log(LogStatus.PASS, "Checked on " + CheckBoxStatus);
			
			Add_Log.info("Checked on " + CheckBoxStatus);
		}
		
		if(!(element.isSelected()))
		{
			if(CheckBoxValue.equals("Yes"))
			{
				click(element, CheckBoxStatus);
			}
			
			tempTest.log(LogStatus.PASS, "Checked on " + CheckBoxStatus);
			Add_Log.info("Checked on " + CheckBoxStatus);
		}
		
		}catch (Exception e) {
				TestfailCounter++;
				tempTest.log(LogStatus.FAIL,  e+test.addScreenCapture(takeScreenShot()));
				Add_Log.info("In check " + e.getMessage());
				throw (e);
			}
		}
		
		
		
	
	
	// For Taking screen shot
	public static String takeScreenShot() {
		try {
			File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			screenShotPath = System.getProperty("user.dir").concat("/ScreenShots/") + Time().concat(".jpg");
			FileUtils.copyFile(source, new File(screenShotPath));
		} catch (FileNotFoundException fnfe) {
			Add_Log.info("In takeScreenShot " + fnfe.getMessage());
			System.out.print("File not found" + fnfe);
		} catch (IOException e) {
			Add_Log.info("In takeScreenShot " + e.getMessage());
		} catch (Exception e) {
			Add_Log.info("In takeScreenShot " + e.getMessage());
		}
		return screenShotPath;
	}

	public void loadWebBrowser() {
		// Check If any previous webdriver browser Instance Is exist then run new test
		// In that existing webdriver browser Instance.
		if (Param.getProperty("testBrowser").equalsIgnoreCase("Mozilla") && ExistingmozillaBrowser != null) {
			driver = ExistingmozillaBrowser;
			return;
		} else if (Param.getProperty("testBrowser").equalsIgnoreCase("chrome") && ExistingchromeBrowser != null) {
			driver = ExistingchromeBrowser;
			return;
		} else if (Param.getProperty("testBrowser").equalsIgnoreCase("IE") && ExistingIEBrowser != null) {
			driver = ExistingIEBrowser;
			return;
		}

		if (Param.getProperty("testBrowser").equalsIgnoreCase("Mozilla")) {
			// To Load Firefox driver Instance.
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "//BrowserDrivers//geckodriver.exe");
			driver = new FirefoxDriver();
			ExistingmozillaBrowser = driver;
			Add_Log.info("Firefox Driver Instance loaded successfully.");
		} else if (Param.getProperty("testBrowser").equalsIgnoreCase("Chrome")) {
			// To Load Chrome driver Instance.
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//BrowserDrivers//chromedriver.exe");
			driver = new ChromeDriver();
			ExistingchromeBrowser = driver;
			Add_Log.info("Chrome Driver Instance loaded successfully.");
		} else if (Param.getProperty("testBrowser").equalsIgnoreCase("IE")) {
			// To Load IE driver Instance.
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
			capabilities.setCapability("requireWindowFocus", true);
			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir") + "//BrowserDrivers//IEDriverServer.exe");
			driver = new InternetExplorerDriver(capabilities);
			ExistingIEBrowser = driver;
			Add_Log.info("IE Driver Instance loaded successfully.");
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	public void closeWebBrowser() {
		driver.close();
		driver.quit();
		// null browser Instance when close.
		ExistingchromeBrowser = null;
		ExistingmozillaBrowser = null;
		ExistingIEBrowser = null;
	}

	// Method to check Complete Page To Load
	public static void checkPageIsReady() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		long wt=Long.parseLong(Param.getProperty("wtime"));
		for (int i = 0; i < 30; i++) {
			try {
				Thread.sleep(wt);
				System.out.println("*******************-" + i);
			} catch (InterruptedException e) {
			}

			if (js.executeScript("return document.readyState").toString().equals("complete")) {
				break;
			}
		}
	}

	
	//Extent reporting
	public static void initExtentReport(String TestCaseName)
	{
		//To initialize Extent report File
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyyh-mm-ss");
		String CurrentDate = sdf.format(date);
		extent = new ExtentReports(System.getProperty("user.dir")+"\\Report\\"+TestCaseName+CurrentDate+".html",false);
		//extent = new ExtentReports(System.getProperty("user.dir")+"\\Report\\Extent"+".html",false);
		extent.addSystemInfo("Selenium Version", "2.53.1");
		extent.addSystemInfo("Apache Poi Version", "3.15");
		//extent.addSystemInfo("Environment", "Policy || UAT");
		
	} 
	
	
	// This method is to take screenshot for Success
	public static String passscreenshot(String TCName, int dataset) throws Exception {

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyyh-mm-ss");
		String CurrentDate = sdf.format(date);

		File file = new File(System.getProperty("user.dir") + "\\ScreenShots\\Success\\" + TCName);
		file.mkdirs();
		String PathName = System.getProperty("user.dir") + "\\ScreenShots\\Success\\" + TCName + "\\";
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(scrFile,
				new File(PathName + TCName + "-" + "DataSet-" + dataset + "-" + CurrentDate + ".png"));
		String passScreenshotPath = PathName + TCName + "-" + "DataSet-" + dataset + "-" + CurrentDate + ".png";
		passScreenshotPath = passScreenshotPath.replace("\\", "/");
		System.out.println("passScreenshotPath: - "+passScreenshotPath);
		return passScreenshotPath;
	}

	// This method is to take screenshot for Failure
	public static String failScreenshot(String TCName, int dataset) throws Exception {

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyyh-mm-ss");
		String CurrentDate = sdf.format(date);

		File file = new File(System.getProperty("user.dir") + "\\ScreenShots\\Failures\\" + TCName);
		file.mkdirs();
		String PathName = System.getProperty("user.dir") + "\\ScreenShots\\Failures\\" + TCName + "\\";
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(scrFile,
				new File(PathName + TCName + "-" + "dataset-" + dataset + "-" + CurrentDate + ".png"));
		String failScreenShotPath = PathName + TCName + "-" + "dataset-" + dataset + "-" + CurrentDate + ".png";
		failScreenShotPath = failScreenShotPath.replace("\\", "/");
		return failScreenShotPath;
	}

	
	// For sendKeys Operation
	public static void sendkeys(WebElement element, String objectName, String objectValue) {
		try {
			highlightElement(element);
			element.click();
			element.clear();
			element.sendKeys(objectValue);
			//element.sendKeys(Keys.TAB);
			tempTest.log(LogStatus.PASS, "Value Entered in "+objectName+" :: "+objectValue); 
			Add_Log.info(objectName + "  Value Entered");
		} catch (Exception e) {
			TestfailCounter++;
			tempTest.log(LogStatus.FAIL, "Failed to Entered value in "+objectName+e);
			Add_Log.info("Failed to enter value to  " + objectName + e.getMessage());
			throw (e);
		}
	}
	
	
	// For sendKeys Operation
		public static void sendkeysWithOutClear(WebElement element, String objectName, String objectValue) {
			try {
				highlightElement(element);
				element.click();
				//element.clear();
				element.sendKeys(objectValue);
				//element.sendKeys(Keys.TAB);
				tempTest.log(LogStatus.PASS, "Value Entered in "+objectName+" :: "+objectValue); 
				Add_Log.info(objectName + "  Value Entered");
			} catch (Exception e) {
				TestfailCounter++;
				tempTest.log(LogStatus.FAIL, "Failed to Entered value in "+objectName+e);
				Add_Log.info("Failed to enter value to  " + objectName + e.getMessage());
				throw (e);
			}
		}

	// For click of a web element
	public static void click(WebElement element, String objectName) {
		try {
			highlightElement(element);
			element.click();
			 tempTest.log(LogStatus.PASS, "Clicked on " + objectName); 
			Add_Log.info("Clicked on " + objectName);
		} catch (Exception e) {
			TestfailCounter++;
			tempTest.log(LogStatus.FAIL, e+"Failed to click on " + objectName+e);
			Add_Log.info("In click " + e.getMessage());
			throw (e);
		}
	}

	// For click of a web element using JavascriptExecutor
	public static void clickJSE(WebElement element, String objectName) {
		try {
			highlightElement(element);
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", element);
			tempTest.log(LogStatus.PASS, "Clicked on " + objectName + " Element");
			
			Add_Log.info("Clicked on " + objectName + " Element");
		} catch (Exception e) {
			TestfailCounter++;
			tempTest.log(LogStatus.FAIL,  e+test.addScreenCapture(takeScreenShot()));
			Add_Log.info("Failed to click on " + objectName + e.getMessage());
			throw (e);
		}
	}

	// For click of a web element By Actions Class
	public static void clickByActionsClass(WebElement element, String objectName) {
		try {
			highlightElement(element);
			Actions actions = new Actions(driver);
			actions.moveToElement(element).click().build().perform();
			tempTest.log(LogStatus.PASS, "Clicked on " + objectName);
			
			Add_Log.info("Clicked on " + objectName);
		} catch (Exception e) {
			TestfailCounter++;
			tempTest.log(LogStatus.FAIL,  e+test.addScreenCapture(takeScreenShot()));
			Add_Log.info("In click " + e.getMessage());
			throw (e);
		}
	}
	
	// For click of a web element By Actions Class
		public static void moveMouseOverElement(WebElement element, String objectName) {
			try {
				highlightElement(element);
				Actions actions = new Actions(driver);
				actions.moveToElement(element).build().perform();
				
				Add_Log.info("Moved Mouse over " + objectName);
			} catch (Exception e) {
				
				Add_Log.info("on Move " + e.getMessage());
				throw (e);
			}
		}
	
	//For selecting an option from the drop down.
	public static void selectDropDownValue(WebElement dropdownOptions, String dropDownName, String dropdownValue) {
		try {
			Select option = new Select(dropdownOptions);
			option.selectByValue(dropdownValue);
			
			Add_Log.info(dropDownName + " Value " + dropdownValue + " Selected Sucessfully");
		} catch (Exception e) {
			TestfailCounter++;
			
			Add_Log.info("Not able to Select " + dropDownName + " Value " + dropdownValue + e);
			throw (e);
		}
	}
	
	//For selecting an option from the drop down.
	public static void selectDropDownbyVisibleText(WebElement dropdownOptions, String dropDownName, String dropdownValue) throws Exception {
		try {
			Select option = new Select(dropdownOptions);
			Thread.sleep(2000);
			option.selectByVisibleText(dropdownValue);
			
			tempTest.log(LogStatus.PASS, "Dropdown : " + dropDownName + " :: Value Selected= " + dropdownValue);
			Add_Log.info(dropDownName + " Value " + dropdownValue + " Selected Sucessfully");
		} catch (Exception e) {
			TestfailCounter++;
			tempTest.log(LogStatus.FAIL, "Failed to select value from  " + dropDownName, takeScreenShot());
			
			Add_Log.info("Not able to Select " + dropDownName + " Value " + dropdownValue + e);
			throw (e);
		}
	}
	
	//For selecting an option from the drop down.
	public static void selectDropDownbyPartOfText(WebElement dropdownOptions, String dropDownName, String dropdownValue) {
	       try {
	              List<WebElement> options = dropdownOptions.findElements(By.tagName("option"));
	              for(int i=0;i<options.size();i++) {
	                     if (options.get(i).getText().contains(dropdownValue)) {
	                            options.get(i).click();
	                          break;
	                      }
	                     }
	                     tempTest.log(LogStatus.PASS, "Dropdown : " + dropDownName + " :: Value Selected= " + dropdownValue);
	                    
	                     Add_Log.info(dropDownName + " Value " + dropdownValue + " Selected Sucessfully");
	              } catch (Exception e) {
	                     TestfailCounter++;
	                     tempTest.log(LogStatus.PASS, "Failed to select value from  " + dropDownName, takeScreenShot());
	                    
	                     Add_Log.info("Not able to Select " + dropDownName + " Value " + dropdownValue + e);
	                     throw (e);
	              }
	       }

	// Highlighting the Element
	public static void highlightElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,
				"color: black; border: 2px solid green;");
	}
	
	// For comparing the text on UI with the expected one.
			public static void textComparison(WebElement element, String elementName, String elementValue) {
				try {
					highlightElement(element);
					if ((element.getText().contentEquals(elementValue))) {
						tempTest.log(LogStatus.PASS, ("Text : " + elementName + " matches with " +elementValue));
					
					Add_Log.info(elementName + " Text Matched Pass");
					}
					else {
						tempTest.log(LogStatus.PASS, ("Text : " + elementName + " does not matche with " +elementValue));
						
						Add_Log.info(elementName + " Text Matched Failed");
					}
				} catch (Exception e) {
					TestfailCounter++;
					tempTest.log(LogStatus.FAIL,  e+test.addScreenCapture(takeScreenShot()));
					Add_Log.info("Not able to compare the text " + elementName + " " + e);
					throw (e);
				}
			}

			
			public static void SauceLabs() throws MalformedURLException {
				
				System.out.println("1");
				DesiredCapabilities caps = DesiredCapabilities.chrome();
				System.out.println("2");
				  try {
					  System.out.println("3");
						caps.setCapability("version", "37");
						System.out.println("4");
					} catch (Exception e) {
						System.out.println("5");
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				  System.out.println("6");
			    caps.setCapability("platform", Platform.WINDOWS);
			    System.out.println("7");
			 
			     driver = new RemoteWebDriver(new URL(URL), caps);
			     System.out.println("8");
				
				
			}
}
