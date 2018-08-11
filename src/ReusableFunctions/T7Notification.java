package ReusableFunctions;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.HomePage;
import PageObjects.RenewalTesting;

public class T7Notification extends TestSuiteBase.SuiteBase{
	public static void SendT7Notification(String PolicyNumber) throws Exception
    {
		
		try
		{
			tempTest = extent.startTest("T-7 Notification");
			//Locate and Click on Sign In Button
			
			click(RenewalTesting.SearchButton_1T7(),"Click on Search Button To enter Policy Number");
			
			Thread.sleep(2000);
			sendkeys(RenewalTesting.PolicyNoTextBoxUnderT7(), "Policy Number", PolicyNumber);
			Thread.sleep(2000);
			click(RenewalTesting.SearchButton_2T7(), "Button to execute the search");
			Thread.sleep(3000);
			click(RenewalTesting.SelectPolicyUnderT7(), "Select Policy Number");
			Thread.sleep(2000);
			click(RenewalTesting.SendT7ButtonUnderT7(),"T-7 Notification Button");
			
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
