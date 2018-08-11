package com.XIPL.SuiteOne;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.XIPL.ReusableFunctions.Login;
import com.XIPL.ReusableFunctions.MyDate;
import com.XIPL.ReusableFunctions.MyProfessionalDetails;
import com.XIPL.ReusableFunctions.PaymentDetails;
import com.XIPL.ReusableFunctions.PolicyDetails;
import com.XIPL.ReusableFunctions.Quote;
import com.XIPL.Screens.HomePage;
import com.XIPL.Screens.MyAccountPage;
import com.XIPL.Screens.PaymentDetailPage;
import com.XIPL.Screens.RenewalTesting;
import com.XIPL.utility.Read_XLS;
import com.XIPL.utility.SuiteUtility;

public class TC050 extends SuiteOneBase{
	
	
	Read_XLS FilePath = null;	
	String SheetName = null;
	String TestCaseName = null;	
	String ToRunColumnNameTestCase = null;
	String ToRunColumnNameTestData = null;
	String TestDataToRun[]=null;
	static boolean TestCasePass=true;
	static int DataSet=-1;	
	static boolean Testskip=false;
	static boolean Testfail=false;
	SoftAssert s_assert =null;
	

	
	static String PolicyNumber;
	
	@BeforeSuite
	public void startup()
	{
		//To Initialize Firefox browser.
				loadWebBrowser();
				
				
				Add_Log.info("WebBrowser is instantiated");
				driver.get(Param.getProperty("siteURL"));		
				Add_Log.info("WebBrowser is Launched");
	}
	@AfterSuite
	public void tearDown()
	{
		closeWebBrowser();
		
	}
	
	@BeforeTest
	public void checkCaseToRun() throws IOException{
		//Called init() function from SuiteBase class to Initialize .xls Files
		init();	
		//To set SuiteOne.xls file's path In FilePath Variable.
		FilePath = TestCaseListExcelOne;		
		TestCaseName = this.getClass().getSimpleName();	
		
		//SheetName to check CaseToRun flag against test case.
		SheetName = "TestCasesList";
		//Name of column In TestCasesList Excel sheet.
		ToRunColumnNameTestCase = "CaseToRun";
		//Name of column In Test Case Data sheets.
		ToRunColumnNameTestData = "DataToRun";
		
		//To check test case's CaseToRun = Y or N In related excel sheet.
		//If CaseToRun = N or blank, Test case will skip execution. Else It will be executed.
		if(!SuiteUtility.checkToRunUtility(FilePath, SheetName,ToRunColumnNameTestCase,TestCaseName)){			
			//To report result as skip for test cases In TestCasesList sheet.
			SuiteUtility.WriteResultUtility(FilePath, SheetName, "Pass/Fail/Skip", TestCaseName, "SKIP");
			//To throw skip exception for this test case.
			throw new SkipException(TestCaseName+"'s CaseToRun Flag Is 'N' Or Blank. So Skipping Execution Of "+TestCaseName);
		}
		//To retrieve DataToRun flags of all data set lines from related test data sheet.
		TestDataToRun = SuiteUtility.checkToRunUtilityOfData(FilePath, TestCaseName, ToRunColumnNameTestData);
		//To Initialize Firefox browser.
		/*loadWebBrowser();
		Add_Log.info("WebBrowser is instantiated");
		driver.get(Param.getProperty("siteURL"));		
		Add_Log.info("WebBrowser is Launched");
		driver.manage().deleteAllCookies();
		Add_Log.info("Cookies Deleted");*/
	}
	
