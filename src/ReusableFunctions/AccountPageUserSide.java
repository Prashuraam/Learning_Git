package ReusableFunctions;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.AccountPageUserSideScreen;

public class AccountPageUserSide extends TestSuiteBase.SuiteBase {
	
	
	
	
	
	public static void AddAccount(String EmailIDAccountPage,String ConfirmEmailIDAccountPage, String PasswordAccountPage, 
			String ConfirmPasswordAccountPage) throws Exception
    {
		
		try
		{
			tempTest = extent.startTest("Account Page");
			Thread.sleep(3000);
			sendkeys(AccountPageUserSideScreen.EmailIDAccountPage(), "Email Id", EmailIDAccountPage);
			Thread.sleep(2000);
			sendkeys(AccountPageUserSideScreen.ConfirmEmailIDAccountPage(), "Confirm Email Id",ConfirmEmailIDAccountPage);
			Thread.sleep(2000);
			sendkeys(AccountPageUserSideScreen.PasswordAccountPage(), "Password", PasswordAccountPage);
			Thread.sleep(2000);
			sendkeys(AccountPageUserSideScreen.ConfirmPasswordAccountPage(), "Confirm Password", ConfirmPasswordAccountPage);
			Thread.sleep(2000);
			click(AccountPageUserSideScreen.CreateAccountButton(), "Create Account Button.");
			
			
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
