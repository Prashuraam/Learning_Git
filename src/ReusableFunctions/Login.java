package ReusableFunctions;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.HomePage;
import PageObjects.LoginScreen;

public class Login extends TestSuiteBase.SuiteBase{
	public static void LoginVerification(String Username,String Password) throws Exception
    {
		
		try
		{
			tempTest = extent.startTest("Login Verification");
			//Locate and Click on Sign In Button
			
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

			throw (e);
		}

}
}