	//Accepts 4 column's String data In every Iteration.
	@Test(dataProvider="TestData")
	public void SuiteOneCaseTwoTest(String Username,String Password,String State,String Profession,
	        String Speciality1,String county,String writeYourSpecialty,String Employment1,String Coverage,String RetroActiveDate,
			String AnticipatedGraduationMonth,String AnticipatedGraduationYear,
			String Graduatedinlast5years,String GraduatedinLast_Month, String GraduatedinLast_Year,String WorkPerWeek, String disciplinaryboardaction5Years,
			String NoOfClaims,String BoardAction,
			String FirstName,String LastName,String BusinessEntity,String StreetAddress,String City,String State2,String zipCode,String PhoneNo, String PaymentMode1,
			String CardNumber,String CVV,String ExpMonth,String ExpYear,String CHFirstName,String CHLastName,String pStreetAddress,String pCity,String pState,String pZipCode,
			String PolicyNumber,String UsernameAdmin, String PasswordAdmin,String EmailTemplateName, String SubjectLine,String PolicyNumberRenewal,String UWReasonText,
			String StatePolicyRenewalChange,String PhonerenewalChange, String ScreenshotLink) throws Exception{
		
		
		DataSet++;
		
		//Created object of testng SoftAssert class.
		s_assert = new SoftAssert();		
		
		//If found DataToRun = "N" for data set then execution will be skipped for that data set.
		if(!TestDataToRun[DataSet].equalsIgnoreCase("Y")){
			//If DataToRun = "N", Set Testskip=true.
			Testskip=true;
			throw new SkipException("DataToRun for row number "+DataSet+" Is No Or Blank. So Skipping Its Execution.");
		}
		
		//If found DataToRun = "Y" for data set then bellow given lines will be executed.
		try
		{
			//Login Method	
			Login.LoginVerification(Username, Password);
			
			HomePage.GetANewQuote().click();
			Add_Log.info("Clicked on Get A New Quote Button");
			
			//*******************Professional Detail Screen*******************/
			String EffectiveDate1 = MyDate.todaysDate();
			MyProfessionalDetails.ProfessionalDetail( State, Profession,
					 Speciality1, county, writeYourSpecialty, Employment1,Coverage,RetroActiveDate,
					 AnticipatedGraduationMonth, AnticipatedGraduationYear,
					 Graduatedinlast5years, GraduatedinLast_Month,GraduatedinLast_Month, WorkPerWeek,  disciplinaryboardaction5Years,
					 NoOfClaims, BoardAction,EffectiveDate1);
			
			
	 			//*******************Quote Screen*******************/
	 			
				Quote.QuotePage(Employment1);
	 			
	 			
	 			//*********Policy Details***********/
				
				Thread.sleep(3000);
	 			PolicyDetails.ProfessionalDetail(Employment1,FirstName,LastName,BusinessEntity,
	 					StreetAddress,City,State2,zipCode,PhoneNo, PaymentMode1);
	 			
	 			//*******Payment Details*************/
	 			PaymentDetails.PaymentDetail(CardNumber, CVV, ExpMonth, ExpYear, CHFirstName, CHLastName,
	 										pStreetAddress, pCity, pState, pZipCode);
	 			
	 			 PaymentDetailPage.DownloadPolicyDocuments().click();
		 		  Add_Log.info("Clicked on Download Policy Documents button ");
		 		 Thread.sleep(7000);
		 		 /*try{
		 			 PaymentDetailPage.OkConfirmation().click();
			 		  Add_Log.info("Clicked on Ok in Confirmation dialauge");  
			 		 
			 		 PaymentDetailPage.DownloadPolicyDocuments().click();
			 		  Add_Log.info("Clicked on Download Policy Documents button ");
		 		 }
		 		 catch(Exception e){
		 			 System.out.println(e);
		 			 
		 		 }*/
		 		
		 		  try{
		 			 Thread.sleep(3000);
		 		 String PolicyNo = MyAccountPage.PolicyNumber().getText();
				Add_Log.info("Policy Number Captured");
				String[] splited = PolicyNo.split("\\s+");
				PolicyNumber = splited[2];
				Add_Log.info("Generated PolicyNumber - "+PolicyNumber);
				
				SuiteUtility.WriteResultUtility(FilePath, TestCaseName, "PolicyNumber", DataSet+1, PolicyNumber);
				
				
		 		  }
		 		  catch(Exception e)
		 		  {
		 			  System.out.println(e);
		 			 PolicyNumber=null;
		 			 SuiteUtility.WriteResultUtility(FilePath, TestCaseName, "PolicyNumber", DataSet+1, "Policy Not Generated");
		 		  }
		 		
				
				
				
				
				//-------------------------------------------------------------------------------------
				
	 			
				
				String DownloadPolicyPDF = MyAccountPage.DownloadPolicyPDF().getText();
				s_assert.assertEquals(DownloadPolicyPDF, "Download Policy PDF");
				if(!(DownloadPolicyPDF.equals("Download Policy PDF")))
				{
					Testfail=true;
				}

	 			
	 		    
               //*********Logout***********/
	 		    HomePage.SignoutButton().click();
	 		   Add_Log.info("Clicked on Signout Button.");
	 		   
	 		  Login.LoginVerification(UsernameAdmin, PasswordAdmin);
				Add_Log.info("Login Successful");
				
				RenewalTesting.SystemAdmin().click();
				Add_Log.info("Click System Admin Drop Down");

				for(int i =1; i<=20; i++)
				{
					
					String SystemOptions = driver.findElement(By.xpath(".//*[@class='navbar navbar-default mx-navbar mx-name-menuBar2 hidden-xs']/ul/li[5]/ul/li"+"["+i+"]")).getText();
					System.out.println(SystemOptions);
					if (SystemOptions.equals("Renewal Testing"))
					{
						System.out.println("In");
						driver.findElement(By.xpath(".//*[@class='navbar navbar-default mx-navbar mx-name-menuBar2 hidden-xs']/ul/li[5]/ul/li"+"["+i+"]/a")).click();
						Thread.sleep(2000);
						break;
					}
					
					
				}
				
		
				
				RenewalTesting.PolicyNoSearchFieldAtTraditionalRenewal().sendKeys(PolicyNumber);
				Add_Log.info("Enter the Policy Number ");
				
               RenewalTesting.SearchButtonAtTraditionalRenewal().click();
               Add_Log.info(" Click on Search Button");
              
               RenewalTesting.SelectpolicyAtTraditionalRenewal().click();
               Add_Log.info(" Select The policy");
              
               RenewalTesting.T120NotificationButton().click();
               Add_Log.info(" Send T-120 Notification ");
             
               RenewalTesting.SelectpolicyAtTraditionalRenewal().click();
               Add_Log.info(" Select The policy");
              
               RenewalTesting.T95ApprovalNotificationButton().click();
               Add_Log.info(" Send T-95 Approval Notification");
               
               HomePage.SignoutButtonAdmin().click();
               Add_Log.info(" Signout from the App");
               
               //Again login to get Renewal policy no. and Click on Looks good Button
               
 	 		  Login.LoginVerification(Username, Password);
 	 		  Add_Log.info("Login as user");
               
               try{
 		 			 Thread.sleep(3000);
 		 		 String PolicyNoRenewal = RenewalTesting.PolicyNoRenewal().getText();
 				Add_Log.info("Policy Renewal Number Captured");
 				String[] splited = PolicyNoRenewal.split("\\s+");
 				PolicyNumberRenewal = splited[2];
 				Add_Log.info("Generated PolicyNumber - "+PolicyNumberRenewal);
 				
 				SuiteUtility.WriteResultUtility(FilePath, TestCaseName, "PolicyNumberRenewal", DataSet+1, PolicyNumberRenewal);
 				
 				
 		 		  }
 		 		  catch(Exception e)
 		 		  {
 		 			  System.out.println(e);
 		 			 PolicyNumber=null;
 		 			 SuiteUtility.WriteResultUtility(FilePath, TestCaseName, "PolicyNumberRenewal", DataSet+1, "Policy Not Generated");
 		 		  }
               
               
                 RenewalTesting.MakeChanges().click();
                 Add_Log.info("Click on Make Changes Button");
                 
                 Select Sel1 = new Select(RenewalTesting.StatePolicyRenewalApplication());
                 Sel1.selectByVisibleText(StatePolicyRenewalChange);
                 Add_Log.info("Change the state");
                 
                 RenewalTesting.PhonePolicyRenewalApplication().sendKeys(PhonerenewalChange);
                 Add_Log.info("Change the Phone Number");
                 
                 JavascriptExecutor jse = (JavascriptExecutor)driver;
                 jse.executeScript("window.scrollTo(0,Math.max(document.documentElement.scrollHeight,document.body.scrollHeight,document.documentElement.clientHeight));");
                 
           Thread.sleep(2000);
                 RenewalTesting.SubmitApplicationPolicyRenewalApplication().click();
                 Add_Log.info("Click Submit application button");
                 
                 /*  RenewalTesting.SelectButtontApplicationPolicyRenewalApplication().click();
                 Add_Log.info("Select the New Quote ");
                 
                 RenewalTesting.ProceedButtontApplicationPolicyRenewalApplication().click();
                 Add_Log.info("Click on Proceed button");*/
                 
                 HomePage.SignoutButton().click();
 	 		     Add_Log.info("Clicked on Signout  Button.");
 	 		    
 	 		    //Login as Admin and Verify the mail sent to user.
 	 		    
 	 		    Login.LoginVerification(UsernameAdmin, PasswordAdmin);
 				Add_Log.info("Login Successful");

				
				RenewalTesting.OPerationsMenuBar().click();
				Add_Log.info("Click Operations Drop Down");

				for(int i =1; i<=20; i++)
				{
					
					String OperationOption = driver.findElement(By.xpath("(.//*[@class='dropdown-menu mx-navbar-submenu'])[3]/li["+i+"]/a")).getText();
					System.out.println(OperationOption);
					if (OperationOption.equals("UW Dashboard"))
					{
						System.out.println("In");
						driver.findElement(By.xpath("(.//*[@class='dropdown-menu mx-navbar-submenu'])[3]/li["+i+"]/a")).click();
						Thread.sleep(2000);
						break;
					}
					
					
				}
				
				RenewalTesting.ReferralRenewalTab().click();
				Add_Log.info("Click Referral Renewal Tab");
				
				RenewalTesting.PolicyNoReferralRenewal().sendKeys(PolicyNumber);
				Add_Log.info("Enter policy No");
				
				RenewalTesting.PolicyNoReferralRenewal().sendKeys(Keys.ENTER);
				Add_Log.info("Press Enter ");
				
				
				//RenewalTesting.SelectpolicyNoReferralRenewal().click();
				
				 Actions act = new Actions(driver);
				 act.moveToElement(driver.findElement(By.xpath("(//*[@class='table table-striped table-bordered mx-datagrid-body-table']//tbody/tr[1]/td[2]/div)[2]"))).doubleClick().build().perform();
				
				
				RenewalTesting.TextboxReferralRenewal().sendKeys(UWReasonText);
				Add_Log.info("Enter the Reason");
				
				RenewalTesting.RejectButtonUWRefferralRenwalDecision().click();
				Add_Log.info("Click reject Button");
				
				RenewalTesting.OkButtonUWRefferralRenewalDecision().click();
				Add_Log.info("Click Ok Button");
				
				HomePage.SignoutButtonAdmin().click();
				Add_Log.info("Sign out as admin");
				
				String passScreenshotPath = passscreenshot(TestCaseName, DataSet+1);
				SuiteUtility.WriteResultUtility(FilePath, TestCaseName, "ScreenShotLink", DataSet+1, passScreenshotPath);
	 			
	 		   if(Testfail)
	 			{
	 				//At last, test data assertion failure will be reported In testNG reports and It will mark your test data, test case and test suite as fail.
	 				s_assert.assertAll();		
	 			} 
	 		}
		
		catch(Exception e)
		{
			String failScreenshotPath = failScreenshot(TestCaseName, DataSet+1);
			SuiteUtility.WriteResultUtility(FilePath, TestCaseName, "ScreenShotLink", DataSet+1, failScreenshotPath);
			Testfail=true;
			driver.navigate().refresh();
			HomePage.SignoutButton().click();
			Add_Log.error(e);
			
		}
	}	

