package ReusableFunctions;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.PaymentDetailPage;
public class PaymentDetails extends TestSuiteBase.SuiteBase{
	
	public static void PaymentDetail(String CardNo,String CVV,String ExpiryDate,String CHFirstName,
			String CHLastName,String StreetAddress,String City,String State,String ZipCode) throws Exception
    {
		
		try
		{
			tempTest = extent.startTest("Payment Detail");
			Thread.sleep(1000);
			
			sendkeys(PaymentDetailPage.CardNo(), "Card_Number", CardNo);
			sendkeys(PaymentDetailPage.CVV(), "Cvv_Number", CVV); 
	 		sendkeys(PaymentDetailPage.ExpiryDate(), "Expiration_Date", ExpiryDate);	 		   
	 	    sendkeys(PaymentDetailPage.CHFirstName(), "Card_Holder_First_Name", CHFirstName); 
	 		sendkeys(PaymentDetailPage.CHLastName(), "Card_Holder_Last_Name", CHLastName);
	 		sendkeys(PaymentDetailPage.StreetAddress(), "Street_Address", StreetAddress);
	 		sendkeys(PaymentDetailPage.City(), "City_Name", City);
	 		selectDropDownbyVisibleText(PaymentDetailPage.State(), "State_Name", State);
	 		sendkeys(PaymentDetailPage.ZipCode(), "ZipCode", ZipCode);
	 		click(PaymentDetailPage.BuyPolicyButton(), "Click_on_Buy_policy");
	 		click(PaymentDetailPage.BuyPolicyAlertButton(), "Click_on_Buy_Policy_in_Alert_Button");
	 		   		  
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
