package ReusableFunctions;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.ProfessionalDetailsPage;


public class ProfessionalDetails extends TestSuiteBase.SuiteBase{
	public static void ProfessionalDetail(String State,String Profession,
			String Speciality1,String country,String Employment1,
			String Coverage_Type,String RetroActiveDate,String AnticipatedGraduationMonth,String AnticipatedGraduationYear,
			String Graduatedinlast5years, String RecencyMonth, String RecencyYear, String YearofExperience, 
			String medicalmalpracticeclaim, String NoOfClaims,
			String BoardAction, String EffectiveDate1, String PartTime) throws Exception
    {
		
		try
		{
			tempTest = extent.startTest("Professional Detail");
			 //Select State
			selectDropDownbyVisibleText(ProfessionalDetailsPage.State(), "State_Selection", State);
			 			
 			//Select profession
			selectDropDownbyVisibleText(ProfessionalDetailsPage.Profession(), "Profession_Selection", Profession);
				
 			/*ProfessionalDetailsPage.Profession().sendKeys(Profession);
 			ProfessionalDetailsPage.Profession().sendKeys(Keys.TAB);*/
 						
 			//Select specialty
	 		if ((!Profession.equals("Optometry")) || (!Profession.equals("Nurse Anesthetist (CRNA)"))) 
	 		{
	 				
	 			selectDropDownbyPartOfText(ProfessionalDetailsPage.Speciality(), "Speciality_Selection", Speciality1);
	 			
	 		}
	 		if( (State.equals("FL")) && ( (Profession.equals("Nurse Practitioner"))) )
 			{
	 			selectDropDownbyVisibleText(ProfessionalDetailsPage.Speciality(), "Selection_Of_Speciality", Speciality1);
	 			
 			}
	 		if( (State.equals("FL")) && ( (Profession.equals("Nurse Anesthetist (CRNA)"))) )
 			{
	 			selectDropDownbyVisibleText(ProfessionalDetailsPage.county(), "Country_Selection", country);
	 			 				
 			}
	 		if( (State.equals("IL")  && ((Profession.equals("Nurse Anesthetist (CRNA)")) || (Profession.equals("Nurse Practitioner"))) ))
 			{
 				selectDropDownbyVisibleText(ProfessionalDetailsPage.county(), "Country_Selection", country);
	 			
 			}
	 		if((Profession.equals("Other Healthcare Profession not listed")) && (Speciality1.equals("All Other Allied Health Professional")))
	 		{
	 			sendkeys(ProfessionalDetailsPage.writeYourSpecialty(), "Write_Your_Speciality", "Health Care");
	 			
	 		}

	 	        //-----------Employment-----------

	 	    
	 		 selectDropDownbyVisibleText(ProfessionalDetailsPage.Employment(), "Selection_Of_Employment", Employment1); 
	 		 
	 		  	if (Employment1.equals("Student"))
	 		{
	 		  	
	 			selectDropDownbyVisibleText(ProfessionalDetailsPage.AnticipatedGradMonth(), "Anticipated_Graduation_Month", AnticipatedGraduationMonth);
	 		  	sendkeys(ProfessionalDetailsPage.AnticipatedGradYear(), "Anticipated_Graduation_Year", AnticipatedGraduationYear);	 			
	 			
	 		}
	 		  	
	 			
	 		    
	 			  //--------------Validation on Coverage Type ----------
	 			  	
	 		  	String[] Array_CoverType_Path = {"Nurse Practitioners","Nurse Anesthetist (CRNA)","Physician Assistants","Physical and Occupational Therapists", "Psychologist", "Social Work", "Radiologist"};
	 			 for (String a : Array_CoverType_Path)
	 			 {
	 			     
	 			     
	 				 if ((a.equals(Profession)) && (!Employment1.equals("Student")))
	 				 {
	 					 if (Coverage_Type.equals("Occurrence"))
	 					 {
	 			         click(ProfessionalDetailsPage.CoverageType_Occurrence(), "Select_Occurance_As_Coverage_Type");
	 							 				     }		 
	 				     else
	 				      {
	 				    	click(ProfessionalDetailsPage.CoverageType_ClaimsMade(), "Select_Claim_As_Coverage_type");
	 				    	 
	 				      }
	 					 
	 					 if(Coverage_Type.equals("Claims Made"))
	 					 {
	 						 sendkeys(ProfessionalDetailsPage.RetroActiveDate(), "Retro_Active_Date", RetroActiveDate);
	 						 
	 					 }
	 					
	 			     } break;
	 			 }
	 			
	 		  	
	 			//---------------- Recency of Graduation Validation------------------ 
	 		  	 
	 			 
	 			String[] Array_RecencyGraduation_Validation = {"Nurse Practitioner","Psychology and Mental Health","Nurse Anesthetist (CRNA)","Physician Assistant","Optometry","Psychologist","Nuclear Medicine Professionals"};
	 			  for (String a:Array_RecencyGraduation_Validation)
	 			  {
	 				 
	 			         if  ((a.equals(Profession)) && (!Employment1.equals("Student")))
	 			         {
	 			     
	 			        	 if (Graduatedinlast5years.equals("No"))
	 			        	 {
	 			        	    
	 			             	click(ProfessionalDetailsPage.Graduated_InPast_5Years_No(), "Select_Graduation_in_5Year_As_No:");
	 			        		 	 			       
	 			        	 }

	 		        	     if (Graduatedinlast5years.equals("Yes"))    
	 		        	     {
	 		        	    	 
	 		        	    	 click(ProfessionalDetailsPage.Graduated_InPast_5Years_Yes(), "Select_Graduation_in_5Year_As_Yes:");
	 		        	    	 	 		 			       
	 		        	     }
	 		        	     
	 			        	 if (ProfessionalDetailsPage.Graduated_InPast_5Years_Yes().isSelected())
	 		        	        {
	 			        		 
	 			        		 
	 		        	        sendkeys(ProfessionalDetailsPage.Graduated_5years_Month(), "Select_Recency_Month", RecencyMonth);	 
	 		        			 sendkeys(ProfessionalDetailsPage.Graduated_5years_Year(), "Enter_Recency_Year", RecencyYear);	 		 			          
	 		        			 	 		 			          
	 		        			    }		
	 			        	 break;
	 		        	 }
	 			         
	 			  }
	 			
	 			//----------------In total, how many hours do you work per week?-------
		 			 
		 			 if( (!Employment1.equals("Student")) && ( (!Profession.equals("Nursing (RN, LPN, LVN)")) || (!Profession.equals("Social Work"))  ||  
		 					 							(!Profession.equals("Physical and Occupational Therapist"))	 ||  (!Profession.equals("Audiology, Speech and Hearing"))	 ||
		 					 							(!Profession.equals("Other Healthcare Profession not listed"))    ))  
		 			 {
		 				 sendkeys(ProfessionalDetailsPage.workperweek(), "Enter_Work_Per_Week", "34");
		 				 
		 			 }
		 		 
	 		  	
	 		//---------------------------Part Time Field validation-----------
	 			  
	 			  
	 			 String[] Array_PartTime_Validation = {"Nurse Practitioner","Psychology and Mental Health","Nurse Anesthetist (CRNA)","Physician Assistant","Optometry","Psychologist", "Nuclear Medicine Professionals"};
	 		
	 		  	 for (String a:Array_PartTime_Validation)
	 		        {
	 		           if ((a.equals(Profession)) &&(!Employment1.equals("Student")))
	 		             {
	 		  		  
	 		        	  if (PartTime.equals("No"))
	 		        	    {
	 		        		
	 		        		  click(ProfessionalDetailsPage.PartTimeWork_No(), "Select_Part_Time_As_No:");
	 		        		  	 		 			        
	 		        	    }
	 		        	  else
	 		        	    {
	 		        		 
	 		        		  click(ProfessionalDetailsPage.PartTimeWork_Yes(), "Select_Part_Time_As_yes:");
	 		        		  
	 		 			       
	 		        		 }break;
	 		           	        	 
	 		            }
	 		    
	 		         }
	 		 
	 		  
	 	 	  //---------------- validation for MalPractice Option ---------
	 		 
	 	      
	 		  
	 		  if (!Employment1.equals("Student"))
	 		       
	 			{
	 			  
	 			  if (medicalmalpracticeclaim.equals("Yes"))
	 			  
	 		       {
	 	           
	 		          
	 				  click(ProfessionalDetailsPage.MalPractice_Yes(), "Select_MalPractice_As_Yes:");
	 				  	 			       
	 		       }
	 		  
	 		      if (medicalmalpracticeclaim.equals("No"))
	 		       {
	 			     click(ProfessionalDetailsPage.MalPractice_No(), "Select_MalPractice_As_No:");
	 		    	
	 		       }
	 		  
	 		    //-----No of Claims validation--------
	 		
	 	     	  if (medicalmalpracticeclaim.equals("Yes"))
	 		        {
	 	     		  
	 			      selectDropDownbyVisibleText(ProfessionalDetailsPage.NoOfClaims(), "Select_No_Of_Claims", NoOfClaims);
	 	     		  	 		          
	 		        } 
	 		  
	 		  //-------Board Actions Validation---------
	 		
	 		         
	 		  if (medicalmalpracticeclaim.equals("Yes"))
	 		  {
	 		         if (BoardAction.equals("Yes"))
	 		        {
	 	              
	 		            click(ProfessionalDetailsPage.BoardAction_Yes(), "Select_Board_Action_As_Yes:");
	 		        	 
	 		        }
	 		  
	 		        if (BoardAction.equals("No"))
	 		          {
	 			      
	 		            click(ProfessionalDetailsPage.BoardAction_No(), "Select_Board_Action_As_No:"); 
	 		        			 			       
	 		          }
	 		  }
	 		  
	 		}
	 		  
	 		  //-----------------Effective Date-------
	 		
	 		  sendkeys(ProfessionalDetailsPage.EffectiveDate(), "Effective_Date", EffectiveDate1);
	 		  
	 		 click(ProfessionalDetailsPage.NextStepButton(), "Click_on_Get_My_Quote_Button"); 		 
	 		
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
