package ReusableFunctions;

import java.io.File;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.HomePage;
import PageObjects.LoginScreen;
import PageObjects.MyAccountPage;
import TestSuiteBase.SuiteUtility;
import Utility.PDFFileLocation;

public class PolicyDocumentDownload extends TestSuiteBase.SuiteBase{
	public static void DownloadPolicyDocument(String PolicyNumber) throws Exception
    {
		
		try
		{
			tempTest = extent.startTest("Policy Document Download");
			//Locate and Click on Sign In Button
			 click(MyAccountPage.PolicyPDFDownloadButton(), "Policy Download Button");
				
	 		 try{
		 			if((!(PolicyNumber==null)))
		 			{
		 			 /*PaymentDetailPage.DownloadPolicyPDF().click();
			 		  Add_Log.info("Clicked on Download Policy PDF button ");*/
					
					Thread.sleep(2000);
					tempTest.log(LogStatus.PASS,  test.addScreenCapture(takeScreenShot()));
					
					if (Param.getProperty("testBrowser").equalsIgnoreCase("Mozilla"))
					{
					Runtime.getRuntime().exec("C:\\Workspace\\Project1\\AutoIT\\Script To Download File.exe");
					}
					if(Param.getProperty("testBrowser").equalsIgnoreCase("Chrome"))
					{
					Runtime.getRuntime().exec("C:\\Workspace\\Project1\\AutoIT\\Script To Download File chrome.exe");
					}
					
					//(System.getProperty("user.dir")+"//ExcelFiles//TestSuiteList.xlsx")
					Thread.sleep(10000);
					//File PDFFilePath = PDFFileLocation.PolicyDetailFileLocation(PolicyNumber);
					
					/* String PDFPath =  PDFFilePath.getAbsolutePath();
					 System.out.println("File Path = "+PDFPath);
					//SuiteUtility.WriteResultUtility(FilePath, TestCaseName, "PDFLink", DataSet+1, PDFPath);
*/		 		}
		 		}
		 		catch(Exception e)
		 		{
		 			  System.out.println(e);
		 		}

			test.appendChild(tempTest);
			
		}
		catch(Exception e)
		{
			tempTest.log(LogStatus.FAIL,  e+test.addScreenCapture(takeScreenShot()));
			test.appendChild(tempTest);

			throw (e);
		}

}
}
