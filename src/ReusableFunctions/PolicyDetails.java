package ReusableFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.PolicyDetailPage;


public class PolicyDetails extends TestSuiteBase.SuiteBase{
	
	public static void ProfessionalDetail(String Employment1,String FirstName,String LastName,String ProfessionalDesignation,String BusinessEntity,
			String StreetAddress,String City,String State2,String zipCode,String PrimaryPhoneNumberDropDown,String PrimaryPhoneNo,String AlternatePhoneNumberDropDown,
			String AlternatePhoneNumber, String PaymentMode,String UserType) throws Exception
    {
		
		try
		{	
			tempTest = extent.startTest("Policy Detail");
		 			
				 
				 sendkeys(PolicyDetailPage.FirstName(),"User_Name", FirstName);
		 		 sendkeys(PolicyDetailPage.LastName(), "Last_Name", LastName);
		 		if(Employment1.equals("Employed")) {
	 			    sendkeys(PolicyDetailPage.ProfessionalDesignation(), "Professional Designation", ProfessionalDesignation);			 		    
	 			 }
		 		 if(Employment1.equals("Self-Employed")) {
		 		 sendkeys(PolicyDetailPage.Business_Name(), "Business_Name", BusinessEntity);
		 		 }
		 		 sendkeys( PolicyDetailPage.StreetAddress(), "Street_Address", StreetAddress);
		 		 sendkeys(PolicyDetailPage.City(), "City_Nmae", City);
		         selectDropDownbyVisibleText(PolicyDetailPage.State(), "State_name", State2);
		 		 PolicyDetailPage.State().sendKeys(Keys.TAB);		 		
	             sendkeys(PolicyDetailPage.Zip(), "Zip_Code", zipCode);
		         PolicyDetailPage.Zip().sendKeys(Keys.TAB);  
		 	    /* selectDropDownbyVisibleText(PolicyDetailPage.PrimaryPhoneNumberDropDown(), "Primary Phone Number Type selected",PrimaryPhoneNumberDropDown);
		 	     sendkeys(PolicyDetailPage.PrimaryPhoneNumberTextBox(), "Phone Number", PrimaryPhoneNo);
		 	     Thread.sleep(3000);
		 	     PolicyDetailPage.PrimaryPhoneNumberTextBox().sendKeys(Keys.TAB);
		 	     selectDropDownbyVisibleText(PolicyDetailPage.AlternatePhoneNumberDropDown(), "Alternate Phone Number Type selected",AlternatePhoneNumberDropDown);
		 	     sendkeys(PolicyDetailPage.AlternatePhoneNumberTextBox(), "Alternate Phone Number", AlternatePhoneNumber);
		 	     Thread.sleep(3000);
		 	     PolicyDetailPage.AlternatePhoneNumberTextBox().sendKeys(Keys.TAB);*/
		 	    
		 	     if(Quote.PremiumAtQuoteScreen>250.00)
		 	     {
		 			
		 				if (PaymentMode.equalsIgnoreCase("One Time Payment")) {
		 					click(PolicyDetailPage.OneTimePayment(), "One_Time_Payment");
		 		         }
		 				
		 				if (PaymentMode.equalsIgnoreCase("Installment")) {
		 					click(PolicyDetailPage.Installment(), "Installment");
		 				 }	
		 			}
		 			
		 	     if(UserType.equals("User"))
		 	     {
		 			Coordinates coordinate = ((Locatable)PolicyDetailPage.TermCondition()).getCoordinates();
		 			coordinate.inViewPort();
		 			
		 		    click(PolicyDetailPage.TCcheck(), "Click_on_I_Agree_to_the_Terms_&_Conditions_Box");
		 	     }
		 			click(PolicyDetailPage.ContinueButton(), "Click_on_Enter_Payment_Information_Button");		 		  
		 		   	 		   
		 		  test.appendChild(tempTest);

		}
		catch(Exception e)
		{
			tempTest.log(LogStatus.FAIL,  e+test.addScreenCapture(takeScreenShot()));
			test.appendChild(tempTest);

			throw (e);
		}
    
    }

