package ReusableFunctions;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.HomePage;
import PageObjects.RenewalTesting;

public class T120AndT95Notification extends TestSuiteBase.SuiteBase{
	public static void SendT120AndT30Notification(String PolicyNumber) throws Exception
    {
		
		try
		{
			tempTest = extent.startTest("Send T-120 and T-95 Notification");
			//Locate and Click on Sign In Button
			
			//***********************Before T-120*************///
			sendkeys(RenewalTesting.PolicyNoSearchFieldAtTraditionalRenewal(),"Policy Number",PolicyNumber);
			
            click(RenewalTesting.SearchButtonAtTraditionalRenewal(),"Search button");
         
            Thread.sleep(10000);
            click(RenewalTesting.SelectpolicyAtTraditionalRenewal(),"Policy No to Renew");
            Thread.sleep(3000);
            clickJSE(RenewalTesting.T120NotificationButton(),"T-120 Blue Button");
            Thread.sleep(3000);
            click(RenewalTesting.SelectpolicyAtTraditionalRenewal(),"Policy No to Renew");
            Thread.sleep(3000);
            clickJSE(RenewalTesting.Phase1NotificationGreenButton(),"Phase 1 Green Button");
            
          /*  String Before120Phase1Date_String = driver.findElement(By.xpath("//*[text()='Phase1 Date']//following::tr[1]/td[6]/div")).getText();
            
            Date Before120Phase1Date=new SimpleDateFormat("dd/MM/yyyy").parse(Before120Phase1Date_String); 
            System.out.println(Before120Phase1Date_String);*/
            
          //***********************After T-120*************/// 
           /* Thread.sleep(3000);
            String After120Phase1Date_ExpirationDate = driver.findElement(By.xpath("//*[text()='Phase1 Date']//following::tr[1]/td[8]/div")).getText();
            
            Date After120Phase1Date=new SimpleDateFormat("dd/MM/yyyy").parse(After120Phase1Date_ExpirationDate);
            System.out.println(After120Phase1Date_ExpirationDate);
            
            long difference = (Before120Phase1Date.getTime()-After120Phase1Date.getTime());
          
            float NoOfDaysBeforeAndAfterT120 = (difference / (1000*60*60*24));
            
            tempTest.log(LogStatus.PASS,  "Expiratio date - T-120 Date  : "+NoOfDaysBeforeAndAfterT120);*/
            
            //********************T-95***************
            Thread.sleep(5000);
            clickJSE(RenewalTesting.SelectpolicyAtTraditionalRenewal(),"Policy No to Renew");
            Thread.sleep(3000);
            clickJSE(RenewalTesting.T95ApprovalNotificationButton(),"T-95 Approve Button");
            Thread.sleep(5000);
            clickJSE(RenewalTesting.SelectpolicyAtTraditionalRenewal(),"Policy No to Renew");
            Thread.sleep(3000);
            clickJSE(RenewalTesting.T95ApprovalNotificationGreenButton(),"T-95 Approve Button");
            Thread.sleep(3000);
            clickJSE(HomePage.SignoutButton(),"Sign Out");
            
            
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
