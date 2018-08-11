package ReusableFunctions;

import com.relevantcodes.extentreports.LogStatus;

public class QuoteWithCoverage extends TestSuiteBase.SuiteBase{
	public static void QuotePage(String Medicare,String GeneralLiability) throws Exception
    {
		
		try
		{
			tempTest = extent.startTest("Quote Page");
			if(Medicare.equalsIgnoreCase("Yes"))
			{
				
				click(PageObjects.QuotePage.AddMedicareSlider(), "Add_Medicare_&_Medicaid_Reimbursement?_Set_to_Yes:");
				
			}
			if(GeneralLiability.equalsIgnoreCase("Yes"))
			{
				click(PageObjects.QuotePage.GeneralLiabilitySlider(), "Add_General_Liability?_Set_to_Yes:");
				
			}
			click(PageObjects.QuotePage.BuyNow(), "Click_on_BuyNow_Button");
			
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