	public static void ProfessionalDetail_NewUser(String Employment1,String FirstName,String LastName,String ProfessionalDesignation,String BusinessEntity,
			String StreetAddress,String City,String State2,String zipCode,String PrimaryPhoneNumberDropDown,String PrimaryPhoneNo,String AlternatePhoneNumberDropDown,
			String AlternatePhoneNumber, String PaymentMode,String UserType) throws Exception
    {
		
		try
		{	
			tempTest = extent.startTest("Policy Detail");
		 			
				 
				 sendkeys(PolicyDetailPage.FirstName(),"User_Name", FirstName);
		 		 sendkeys(PolicyDetailPage.LastName(), "Last_Name", LastName);
		 		if(Employment1.equals("Employed")) {
	 			    sendkeys(PolicyDetailPage.ProfessionalDesignation(), "Professional Designation", ProfessionalDesignation);			 		    
	 			 }
		 		 if(Employment1.equals("Self-Employed")) {
		 		 sendkeys(PolicyDetailPage.Business_Name(), "Business_Name", BusinessEntity);
		 		 }
		 		 sendkeys( PolicyDetailPage.StreetAddress(), "Street_Address", StreetAddress);
		 		 sendkeys(PolicyDetailPage.City(), "City_Nmae", City);
		         selectDropDownbyVisibleText(PolicyDetailPage.State(), "State_name", State2);
		 		 PolicyDetailPage.State().sendKeys(Keys.TAB);		 		
	             sendkeys(PolicyDetailPage.Zip(), "Zip_Code", zipCode);
		         PolicyDetailPage.Zip().sendKeys(Keys.TAB);  
		         if(UserType.equals("User"))
		         {
		         selectDropDownbyVisibleText(PolicyDetailPage.PrimaryPhoneNumberDropDown(), "Primary Phone Number Type selected",PrimaryPhoneNumberDropDown);
		 	    System.out.println(PolicyDetailPage.PrimaryPhoneNumberTextBox().getAttribute("placeholder"));
		 	    sendkeys(PolicyDetailPage.PrimaryPhoneNumberTextBox(), "Phone Number", PrimaryPhoneNo);
		 	   PolicyDetailPage.PrimaryPhoneNumberTextBox().sendKeys(PrimaryPhoneNo);
		 	     Thread.sleep(3000);
		 	    System.out.println(PolicyDetailPage.PrimaryPhoneNumberTextBox().getAttribute("placeholder"));
		 	     PolicyDetailPage.PrimaryPhoneNumberTextBox().sendKeys(Keys.TAB);
		 	     selectDropDownbyVisibleText(PolicyDetailPage.AlternatePhoneNumberDropDown(), "Alternate Phone Number Type selected",AlternatePhoneNumberDropDown);
		 	     sendkeys(PolicyDetailPage.AlternatePhoneNumberTextBox(), "Alternate Phone Number", AlternatePhoneNumber);
		 	    PolicyDetailPage.AlternatePhoneNumberTextBox().sendKeys(AlternatePhoneNumber);
		 	     Thread.sleep(3000);
		 	     PolicyDetailPage.AlternatePhoneNumberTextBox().sendKeys(Keys.TAB);
		         }
		 	    
		 	     if(Quote.PremiumAtQuoteScreen>250.00)
		 	     {
		 			
		 				if (PaymentMode.equalsIgnoreCase("One Time Payment")) {
		 					click(PolicyDetailPage.OneTimePayment(), "One_Time_Payment");
		 		         }
		 				
		 				if (PaymentMode.equalsIgnoreCase("Installment")) {
		 					click(PolicyDetailPage.Installment(), "Installment");
		 				 }	
		 			}
		 			
		 	     if(UserType.equals("User"))
		 	     {
		 			Coordinates coordinate = ((Locatable)PolicyDetailPage.TermCondition()).getCoordinates();
		 			coordinate.inViewPort();
		 			
		 		    click(PolicyDetailPage.TCcheck(), "Click_on_I_Agree_to_the_Terms_&_Conditions_Box");
		 	     }
		 			click(PolicyDetailPage.ContinueButton(), "Click_on_Enter_Payment_Information_Button");		 		  
		 		   	 		   
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