	//@AfterMethod method will be executed after execution of @Test method every time.
	@AfterMethod
	public void reporterDataResults(){		
		if(Testskip){
			//If found Testskip = true, Result will be reported as SKIP against data set line In excel sheet.
			SuiteUtility.WriteResultUtility(FilePath, TestCaseName, "Pass/Fail/Skip", DataSet+1, "SKIP");
		}
		else if(Testfail){
			
			//To make object reference null after reporting In report.
			s_assert = null;
			//Set TestCasePass = false to report test case as fail In excel sheet.
			TestCasePass=false;	
			//If found Testfail = true, Result will be reported as FAIL against data set line In excel sheet.
			SuiteUtility.WriteResultUtility(FilePath, TestCaseName, "Pass/Fail/Skip", DataSet+1, "FAIL");			
		}
		else{
			
			
			//If found Testskip = false and Testfail = false, Result will be reported as PASS against data set line In excel sheet.
			SuiteUtility.WriteResultUtility(FilePath, TestCaseName, "Pass/Fail/Skip", DataSet+1, "PASS");
		}
		//At last make both flags as false for next data set.
		Testskip=false;
		Testfail=false;
	}
	
	//This data provider method will return 4 column's data one by one In every Iteration.
	@DataProvider
	public Object[][] TestData(){
		
		//Last two columns (DataToRun and Pass/Fail/Skip) are Ignored programatically when reading test data.
		return SuiteUtility.GetTestDataUtility(FilePath, TestCaseName);
	}

	//To report result as pass or fail for test cases In TestCasesList sheet.
	@AfterTest
	public void closeBrowser(){
		//To Close the web browser at the end of test.
		//closeWebBrowser();
		if(TestCasePass){
			SuiteUtility.WriteResultUtility(FilePath, SheetName, "Pass/Fail/Skip", TestCaseName, "PASS");
		}
		else{
			SuiteUtility.WriteResultUtility(FilePath, SheetName, "Pass/Fail/Skip", TestCaseName, "FAIL");
			
		}
	}



	
	





}
