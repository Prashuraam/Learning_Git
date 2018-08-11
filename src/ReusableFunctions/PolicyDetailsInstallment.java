package ReusableFunctions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.PolicyDetailPage;


public class PolicyDetailsInstallment extends TestSuiteBase.SuiteBase{
	
	public static void ProfessionalDetail(String Employment1,String FirstName,String LastName,String BusinessEntity,
			String StreetAddress,String City,String State2,String zipCode,String PhoneNo,String PaymentMode) throws Exception
    {
		
		try
		{	
			 tempTest = extent.startTest("Professional Detail");
			 if(Employment1.equals("Self-Employed")){
		 			
				 PolicyDetailPage.First_Name_Selfemployed().clear();
				 sendkeys(PolicyDetailPage.First_Name_Selfemployed(), "Enter_UserName", FirstName);
				 	 			
		 			PolicyDetailPage.Last_Name_SelfEmployed().clear();
		 			sendkeys(PolicyDetailPage.Last_Name_SelfEmployed(), "Enter_Last_Name", LastName);
		 					 		    
		 			PolicyDetailPage.Business_Name().clear();
		 			sendkeys(PolicyDetailPage.Business_Name(), "Enter_Business_Name", BusinessEntity);
		 			    
		 		    PolicyDetailPage.StreetAddressSelfEmpolyed().clear();
		 		    sendkeys(PolicyDetailPage.StreetAddressSelfEmpolyed(), "Enter_Street_Name", StreetAddress);
		 		    
		 		   PolicyDetailPage.CitySelfEmpolyed().clear();
		 		   sendkeys(PolicyDetailPage.CitySelfEmpolyed(), "Enter_City_Name", City); 
		 		   sendkeys(PolicyDetailPage.StateSelfEmpolyed(), "Enter_State_Name", State2);		 			
		 			
		 			PolicyDetailPage.ZipSelfEmployed().clear();
		 			sendkeys(PolicyDetailPage.ZipSelfEmployed(), "Enter_Zio_Code", zipCode);
		 			click(PolicyDetailPage.phoneNumberSelfEmployed(), "Phone_Number_SelfEmployed");		 		
		 			//PolicyDetailPage.phoneNumberSelfEmployed().click();
		 			//PolicyDetailPage.phoneNumberSelfEmployed().clear();
		 			sendkeys(PolicyDetailPage.phoneNumberSelfEmployed(), "Phone_Number_Entered", PhoneNo);
		 			
		 			PolicyDetailPage.phoneNumberSelfEmployed().sendKeys(Keys.TAB);  
		 			

		 			try
		 			{
		 				
		 				if (PaymentMode.equalsIgnoreCase("One Time Payment")) {
		 				click(PolicyDetailPage.OneTimePayment(), "One_Time_Payment");	
		 				
		 				}
		 				
		 				if (PaymentMode.equalsIgnoreCase("Installment")) {
		 					click(PolicyDetailPage.Installment(), "Installment");
			 				
		 				}
			 				
		 				
		 			}
		 			
		 			catch(Exception e)
		 			{
		 				throw(e);
		 			}
		 		    }
		 		    
		 		    else{
		 		    	
		 		    	PolicyDetailPage.First_Name().clear();
		 		    	sendkeys(PolicyDetailPage.First_Name(), "Enter_UserName", FirstName);
		 		    				 			
			 			PolicyDetailPage.Last_Name().clear();
			 			sendkeys(PolicyDetailPage.Last_Name(), "Enter_Last_Name", LastName);
			 						 		    
			 			PolicyDetailPage.StreetAddress().clear();
			 			sendkeys(PolicyDetailPage.StreetAddress(), "Enter_Street_Adress", StreetAddress);
			 			
			 			PolicyDetailPage.City().clear();
			 		    sendkeys(PolicyDetailPage.City(), "Enter_City_Name", City);
			 			sendkeys(PolicyDetailPage.State(), "Enter_State_Name", State2);			 			
			 						 		
			 		 	PolicyDetailPage.Zip().clear();
			 		 	
			 		 	sendkeys(PolicyDetailPage.Zip(), "Enter_Zip_Code", zipCode);
			 		 	sendkeys(PolicyDetailPage.phoneNumber(), "Enter_Phone_Number", PhoneNo); 			
			 					
			 			PolicyDetailPage.phoneNumber().sendKeys(Keys.TAB);
			 			click(PolicyDetailPage.installment(), "Click_on_Installment_Section");
			 				
		 			    }
		 		
			
		 			
		 			Coordinates coordinate = ((Locatable)PolicyDetailPage.TermCondition()).getCoordinates();
		 			coordinate.inViewPort();
		 		    click(PolicyDetailPage.TCcheck(), "Click_on_I_Agree_To_The_Terms_&_Conditions_Check_Box");
		 			click(PolicyDetailPage.PaymentInfo(), "Click_on_Enter_Payment_Information_Button");		 		  
		 		   		 		   
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
