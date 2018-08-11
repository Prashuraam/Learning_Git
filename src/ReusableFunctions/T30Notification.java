package ReusableFunctions;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.HomePage;
import PageObjects.LoginScreen;
import PageObjects.RenewalTesting;

public class T30Notification extends TestSuiteBase.SuiteBase{
	public static void SendT30Notification(String PolicyNumber) throws Exception
    {
		
		try
		{
			tempTest = extent.startTest("T-30 Notification");
			//Locate and Click on Sign In Button
			
			click(RenewalTesting.SecondnThirdEmailNotification(),"Second and Third Renewal Email Testing Tab");
			
			click(RenewalTesting.SearchButton_1T30(),"Click on Search Button To enter Policy Number");
		
			Thread.sleep(2000);
			sendkeys(RenewalTesting.PolicyNoTextBoxUnderT30(), "Policy Number", PolicyNumber);
			Thread.sleep(2000);
			click(RenewalTesting.SearchButton_2T30(), "Button to execute the search");
			Thread.sleep(3000);
			click(RenewalTesting.SelectPolicyUnderT30(), "Select Policy Number");
			Thread.sleep(2000);
			click(RenewalTesting.SendT30ButtonUnderT30(),"T-30 Notification BUtton");
			
            
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
