package ReusableFunctions;

import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.HomePage;
import PageObjects.ProfessionalDetailsPage;


public class MyProfessionalDetails extends TestSuiteBase.SuiteBase{
	public static void ProfessionalDetail(String State,String Profession,
			String Speciality1,String county,String writeYourSpecialty,String Employment1,String hasEmployerCoverage,String Coverage_Type,String RetroActiveDate,
			String AnticipatedGraduationMonth,String AnticipatedGraduationYear,
			String Graduatedinlast5years, String GraduatedinLast_Month, String GraduatedinLast_Year, String WorkPerWeek, String disciplinaryboardaction5Years,
			String NoOfClaims,String BoardAction, String EffectiveDate1,String IntendedOwner) throws Exception
    {
		
		try
		{
			tempTest = extent.startTest("Professional Detail");
			
			//Select Prod 1 
			HomePage.SelectProd1().click();
			Add_Log.info("Select Prod 1");	
			
			 //Select State ---------------------********************************************---------------------------------
			selectDropDownbyVisibleText(ProfessionalDetailsPage.State(), "Practice State", State);
			
 			
 			//Select profession ---------------------********************************************---------------------------------
			selectDropDownbyVisibleText(ProfessionalDetailsPage.Profession(), "Field_Of_Profession",Profession);
			
			
 			//Select specialty ---------------------********************************************---------------------------------
	 		if (  (!Profession.equals("Optometry")) && (!Profession.equals("Nurse Anesthetist (CRNA)")) )
	 		{
	 			selectDropDownbyVisibleText(ProfessionalDetailsPage.Speciality(), "Area_Of_Speciality", Speciality1);
	 			 			

	 		}
	 		//Select County- In which county do you predominantly practice or attend school? ---------------------
	 		if( ((State.equals("FL")) && (State.equals("CA"))) && ( (Profession.equals("Nurse Anesthetist (CRNA)")) || (Profession.equals("Optometry")) || (Profession.equals("Physician Assistant"))  ) )
 			{
	 			selectDropDownbyVisibleText(ProfessionalDetailsPage.county(), " Predominantly_Practice_or_Attend_school", county);
	 			
	 						
 			}
	 		if( (State.equals("IL")  && ((Profession.equals("Nurse Anesthetist (CRNA)")) || (Profession.equals("Nurse Practitioner")) || (Profession.equals("Optometry"))    ) ))
 			{
 				selectDropDownbyVisibleText(ProfessionalDetailsPage.county(), "Country_Selection", county);
	 			
 			}
	 		
	 		
	 		
	 		if((Profession.equals("Other Healthcare Profession not listed")) && (Speciality1.equals("All Other Allied Health Professional")))
	 		{
	 			sendkeys(ProfessionalDetailsPage.writeYourSpecialty(), "Write_Your_Speciality", writeYourSpecialty);
	 			
	 			
	 		}

	 	  //Please select your employment status:--------********************************************--------------------------------
	 		selectDropDownbyVisibleText(ProfessionalDetailsPage.Employment(), "Employment_Status", Employment1);
	 		
	 		 		  
	 		  	if (Employment1.equals("Student"))
	 		{
	 		  	sendkeys(ProfessionalDetailsPage.SchoolName(), "Enter_the_School_name", "School");
	 		  	
	 		  	selectDropDownbyVisibleText(ProfessionalDetailsPage.AnticipatedGradMonth(), "Anticipated_Month", AnticipatedGraduationMonth);
	 				 			
	 			sendkeys(ProfessionalDetailsPage.AnticipatedGradYear(), "Anticipated_Year", AnticipatedGraduationYear);
	 		  	
	 		}
	 		  	
	 		  	
	 		  	
	 		  	
	 		  	if(Employment1.equals("Employed"))
		 		{
		 		
		 			
		 			if(hasEmployerCoverage.equals("No"))
		 			{
		 			ProfessionalDetailsPage.No_EmployerCoverage().click();
		 			}
		 			
		 			if(hasEmployerCoverage.equals("Yes"))
		 			{
		 			ProfessionalDetailsPage.Yes_EmployerCoverage().click();
		 			}
		 		}
		 		
	 		  	
	 //Please select the type of coverage you would like:Occurrence/Claims Made
	 		  	if (!Employment1.equals("Student"))
	 			{
	 		  		if((Profession.equals("Nurse Practitioner")) || (Profession.equals("Nurse Anesthetist (CRNA)"))  || (Profession.equals("Physician Assistant")) ||
		 		  			(Profession.equals("Psychology and Mental Health")) || (Profession.equals("Nuclear Medicine Professionals")) ||
		 		  			(Profession.equals("Physical and Occupational Therapist")) || (Profession.equals("Social Work")) )
	 		  		{
	 		  			//if(State.equals("IL"))
	 		  					{
	 		  			 if (Coverage_Type.equals("Occurrence"))
	 					 {
	 			         click(ProfessionalDetailsPage.CoverageType_Occurrence(), "Occurance_as_Coverage_Type");
	 		  			
	 				     }	
	 		  			 if(Coverage_Type.equals("Claims Made"))
	 					 {
	 		  				click(ProfessionalDetailsPage.CoverageType_ClaimsMade(), "Claims_Made_as_Coverage_Type");
	 		  				
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
		        	   click(ProfessionalDetailsPage.Graduated_InPast_5Years_No(), "Select_Graduation_in_Last_5Years_as_No:");
	 		  			
		        	 }	

	        	     if (Graduatedinlast5years.equals("Yes"))    
	        	     {
	        	    	click(ProfessionalDetailsPage.Graduated_InPast_5Years_Yes(), "Select_Graduation_in_Last_5Years_as_Yes:"); 
	        	    	
	        	    	 selectDropDownbyVisibleText( ProfessionalDetailsPage.Graduated_5years_Month(), "Select_Recency_Month", GraduatedinLast_Month);
	        	    	 sendkeys(ProfessionalDetailsPage.Graduated_5years_Year(), "Recency_Year", GraduatedinLast_Year);	
	 			         
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
		 				sendkeys(ProfessionalDetailsPage.workperweek(), "Work_Per_Week", WorkPerWeek);
	 		  			
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
	 		  			 	click(ProfessionalDetailsPage.MalPractice_Yes(), "MalPractice_as_Yes");
	 		  			    selectDropDownbyVisibleText(ProfessionalDetailsPage.NoOfClaims(), "No_of_Claims", NoOfClaims);
	 		  			 	
	 		  			    //Have you been subject to any Board Actions?
	 		  			  if (BoardAction.equalsIgnoreCase("Yes"))
	 		 		        {
	 		 	              click(ProfessionalDetailsPage.BoardAction_Yes(), "BoardActions_as_Yes"); 
	 		  				  
	 		 			     }
	 		 		  
	 		 		        if (BoardAction.equalsIgnoreCase("No"))
	 		 		          {
	 		 		        	
	 		 			      click(ProfessionalDetailsPage.BoardAction_No(), "BoardActions_as_No");
	 		 		        	
	 			 			  }
		 		       }
		 		  
		 		      if (disciplinaryboardaction5Years.equalsIgnoreCase("No"))
		 		       {
		 			    click(ProfessionalDetailsPage.MalPractice_No(), "MalPractice_as_No");
		 		    	  	
		 			    }
		 		  } 
		        		 		 		
		 	}	
	 /*//Have you been subject to any Board Actions?
	 	if (!Employment1.equals("Student"))
		{
	 		if((Profession.equals("Nurse Practitioner")) || (Profession.equals("Nurse Anesthetist (CRNA)"))  || (Profession.equals("Physician Assistant")) ||
 		  			(Profession.equals("Optometry")) || (Profession.equals("Psychology and Mental Health")) || (Profession.equals("Nuclear Medicine Professionals")) ||
 		  			(Profession.equals("Nursing (RN, LPN, LVN)"))|| (Profession.equals("Physical and Occupational Therapist")) || (Profession.equals("Social Work")) ||
 		  			(Profession.equals("Audiology, Speech and Hearing")) || (Profession.equals("Other Healthcare Profession not listed")))
	 		 		{
	 			 
	 		  		 
	 		 		         if (BoardAction.equalsIgnoreCase("Yes"))
	 		 		        {
	 		 	               ProfessionalDetailsPage.BoardAction_Yes().click();
	 		 		            Add_Log.info("Select Board Actions as Yes.");	
	 		 			     }
	 		 		  
	 		 		        if (BoardAction.equalsIgnoreCase("No"))
	 		 		          {
	 		 		        	
	 		 			      ProfessionalDetailsPage.BoardAction_No().click();
	 		 		          Add_Log.info("Select Board Actions as No.");	
	 			 			  }
	 		 		  
	 		 		} 
		        		 		 		
		 	}	*/
	 	
	 		  //-----------------Effective Date-------
	 		
	 		sendkeys(ProfessionalDetailsPage.EffectiveDate(), "Effective_Date", EffectiveDate1);
	 		
	 		
	 	
	 		//-----------------Policy Owner-----------
	 		 if(IntendedOwner.equals("Yes"))
	 		 {
	 			 ProfessionalDetailsPage.PolicyOwner_Self().click();
	 			 Add_Log.info("Buying for Self");
	 		 }
	 		
	 		 if(IntendedOwner.equals("No"))
	 		 {
	 			 ProfessionalDetailsPage.PolicyOwner_Self().click();
	 			Add_Log.info("Buying for Someone else");
	 		 }
	 		click(ProfessionalDetailsPage.NextStepButton(), "Get_My_Quote_Button");	   	 
	 		
	 		test.appendChild(tempTest);
			
		}
		catch(Exception e)
		{
			tempTest.log(LogStatus.FAIL,  e+test.addScreenCapture(takeScreenShot()));
			test.appendChild(tempTest);

			throw (e);
		}

}
	
	public static void ProfessionalDetail_NewUser(String State,String Profession,
			String Speciality1,String county,String writeYourSpecialty,String Employment1,String hasEmployerCoverage,String Coverage_Type,String RetroActiveDate,
			String AnticipatedGraduationMonth,String AnticipatedGraduationYear,
			String Graduatedinlast5years, String GraduatedinLast_Month, String GraduatedinLast_Year, String WorkPerWeek, String disciplinaryboardaction5Years,
			String NoOfClaims,String BoardAction, String EffectiveDate1,String EmailID,String IntendedOwner) throws Exception
    {
		
		try
		{
			tempTest = extent.startTest("Professional Detail");
			
			//Select Prod 1 
			HomePage.SelectProd1().click();
			Add_Log.info("Select Prod 1");	
			
			 //Select State ---------------------********************************************---------------------------------
			selectDropDownbyVisibleText(ProfessionalDetailsPage.State(), "Practice State", State);
			
 			
 			//Select profession ---------------------********************************************---------------------------------
			selectDropDownbyVisibleText(ProfessionalDetailsPage.Profession(), "Field_Of_Profession",Profession);
			
			
 			//Select specialty ---------------------********************************************---------------------------------
	 		if (  (!Profession.equals("Optometry")) && (!Profession.equals("Nurse Anesthetist (CRNA)")) )
	 		{
	 			selectDropDownbyVisibleText(ProfessionalDetailsPage.Speciality(), "Area_Of_Speciality", Speciality1);
	 			 			

	 		}
	 		//Select County- In which county do you predominantly practice or attend school? ---------------------
	 		if( ((State.equals("FL")) && (State.equals("CA"))) && ( (Profession.equals("Nurse Anesthetist (CRNA)")) || (Profession.equals("Optometry")) || (Profession.equals("Physician Assistant"))  ) )
 			{
	 			selectDropDownbyVisibleText(ProfessionalDetailsPage.county(), " Predominantly_Practice_or_Attend_school", county);
	 			
	 						
 			}
	 		if( (State.equals("IL")  && ((Profession.equals("Nurse Anesthetist (CRNA)")) || (Profession.equals("Nurse Practitioner")) || (Profession.equals("Optometry"))    ) ))
 			{
 				selectDropDownbyVisibleText(ProfessionalDetailsPage.county(), "Country_Selection", county);
	 			
 			}
	 		
	 		
	 		
	 		if((Profession.equals("Other Healthcare Profession not listed")) && (Speciality1.equals("All Other Allied Health Professional")))
	 		{
	 			sendkeys(ProfessionalDetailsPage.writeYourSpecialty(), "Write_Your_Speciality", writeYourSpecialty);
	 			
	 			
	 		}

	 	  //Please select your employment status:--------********************************************--------------------------------
	 		selectDropDownbyVisibleText(ProfessionalDetailsPage.Employment(), "Employment_Status", Employment1);
	 		
	 		 		  
	 		  	if (Employment1.equals("Student"))
	 		{
	 		  	sendkeys(ProfessionalDetailsPage.SchoolName(), "Enter_the_School_name", "School");
	 		  	
	 		  	selectDropDownbyVisibleText(ProfessionalDetailsPage.AnticipatedGradMonth(), "Anticipated_Month", AnticipatedGraduationMonth);
	 				 			
	 			sendkeys(ProfessionalDetailsPage.AnticipatedGradYear(), "Anticipated_Year", AnticipatedGraduationYear);
	 		  	
	 		}
	 		  	
	 		  	
	 		  	
	 		  	
	 		  	if(Employment1.equals("Employed"))
		 		{
		 		
		 			
		 			if(hasEmployerCoverage.equals("No"))
		 			{
		 			ProfessionalDetailsPage.No_EmployerCoverage().click();
		 			}
		 			
		 			if(hasEmployerCoverage.equals("Yes"))
		 			{
		 			ProfessionalDetailsPage.Yes_EmployerCoverage().click();
		 			}
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
	 			         click(ProfessionalDetailsPage.CoverageType_Occurrence(), "Occurance_as_Coverage_Type");
	 		  			
	 				     }	
	 		  			 if(Coverage_Type.equals("Claims Made"))
	 					 {
	 		  				click(ProfessionalDetailsPage.CoverageType_ClaimsMade(), "Claims_Made_as_Coverage_Type");
	 		  				
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
		        	   click(ProfessionalDetailsPage.Graduated_InPast_5Years_No(), "Select_Graduation_in_Last_5Years_as_No:");
	 		  			
		        	 }	

	        	     if (Graduatedinlast5years.equals("Yes"))    
	        	     {
	        	    	click(ProfessionalDetailsPage.Graduated_InPast_5Years_Yes(), "Select_Graduation_in_Last_5Years_as_Yes:"); 
	        	    	
	        	    	 selectDropDownbyVisibleText( ProfessionalDetailsPage.Graduated_5years_Month(), "Select_Recency_Month", GraduatedinLast_Month);
	        	    	 sendkeys(ProfessionalDetailsPage.Graduated_5years_Year(), "Recency_Year", GraduatedinLast_Year);	
	 			         
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
		 				sendkeys(ProfessionalDetailsPage.workperweek(), "Work_Per_Week", WorkPerWeek);
	 		  			
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
	 		  			 	click(ProfessionalDetailsPage.MalPractice_Yes(), "MalPractice_as_Yes");
	 		  			    selectDropDownbyVisibleText(ProfessionalDetailsPage.NoOfClaims(), "No_of_Claims", NoOfClaims);
	 		  			 	
	 		  			    //Have you been subject to any Board Actions?
	 		  			  if (BoardAction.equalsIgnoreCase("Yes"))
	 		 		        {
	 		 	              click(ProfessionalDetailsPage.BoardAction_Yes(), "BoardActions_as_Yes"); 
	 		  				  
	 		 			     }
	 		 		  
	 		 		        if (BoardAction.equalsIgnoreCase("No"))
	 		 		          {
	 		 		        	
	 		 			      click(ProfessionalDetailsPage.BoardAction_No(), "BoardActions_as_No");
	 		 		        	
	 			 			  }
		 		       }
		 		  
		 		      if (disciplinaryboardaction5Years.equalsIgnoreCase("No"))
		 		       {
		 			    click(ProfessionalDetailsPage.MalPractice_No(), "MalPractice_as_No");
		 		    	  	
		 			    }
		 		  } 
		        		 		 		
		 	}	
	 /*//Have you been subject to any Board Actions?
	 	if (!Employment1.equals("Student"))
		{
	 		if((Profession.equals("Nurse Practitioner")) || (Profession.equals("Nurse Anesthetist (CRNA)"))  || (Profession.equals("Physician Assistant")) ||
 		  			(Profession.equals("Optometry")) || (Profession.equals("Psychology and Mental Health")) || (Profession.equals("Nuclear Medicine Professionals")) ||
 		  			(Profession.equals("Nursing (RN, LPN, LVN)"))|| (Profession.equals("Physical and Occupational Therapist")) || (Profession.equals("Social Work")) ||
 		  			(Profession.equals("Audiology, Speech and Hearing")) || (Profession.equals("Other Healthcare Profession not listed")))
	 		 		{
	 			 
	 		  		 
	 		 		         if (BoardAction.equalsIgnoreCase("Yes"))
	 		 		        {
	 		 	               ProfessionalDetailsPage.BoardAction_Yes().click();
	 		 		            Add_Log.info("Select Board Actions as Yes.");	
	 		 			     }
	 		 		  
	 		 		        if (BoardAction.equalsIgnoreCase("No"))
	 		 		          {
	 		 		        	
	 		 			      ProfessionalDetailsPage.BoardAction_No().click();
	 		 		          Add_Log.info("Select Board Actions as No.");	
	 			 			  }
	 		 		  
	 		 		} 
		        		 		 		
		 	}	*/
	 	
	 		  //-----------------Effective Date-------
	 		
	 		sendkeys(ProfessionalDetailsPage.EffectiveDate(), "Effective_Date", EffectiveDate1);
	 		
	 		
	 		//-------------------Email Id----------
	 		
	 		
	 			sendkeys(ProfessionalDetailsPage.EmailId(), "Email ID", EmailID);
	 			
	 		
	 		
	 		
	 		
	 		//-----------------Policy Owner-----------
	 		 if(IntendedOwner.equals("Yes"))
	 		 {
	 			 ProfessionalDetailsPage.PolicyOwner_Self().click();
	 			 Add_Log.info("Buying for Self");
	 		 }
	 		
	 		 if(IntendedOwner.equals("No"))
	 		 {
	 			 ProfessionalDetailsPage.PolicyOwner_Self().click();
	 			Add_Log.info("Buying for Someone else");
	 		 }
	 		click(ProfessionalDetailsPage.NextStepButton(), "Get_My_Quote_Button");	   	 
	 		
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
