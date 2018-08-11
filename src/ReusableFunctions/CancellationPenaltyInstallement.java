package ReusableFunctions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import com.relevantcodes.extentreports.LogStatus;


public class CancellationPenaltyInstallement extends TestSuiteBase.SuiteBase{
	
	public static boolean Result=false;
	public static boolean CancellationPenaltyVerification(String State,String PolEffectiveDate,String Cancellationdate,String TotalPremium,
														String RefundedAmount) throws Exception
    {
		
		try
		{
			tempTest = extent.startTest("Cancellation Penalty Verification");
			
			SimpleDateFormat myFormat = new SimpleDateFormat("MM/dd/yyyy");
			long noOfDay=0;
			
			    Date oPolEffectiveDate = myFormat.parse(PolEffectiveDate);
			    Date oCancellationdate = myFormat.parse(Cancellationdate);
			    long diff = oCancellationdate.getTime() - oPolEffectiveDate.getTime();
			    noOfDay=TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
			   
			
			
		TotalPremium = TotalPremium.replace("$", "");
			
		long amnt = (long)Double.parseDouble(TotalPremium);
		Double premiumPaid = 0.25*amnt;
		long UsedAmount = (amnt*noOfDay)/365;
		long UA = amnt-UsedAmount;
		double expRefunded=0;
		if(State.contentEquals("AK"))
		{
			expRefunded = premiumPaid-UA-(0.075*UA);
		}
		else
		{
			expRefunded = premiumPaid-UA-(0.1*UA);
		}
		
		expRefunded=Math.round(expRefunded);
		System.out.println(expRefunded);
		
		double oRefundedAmount = Double.parseDouble(RefundedAmount); 
		System.out.println(oRefundedAmount);
		if(expRefunded==oRefundedAmount)
		{
			Result=true;
			test.appendChild(tempTest);
		}
}//End of try
		catch(Exception e)
		{
			System.out.println(e);
			tempTest.log(LogStatus.FAIL,  e+test.addScreenCapture(takeScreenShot()));
			test.appendChild(tempTest);

			throw (e);
		}
		return Result;
    }
}

