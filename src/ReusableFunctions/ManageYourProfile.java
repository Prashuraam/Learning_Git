package ReusableFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.ManageYourProfilePage;


public class ManageYourProfile extends TestSuiteBase.SuiteBase{
	
	
	public static void EditEmailId(String Email,String ConfEmail) throws Exception
    {
		
		try
		{
			tempTest = extent.startTest("Edit Email Id");
			click(ManageYourProfilePage.EmailEditButton(), "Click_on_Email_Edit_Button");
			sendkeys(ManageYourProfilePage.NewEmail(), "New_Email_Entered", Email);
			sendkeys(ManageYourProfilePage.ConfirmEmail(), "Conform_Email", ConfEmail);
			click(ManageYourProfilePage.ChangeMyEmailButton(), "Click_on_Change_My__Email_Button");
			click(ManageYourProfilePage.ProceedButton(), "Click_on_Proceed_Button");
			click(ManageYourProfilePage.ConfirmationOkButton(), "Click_Conformation_OK_Button");
			test.appendChild(tempTest);
						
		}
		catch(Exception e)
		{
			tempTest.log(LogStatus.FAIL,  e+test.addScreenCapture(takeScreenShot()));
			test.appendChild(tempTest);

			throw (e);
		}
    }
		public static void EditPolicyInfo(String FirstName,String LastName,String Gender,String PhoneNo,
				String maillingAdd,String city,String State,String zipCode) throws Exception
	    {
			
			try
			{
				tempTest = extent.startTest("Edit Policy Info");
				
				click(ManageYourProfilePage.policyInfoEditButton(), "Click_on_Policy_Information_Edit_Button");
				ManageYourProfilePage.FirstName().clear();
				sendkeys(ManageYourProfilePage.FirstName(), "Enter_First_Name", FirstName);
				ManageYourProfilePage.LastName().clear();
				sendkeys(ManageYourProfilePage.LastName(), "Enter_Last_Name", LastName);
				sendkeys(ManageYourProfilePage.Gender(), "Gender_Selection", Gender);
				ManageYourProfilePage.PhoneNo().clear();
				sendkeys(ManageYourProfilePage.PhoneNo(), "Enter_Phone_Number", PhoneNo);
				ManageYourProfilePage.MaillingAddress().clear();
				sendkeys(ManageYourProfilePage.MaillingAddress(), "Enter_Mailing_Address", maillingAdd);
				ManageYourProfilePage.City().clear();
				sendkeys(ManageYourProfilePage.City(), "Enter_City_Name", city);
				sendkeys(ManageYourProfilePage.State(), "State_Selection", State);
				ManageYourProfilePage.ZipCode().clear();
				sendkeys(ManageYourProfilePage.ZipCode(), "Enter_Zip_Code", zipCode);
				click(ManageYourProfilePage.SaveButton(), "Click_on_Save_Button");	
				click(ManageYourProfilePage.ProceedButton(), "Click_on_Proceed_Button");
				
				if(!(ManageYourProfilePage.ConfirmationOkButton()==null))
				{
					click(ManageYourProfilePage.ConfirmationOkButton(), "Click_on_Conformation_OK_Button");
					
				}
				
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].style.border='3px solid red'", driver.findElement(By.xpath("//*[@class='form-group mx-name-textBox4']/div/p")));
				js.executeScript("arguments[0].style.border='3px solid red'", driver.findElement(By.xpath("//*[@class='form-group mx-name-textBox6']/div/p")));
				js.executeScript("arguments[0].style.border='3px solid red'", driver.findElement(By.xpath("//*[@class='form-group mx-name-dropDown4']/div/p")));
				js.executeScript("arguments[0].style.border='3px solid red'", driver.findElement(By.xpath("//*[@class='form-group mx-name-textBox14']/div/p")));
				js.executeScript("arguments[0].style.border='3px solid red'", driver.findElement(By.xpath("//*[@class='form-group mx-name-textBox1']/div/p")));
				js.executeScript("arguments[0].style.border='3px solid red'", driver.findElement(By.xpath("//*[@class='form-group mx-name-textBox2']/div/p")));
				js.executeScript("arguments[0].style.border='3px solid red'", driver.findElement(By.xpath("//*[@class='form-group mx-name-dropDown1']/div/p")));
				js.executeScript("arguments[0].style.border='3px solid red'", driver.findElement(By.xpath("//*[@class='form-group mx-name-textBox3']/div/p")));
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
