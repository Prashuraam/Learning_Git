package ReusableFunctions;

import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.ProfessionalDetailsPage;


public class ProfessionalDetailsCSR extends TestSuiteBase.SuiteBase{
	public static void ProfessionalDetail(String State,String Profession,
			String Speciality1,String county,String writeYourSpecialty,String Employment1,String Coverage_Type,String RetroActiveDate,
			String AnticipatedGraduationMonth,String AnticipatedGraduationYear,
			String Graduatedinlast5years,String WorkPerWeek, String disciplinaryboardaction5Years,
			String NoOfClaims,String BoardAction, String EffectiveDate1) throws Exception
    {
		
		try
		{
			tempTest = extent.startTest("Professional Detail");
			 //Select State ---------------------********************************************---------------------------------
			selectDropDownbyVisibleText(ProfessionalDetailsPage.State(), "State_Selection", State);
			 			
 			//Select profession ---------------------********************************************---------------------------------
			selectDropDownbyVisibleText(ProfessionalDetailsPage.Profession(), "Profession_Selection", Profession);
			
 			//Select specialty ---------------------********************************************---------------------------------
	 		if ((!Profession.equals("Optometry")) || (!Profession.equals("Nurse Anesthetist (CRNA)"))) 
	 		{
	 				
	 			selectDropDownbyVisibleText(ProfessionalDetailsPage.Speciality(), "Speciality_Selection_From_DropDown", Speciality1);
	 			
	 		}
	 		//Select County- In which county do you predominantly practice or attend school? ---------------------
	 		if( (State.equals("FL")) && ( (Profession.equals("Nurse Anesthetist (CRNA)")) || (Profession.equals("Optometry")) || (Profession.equals("Physician Assistant"))  ) )
 			{
	 			selectDropDownbyVisibleText(ProfessionalDetailsPage.county(), "Country_Selection", county);
	 			 				
 			}
	 		if( (State.equals("IL")  && ((Profession.equals("Nurse Anesthetist (CRNA)")) || (Profession.equals("Nurse Practitioner")) || (Profession.equals("Optometry"))    ) ))
 			{
 				selectDropDownbyVisibleText(ProfessionalDetailsPage.county(), "Country_Selection", county);
	 			
 			}
	 		
	 		
	 		if((Profession.equals("Other Healthcare Profession not listed")) && (Speciality1.equals("All Other Allied Health Professional")))
	 		{
	 			sendkeys(ProfessionalDetailsPage.writeYourSpecialty(), "Your_Speciality", writeYourSpecialty);
	 			
	 		}

	 	  //Please select your employment status:--------********************************************--------------------------------
	 		selectDropDownbyVisibleText(ProfessionalDetailsPage.Employment(), "Employment_Selection", Employment1);
	 		
	 		  
	 		  	if (Employment1.equals("Student"))
	 		{
	 		  	
	 			selectDropDownbyVisibleText(ProfessionalDetailsPage.AnticipatedGradMonth(), "Anticipated_Graduation_Month", AnticipatedGraduationMonth);
	 		  	sendkeys(ProfessionalDetailsPage.AnticipatedGradYear(), "Anticipated_Graduation_Year", AnticipatedGraduationYear);		 			
	 			
	 		}
	 //Please select the type of coverage you would like:Occurrence/Claims Made
	 		  	if (!Employment1.equals("Student"))
	 			{
	 		  		if((Profession.equals("Nurse Practitioner")) || (Profession.equals("Nurse Anesthetist (CRNA)"))  || (Profession.equals("Physician Assistant")) ||
		 		  			(Profession.equals("Psychology and Mental Health")) || (Profession.equals("Nuclear Medicine Professionals")) ||
		 		  			(Profession.equals("Physical and Occupational Therapist")) || (Profession.equals("Social Work")) )
	 		  		{
	 		  			if(State.equals("IL"))
	 		  					{
	 		  			 if (Coverage_Type.equals("Occurrence"))
	 					 {
	 			         click(ProfessionalDetailsPage.CoverageType_Occurrence(), "Select_Occurance_As_Coverage_Type");
	 		  				
	 				     }	
	 		  			 if(Coverage_Type.equals("Claims Made"))
	 					 {
	 		  				click(ProfessionalDetailsPage.CoverageType_ClaimsMade(), "Select_Claim_Made_As_Coverage_Type");
	 		  				 
	 		  				sendkeys(ProfessionalDetailsPage.RetroActiveDate(), "Retro_Active_Date", RetroActiveDate);
	 		  				
	 					 }
	 		  					}
	 		  		}
	 			}
	 		  	
	 		  	
	 	//Did you graduate from school in the past five (5) years?
	 	if (!Employment1.equals("Student"))
		{
	 		  		if((Profession.equals("Nurse Practitioner")) || (Profession.equals("Nurse Anesthetist (CRNA)"))  || (Profession.equals("Physician Assistant")) ||
	 		  			(Profession.equals("Optometry")) || (Profession.equals("Psychology and Mental Health")) || (Profession.equals("Nuclear Medicine Professionals")))
	 		 		{
	 		  		if (Graduatedinlast5years.equals("No"))
		        	 {
		        	   click(ProfessionalDetailsPage.Graduated_InPast_5Years_No(), "Select_Graduation_in_5Years_As_No:");
	 		  				
		        	 }	

	        	     if (Graduatedinlast5years.equals("Yes"))    
	        	     {
	        	    	 click(ProfessionalDetailsPage.Graduated_InPast_5Years_Yes(), "Select_Graduation_in_5Years_As_Yes:");
	        	    	 sendkeys(ProfessionalDetailsPage.Graduated_5years_Month(), "Selection_Of_Recency_Month", AnticipatedGraduationMonth);
	        	    	 sendkeys(ProfessionalDetailsPage.Graduated_5years_Year(), "Enter_Recency_Year", AnticipatedGraduationYear);	
	 			         	
	 			      }
	 		 		} 
		        		 		 		
		 	}
	 	//In total, how many hours do you work per week?
	 	if (!Employment1.equals("Student"))
		{
	 		  		if((Profession.equals("Nurse Practitioner")) || (Profession.equals("Nurse Anesthetist (CRNA)"))  || (Profession.equals("Physician Assistant")) ||
	 		  			(Profession.equals("Optometry")) || (Profession.equals("Psychology and Mental Health")) || (Profession.equals("Nuclear Medicine Professionals")))
	 		 		{
	 		  			ProfessionalDetailsPage.workperweek().clear();
		 				sendkeys(ProfessionalDetailsPage.workperweek(), "Workdone_Per_Week", WorkPerWeek);
	 		  			
	 		 		} 
		        		 		 		
		 	}		
	 	//Have you been subject to a medical malpractice claim or disciplinary board action within the last 5 years?
	 	if (!Employment1.equals("Student"))
		{
	 		  		if((Profession.equals("Nurse Practitioner")) || (Profession.equals("Nurse Anesthetist (CRNA)"))  || (Profession.equals("Physician Assistant")) ||
	 		  			(Profession.equals("Optometry")) || (Profession.equals("Psychology and Mental Health")) || (Profession.equals("Nuclear Medicine Professionals")) ||
	 		  			(Profession.equals("Nursing (RN, LPN, LVN)"))|| (Profession.equals("Physical and Occupational Therapist")) || (Profession.equals("Social Work")) ||
	 		  			(Profession.equals("Audiology, Speech and Hearing")) || (Profession.equals("Other Healthcare Profession not listed")))
	 		 		{
	 		  		 if (disciplinaryboardaction5Years.equals("Yes"))
	 		 			  
		 		       {
	 		  			 	click(ProfessionalDetailsPage.MalPractice_Yes(), "MalPractice_As_Yes:");
	 		  			 	selectDropDownbyVisibleText(ProfessionalDetailsPage.NoOfClaims(), "Select_No_Of_Claims", NoOfClaims);
	 		  			 	
		 		       }
		 		  
		 		      if (disciplinaryboardaction5Years.equals("No"))
		 		       {
		 			    click(ProfessionalDetailsPage.MalPractice_No(), "MalPractice_As_No:");
		 		    	  	
		 			    }
		 		  } 
		        		 		 		
		 	}	
	 //Have you been subject to any Board Actions?
	 	if (!Employment1.equals("Student"))
		{
	 		if((Profession.equals("Nurse Practitioner")) || (Profession.equals("Nurse Anesthetist (CRNA)"))  || (Profession.equals("Physician Assistant")) ||
 		  			(Profession.equals("Optometry")) || (Profession.equals("Psychology and Mental Health")) || (Profession.equals("Nuclear Medicine Professionals")) ||
 		  			(Profession.equals("Nursing (RN, LPN, LVN)"))|| (Profession.equals("Physical and Occupational Therapist")) || (Profession.equals("Social Work")) ||
 		  			(Profession.equals("Audiology, Speech and Hearing")) || (Profession.equals("Other Healthcare Profession not listed")))
	 		 		{
	 		  		 if (BoardAction.equals("Yes"))
	 		 		  {
	 		 		         if (BoardAction.equals("Yes"))
	 		 		        {
	 		 	               
	 		 		        	 click(ProfessionalDetailsPage.BoardAction_Yes(), "Select_BoardAction_As_Yes:");
	 		 		        	 
	 		 			     }
	 		 		  
	 		 		        if (BoardAction.equals("No"))
	 		 		          {
	 		 			       click(ProfessionalDetailsPage.BoardAction_No(), "Select_BoardAction_As_No:");
	 		 		        	
	 			 			  }
	 		 		  }
	 		 		} 
		        		 		 		
		 	}	
	 	
	 		  //-----------------Effective Date-------
	 		
	 	sendkeys(ProfessionalDetailsPage.EffectiveDate(), "Enter_Effective_Date", EffectiveDate1);	 
	 	       
	 		 click(ProfessionalDetailsPage.NextStepButtonCSR(), "Click_on_Get_My_Quote_Button");
	 		
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
