package ReusableFunctions;

import org.openqa.selenium.Keys;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.PolicyDetailPage;

public class CertificateOfInsurance extends TestSuiteBase.SuiteBase{
	public static void GenerateCertificateOfInsuranceFromUserSide(String UserType,String PolicyNumber,String FirstName, String StreetAddress, String City,
			String State2,String zipCode) throws Exception
    {
		
		try
		{
			tempTest = extent.startTest("Certificate of Insurance");
			//Locate and Click on Sign In Button
			
			 click(PolicyDetailPage.GenerateCertificateButton(), "Generate Certificate of Insurance");
	 		 
	 		 if (UserType.equals("User"))
	 		 {
	 			selectDropDownbyVisibleText(PolicyDetailPage.SelectPolicyNumberDropDown_COI(), "Policy Number", PolicyNumber);
	 		 }
	 		 
	 		 sendkeys(PolicyDetailPage.RecipientsFullName_COI(), "Recipient Full Name", FirstName);
	 		 sendkeys(PolicyDetailPage.StreetAddress_COI(), "Street Address", StreetAddress);
	 		 sendkeys(PolicyDetailPage.City_COI(), "City", City); 
	 		 selectDropDownbyVisibleText(PolicyDetailPage.State_COI(), "State", State2);
	 		 sendkeys(PolicyDetailPage.Zip_COI(), "Zip Code", zipCode); 
	 		PolicyDetailPage.Zip_COI().sendKeys(Keys.TAB);
	 		Thread.sleep(2000);
	 		 click(PolicyDetailPage.DownloadYourCertificateButton_COI(), "Download Certificate Button");

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
