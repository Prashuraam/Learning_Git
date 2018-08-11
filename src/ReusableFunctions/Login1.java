package ReusableFunctions;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.LoginScreen;

public class Login1 extends TestSuiteBase.SuiteBase{
	public static void LoginFunction(String Username,String Password) throws Exception
    {
		
		try
		{
			tempTest = extent.startTest("Login Function");
			LoginScreen.UserNameTextBox().sendKeys(Username);
			
			LoginScreen.PasswordTextBox().sendKeys(Password);
			
			LoginScreen.LoginButton().click();	
			test.appendChild(tempTest);
		}
		catch(Exception e)
		{
			tempTest.log(LogStatus.FAIL,  e+test.addScreenCapture(takeScreenShot()));
			test.appendChild(tempTest);

			throw (e);
		}

}
	
	
	
	public static void LoginFunctionWithLaunchPassword(String Username,String Password, String LaunchPassword) throws Exception
    {
		
		try
		{
			tempTest = extent.startTest("Login Function");
			
			if(LoginScreen.LaunchPassword()!= null)
			{
			sendkeys(LoginScreen.LaunchPassword(), "Launch Password", LaunchPassword);
			
			Thread.sleep(2000);
			
			click(LoginScreen.LaunchSubmitButton(), "Submt button");
			
			}
			
			click(LoginScreen.SignInButton(), "SignIn button");
			
			sendkeys(LoginScreen.UserNameTextBox(), "User Name", Username);
			
			sendkeys(LoginScreen.PasswordTextBox(), "Password", Password);
			
			click(LoginScreen.LoginButton(), "Signn Button");
			test.appendChild(tempTest);
			
		}
		catch(Exception e)
		{
			tempTest.log(LogStatus.FAIL,  e+test.addScreenCapture(takeScreenShot()));
			test.appendChild(tempTest);

			throw(e);
		}
}
	
	public static void LaunchPasswordOnly(String LaunchPassword) throws Exception
    {
		
		try
		{
			tempTest = extent.startTest("Launch Password Only");
			
			if(LoginScreen.LaunchPassword()!= null)
			{
			sendkeys(LoginScreen.LaunchPassword(), "Launch Password", LaunchPassword);
			
			Thread.sleep(2000);
			
			click(LoginScreen.LaunchSubmitButton(), "Submt button");
			
			}
			
			
			test.appendChild(tempTest);
			
		}
		catch(Exception e)
		{
			tempTest.log(LogStatus.FAIL,  e+test.addScreenCapture(takeScreenShot()));
			test.appendChild(tempTest);

			throw(e);
		}
}
}
