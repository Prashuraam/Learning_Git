package ReusableFunctions;

import org.openqa.selenium.Keys;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.AccountPageAdminSideScreen;

public class AccountPageAdminSide extends TestSuiteBase.SuiteBase {
	
	
	
	
	
	public static void AddAccount(String EmailIDAccountPage,String ConfirmEmailIDAccountPage, String FirstName, String LastName,
			String PrimaryPhoneNumberDropDown, String PrimaryPhNumberTexBox, String AlternatePhoneNumberDropDown, 
			String AlternatePhoneNumberTexBox) throws Exception
    {
		
		try
		{
			tempTest = extent.startTest("Account Page");
			
			sendkeys(AccountPageAdminSideScreen.EmailIDAccountPage(), "Email Id", EmailIDAccountPage);
			sendkeys(AccountPageAdminSideScreen.ConfirmEmailIDAccountPage(), "Confirm Email Id",ConfirmEmailIDAccountPage);
			sendkeys(AccountPageAdminSideScreen.FirstName(), "First Name", FirstName);
			sendkeys(AccountPageAdminSideScreen.LastName(), "Last Name", LastName);
			Thread.sleep(2000);
			 selectDropDownbyVisibleText(AccountPageAdminSideScreen.PrimaryPhoneNumberDropDown(), "Primary Phone Number Type selected",PrimaryPhoneNumberDropDown);
	 	     sendkeys(AccountPageAdminSideScreen.PrimaryPhoneNumberTextBox(), "Phone Number", PrimaryPhNumberTexBox);
	 	     Thread.sleep(3000);
	 	    AccountPageAdminSideScreen.PrimaryPhoneNumberTextBox().sendKeys(Keys.TAB);
	 	     selectDropDownbyVisibleText(AccountPageAdminSideScreen.AlternatePhoneNumberDropDown(), "Alternate Phone Number Type selected",AlternatePhoneNumberDropDown);
	 	     sendkeys(AccountPageAdminSideScreen.AlternatePhoneNumberTextBox(), "Alternate Phone Number", AlternatePhoneNumberTexBox);
	 	     Thread.sleep(3000);
	 	    AccountPageAdminSideScreen.AlternatePhoneNumberTextBox().sendKeys(Keys.TAB);
			
			click(AccountPageAdminSideScreen.AccountPageCreateUsersAccountAdminSideButton(), "Continue Button.");
			
			
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
