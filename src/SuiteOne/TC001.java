// TC009 - Purchase Policy and capture the policy number
package SuiteOne;

import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.LogStatus;

import ReusableFunctions.AccountPageUserSide;
import ReusableFunctions.Login1;
import ReusableFunctions.MyDate;
import ReusableFunctions.MyProfessionalDetails;
import PageObjects.HomePage;
import PageObjects.QuotePage;
import Utility.Read_XLSX;
import TestSuiteBase.SuiteUtility;

public class TC001 extends SuiteOneBase{
	Read_XLSX FilePath = null;	
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
		
        initExtentReport(TestCaseName);
		
		//To Initialize Firefox browser.
		loadWebBrowser();
		Add_Log.info("WebBrowser is instantiated");
		driver.get(Param.getProperty("siteURL"));		
		Add_Log.info("WebBrowser is Launched");
	}
	
	//Accepts 4 column's String data In every Iteration.
	@Test(dataProvider="TestData")
	public void SuiteOneCaseTwoTest(String Username,String Password,String LaunchPassword, String State,String Profession,
			String Speciality1,String county,String writeYourSpecialty,String Employment1, String hasEmployerCoverage,
			String Coverage,String RetroActiveDate,String AnticipatedGraduationMonth,String AnticipatedGraduationYear,
			String Graduatedinlast5years,String GraduatedinLast_Month, String GraduatedinLast_Year,String WorkPerWeek,
			String disciplinaryboardaction5Years,String NoOfClaims,String BoardAction,String EffectiveDate, String IntendedOwner) throws Exception{
		
		
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
			test=extent.startTest("Save Quote by New User");
			//Login Method	
			Login1.LaunchPasswordOnly(LaunchPassword);
			click(HomePage.GetANewQuoteHomePage(),"Get a Quote Button at Home Page");
					
			
			//*******************Professional Detail Screen*******************/
			String EffectiveDate1 = MyDate.todaysDate();
			MyProfessionalDetails.ProfessionalDetail_NewUser(State, Profession, Speciality1, county, writeYourSpecialty, Employment1,
					hasEmployerCoverage, Coverage, RetroActiveDate, AnticipatedGraduationMonth, AnticipatedGraduationYear,
					Graduatedinlast5years, GraduatedinLast_Month, GraduatedinLast_Year, WorkPerWeek, disciplinaryboardaction5Years,
					NoOfClaims, BoardAction, EffectiveDate1, Username, IntendedOwner);
			
			
	 			//*******************Quote Screen*******************/
	 			
				click(QuotePage.SaveQuote(), "Save Quote Button");
				
                //**************Account Page***************
	 			
	 			AccountPageUserSide.AddAccount(Username, Username, Password, Password);
	 			
				click(QuotePage.OkConfirmation(),"Ok Button");
				click(QuotePage.ViewQuote(),"View Quote");
				String QuoteNo = QuotePage.QuoteNumber().getText();
				
				if(!(QuoteNo.isEmpty()))
						{
					      tempTest.log(LogStatus.PASS, test.addScreenCapture(takeScreenShot()));
					      tempTest.log(LogStatus.PASS,  "Quote Number is : "+QuoteNo);
						}
				else
				{
					tempTest.log(LogStatus.FAIL,  test.addScreenCapture(takeScreenShot()));
					tempTest.log(LogStatus.FAIL,  "Quote Number is null");
				}
	 			
				click(HomePage.SignoutButton(),"Sign Out");

				 extent.endTest(test);
			      extent.flush();
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
			click(HomePage.SignoutButton(),"Sign Out");
			extent.endTest(test);
		    extent.flush();
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