package ReusableFunctions;

import org.openqa.selenium.Keys;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.HomePage;
import PageObjects.RenewalTesting;

public class T0AndPaymentNotification extends TestSuiteBase.SuiteBase{
	public static void SendT0AndPaymentNotification(String PolicyNumber,String PolicyNumberRenewal) throws Exception
    {
		
		try
		{
			tempTest = extent.startTest("T-0 and Payment Notification");
			//Locate and Click on Sign In Button
			Thread.sleep(2000);
			click(RenewalTesting.TraditionalTab(), "Traditional Tab");
			Thread.sleep(2000);
			sendkeys(RenewalTesting.PolicyNoSearchFieldAtTraditionalRenewal(), "Policy Number", PolicyNumber);
			
			RenewalTesting.PolicyNoSearchFieldAtTraditionalRenewal().sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			click(RenewalTesting.SelectpolicyAtTraditionalRenewal(), "Select Policy at Row");
			Thread.sleep(2000);
			click(RenewalTesting.T0NotificationBlueButton(), "T-0 Blue Button");
			Thread.sleep(3000);
			click(RenewalTesting.SelectpolicyAtTraditionalRenewal(), "Select Policy at Row");
			Thread.sleep(3000);
			click(RenewalTesting.T0NotificationGreenButton(), "T-0 Green Button");
			Thread.sleep(10000);
			click(RenewalTesting.PaymentTab(), "Payment Tab");
			Thread.sleep(3000);
			sendkeys(RenewalTesting.PolicyNumberTextBox_PaymentTab(), "Policy Number at Payment", PolicyNumberRenewal);
			click(RenewalTesting.SearchButton2_PaymentTab(), "Search Button");
			Thread.sleep(3000);
			click(RenewalTesting.SelectPolicyAtRow_PaymentTab(), "Select Policy at Payment Row");
			Thread.sleep(3000);
			click(RenewalTesting.BillForIncrementalButton_PaymentTab(), "Bill payment Button");
			
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
