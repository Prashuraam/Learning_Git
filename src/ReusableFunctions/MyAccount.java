package ReusableFunctions;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.MyAccountPage;

public class MyAccount extends TestSuiteBase.SuiteBase{
	public static void MyAccountDetails() throws Exception
    {
		
		try
		{
			tempTest = extent.startTest("My Account Details");
			//Locate and Click on Sign In Button
			MyAccountPage.PolicyNumber();
			Add_Log.info("Clicked on Sign in Button");
			
			
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
