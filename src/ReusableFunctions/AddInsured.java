package ReusableFunctions;

import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.AddInsuredScreen;

public class AddInsured extends TestSuiteBase.SuiteBase {
	
	
	
	
	
	public static void AddInsuredFunction(String Name,String NAICTitle, String SICTitle, String AddressType, String Address1, String Address2, String Country1, String State1, String City1, String ZIPCode, String DBNumber ) throws Exception
    {
		
		try
		{
			tempTest = extent.startTest("Add Insured Function");
			
			AddInsuredScreen.InsuredNameTextBox().sendKeys(Name);
			System.out.println("Name");
			
			AddInsuredScreen.NAICTitleTextBox().sendKeys(NAICTitle);
			System.out.println("NAIC Title");
			
			AddInsuredScreen.SICTitleTextBox().sendKeys(SICTitle);
			System.out.println("SIC TItle");
			
			AddInsuredScreen.AddAddressButton().click();
			System.out.println("Add Address Button");
			
			Thread.sleep(3000);
			
			Select Sel = new Select (AddInsuredScreen.AddressTypeDropDown());
			System.out.println(Sel);
			Sel.selectByVisibleText(AddressType);
			System.out.println("Address Type");
			
			AddInsuredScreen.AddressLine1TextBox().sendKeys(Address1);
			System.out.println("Address 1");
			
			AddInsuredScreen.AddressLine2TextBox().sendKeys(Address2);
			System.out.println("Address 2");
			
			Select Country = new Select (AddInsuredScreen.CountryDropDown());
			Country.selectByVisibleText(Country1);
			System.out.println("Country");
		
			Select State = new Select (AddInsuredScreen.StateDropDown());
			State.selectByVisibleText(State1);
			System.out.println("State");
			
			Select City = new Select (AddInsuredScreen.CityDropDown());
			City.selectByVisibleText(City1);
			System.out.println("City");
			
			AddInsuredScreen.ZipTextBox().sendKeys(ZIPCode);
			System.out.println("Zip Code");
			
			AddInsuredScreen.DBNumberTextBox().sendKeys(DBNumber);
			System.out.println("DBNumber");
			
			AddInsuredScreen.SubmitButton().click();
			System.out.println("Submit Button 1");
			
			Thread.sleep(5000);
			AddInsuredScreen.SubmitButtonOnMainScreen().click();
			System.out.println("Submit Button 2");
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
