package ReusableFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.RenewalTesting;

public class EmailVerifcationAsAdmin extends TestSuiteBase.SuiteBase{
	public static void VerifyEmail(String AdminUsername,String AdminPassword, String LaunchPassword, String SubjectLine
			, String PolicyNumberRenewal ) throws Exception
    {
		
		try
		{
			tempTest = extent.startTest("Email Verificatiion");
			//Locate and Click on Sign In Button
			
			//Login as Admin and Verify the mail sent to user.
 		    
           // Login1.LoginFunctionWithLaunchPassword(AdminUsername, AdminPassword, LaunchPassword);
Thread.sleep(7000);
			 click(RenewalTesting.SystemAdmin(),"System Admin Drop Down");
		

			for(int i =1; i<=20; i++)
			{
				
				String SystemOptions = driver.findElement(By.xpath("(//*[contains(text(),'System Admin')])[2]//following::li"+"["+i+"]")).getText();
				System.out.println(SystemOptions);
				if (SystemOptions.equals("Email Management"))
				{
					System.out.println("In");
				  click(driver.findElement(By.xpath("(//*[contains(text(),'System Admin')])[2]//following::li"+"["+i+"]/a")),"Email Template");
					Thread.sleep(2000);
					break;
				}
				
				
			}
			Thread.sleep(5000);
			click(RenewalTesting.AdministrativeTaskTab(),"Adminstrative Task Tab");
			
			Thread.sleep(2000);
			click(RenewalTesting.ScheduledEventSendQueuedEmails(),"Scheduled event Button");
			
			Thread.sleep(3000);
			
			click(RenewalTesting.SentTab(),"Sent Tab");
			
			Thread.sleep(2000);
			sendkeys(RenewalTesting.SubjectSentTab(),"Subject Line",SubjectLine);
			
			Thread.sleep(2000);
			sendkeys(RenewalTesting.PolicyNoSentTab(),"Policy Number",PolicyNumberRenewal);
			
			
			RenewalTesting.PolicyNoSentTab().sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			
			String TemplateSubjectName = RenewalTesting.SubjectNameInSentTab().getText();
			tempTest.log(LogStatus.PASS,  "Template Subject Name :"+TemplateSubjectName);
			
			if((TemplateSubjectName.contains(SubjectLine)))
			{
				//SuiteUtility.WriteResultUtility(FilePath, TestCaseName, "EmailTemplateNameCaptured", DataSet+1, TemplateSubjectName);
				tempTest.log(LogStatus.PASS,  test.addScreenCapture(takeScreenShot()));
			System.out.println("in");
			}
		   
			else{
				tempTest.log(LogStatus.FAIL,  test.addScreenCapture(takeScreenShot()));
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
