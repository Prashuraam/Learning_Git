package ReusableFunctions;

import java.text.NumberFormat;

import com.relevantcodes.extentreports.LogStatus;

public class Quote extends TestSuiteBase.SuiteBase{
	public static float PremiumAtQuoteScreen;
	public static void QuotePage(String EmploymentStatus) throws Exception
    {
		
		try
		{
			tempTest = extent.startTest("Quote Page");
			
			
			if (PageObjects.QuotePage.ConfiramtionOkButton_QuotePage()!=null)
			{
				click(PageObjects.QuotePage.ConfiramtionOkButton_QuotePage(),"Ok Button");
			}
			  String ExtractPremium = PageObjects.QuotePage.PremiumExtract().getText();
		 	   String Premium=  ExtractPremium.substring(22);
		 	    
		 	   NumberFormat format = NumberFormat.getInstance();
		 		Number number = format.parse(Premium);
		 		PremiumAtQuoteScreen = Float.parseFloat(number.toString());
		 	     
			
			if(EmploymentStatus.equalsIgnoreCase("Self-Employed"))
			{
				click(PageObjects.QuotePage.AddMedicareSlider(), "Add_Medical_&_Medical_Reimbursement?_Set_to_Yes:");
				
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
