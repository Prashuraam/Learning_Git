package PageObjects;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Wait;

public class RenewalTesting extends TestSuiteBase.SuiteBase {
	
	
private static WebElement element = null;
	
	public static FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(50, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS);
	
	
	//Method For System Admin
 	public static WebElement SystemAdmin(){
		
	 try
 		{
		 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(),'Reports')])[2]//following::li//*[contains(text(),'System Admin')]")));
 		}
 	catch(Exception e){
 		System.out.println(e);
 	}
 	return element;
 	}
 	
 	
 	//Method For Renewal Testing
 	 	public static WebElement RenewalTestingOption(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='mxui_widget_Navbar_8']/ul/li[5]/ul/li[18]/a")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 	
 	 	
 	 	
 	 //Method For Email Template
 	 	public static WebElement EmailTemplateOPtion(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='mxui_widget_Navbar_8']/ul/li[5]/ul/li[10]/a")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 	
     	//Method For Policy Number Search Field
 	 	public static WebElement PolicyNoSearchFieldAtTraditionalRenewal(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='mx-grid-search-input mx-name-searchField9']/input")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	
 	 //Method For Search Button At Traditional Renewal
 	 	public static WebElement SearchButtonAtTraditionalRenewal(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(.//*[@class='btn mx-button btn-default mx-name-search mx-grid-search-button'])[1]")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 	
 	 	 //Method For  Traditional Renewal Tab
 	 	public static WebElement TraditionalTab(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Traditional Renewal']")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 	
 	 	 //Method For select Policy At Traditional Renewal
 	 	public static WebElement SelectpolicyAtTraditionalRenewal(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(.//*[@class='table table-striped table-bordered mx-datagrid-body-table']/tbody/tr[1]/td[1]/div)[1]")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 	
 	 	

	 	 //Method For T-120 Notification At Traditional Renewal
	 	public static WebElement T120NotificationButton(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Stage For Phase1'])")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	 //Method For T0NotificationBlueButton At Traditional Renewal
	 	public static WebElement T0NotificationBlueButton(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Stage For T-0: UW Approved']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	 //Method For T0NotificationBlueButton At Traditional Renewal
	 	public static WebElement T0NotificationGreenButton(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Trigger T-0 Renew and Expire Policies Batch']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	 //Method For T-120 Notification At Traditional Renewal
	 	public static WebElement Phase1NotificationGreenButton(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Trigger Renewal Phase 1']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	 //Method For T-95 Notification At Traditional Renewal
	 	public static WebElement T95ApprovalNotificationButton(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Stage For Phase2 - UW Approved'])")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	 //Method For Green,T-95 Notification At Traditional Renewal
	 	public static WebElement T95ApprovalNotificationGreenButton(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Trigger Renewal Phase 2: UW Accepted']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	
	 	 //Method For T-95 Notification At Traditional Renewal
	 	public static WebElement T95DenyNotificationButton(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@Class='btn mx-button mx-name-actionButton2 btn-default']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	
	 	 //Method For Renewal Policy Number
	 	public static WebElement PolicyNoRenewal(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Renewal Policy:')]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	 //Method For looks Good
	 	public static WebElement LooksGood(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(.//*[@class='mx-table mx-name-table1 big-btns']/tbody/tr/td/button)[1]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	
	 	 //Method For Make changes
	 	public static WebElement MakeChanges(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='mx-table mx-name-table1 big-btns']/tbody/tr/td[3]/button")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	
	 	//Method For Policy Renewal Application State 
	 	public static WebElement StatePolicyRenewalApplication(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='form-group mx-name-dropDown1']/div/select")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	

	 	//Method For Policy Renewal Application phone 
	 	public static WebElement PhonePolicyRenewalApplication(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='form-group mx-name-dropDown1']/div/select")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	
	 	//Method For Policy Renewal Application submit 
	 	public static WebElement SubmitApplicationPolicyRenewalApplication(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='mx-dataview-controls']/button[text()='Submit Application']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	

	 	//Method For Policy Renewal Application submit 
	 	public static WebElement SelectButtontApplicationPolicyRenewalApplication(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='mx-dataview-controls']/button[text()='Submit Application']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For Policy Renewal Application Proceed
	 	public static WebElement ProceedButtontApplicationPolicyRenewalApplication(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='modal-content mx-dialog-content']//button[text()='Proceed']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	
	 	
	 	
	 	
	 	//Method For subject name under Sent Tab
	 	public static WebElement SubjectNameInSentTab(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(.//*[@class='table table-striped table-bordered mx-datagrid-body-table']/tbody/tr[1]/td[6]/div)[2]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	
	 	//Method For Sent Tab
	 	public static WebElement SentTab(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Sent']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	
	 	//Method For Administrative Task Tab
	 	public static WebElement AdministrativeTaskTab(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Administrative tasks']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For Scheduled Event: Send queued emails
	 	public static WebElement ScheduledEventSendQueuedEmails(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='mx-table mx-name-table1']/tbody/tr/td/Button[text()='Scheduled event: Send queued emails']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	
	 	//Method For Subject Field
	 	public static WebElement SubjectSentTab(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='mx-grid-search-input mx-name-searchField14']/input")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For Policy Field
	 	public static WebElement PolicyNoSentTab(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='mx-grid-search-input mx-name-searchField3']/input")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For Search
	 	public static WebElement SearchSentTab(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='mxui_widget_Button_374']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For 2nd and 3rd Notification
	 	public static WebElement SecondnThirdEmailNotification(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='nav nav-tabs mx-tabcontainer-tabs']/li[4]/a")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For send T 30
	 	public static WebElement SendT30EmailNotification(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='mx-grid-toolbar']/button[text()='Send T-30 Email']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	

	 	//Method For Select policy T 30
	 	public static WebElement SelectPolicyUnderT30(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='table table-striped table-bordered mx-datagrid-body-table'])[3]/tbody/tr[1]/td[1]/div")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For Select policy T 30
	 	public static WebElement PolicyNoTextBoxUnderT30(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Picked Up By T-30 Email']//following::input[1]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For Select policy T 7
	 	public static WebElement PolicyNoTextBoxUnderT7(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Picked Up By T-7 Email']//following::input[1]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For SearchButton_1T30
	 	public static WebElement SearchButton_1T30(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Send T-30 Email']//preceding::button[text()='Search'][1]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	
	 	//Method For SearchButton_1T7
	 	public static WebElement SearchButton_1T7(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Send T-7 Email']//preceding::button[text()='Search'][1]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	
	 	//Method For SearchButton_2T30
	 	public static WebElement SearchButton_2T30(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Send T-30 Email']//preceding::button[text()='Search'][2]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For SearchButton_2T7
	 	public static WebElement SearchButton_2T7(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Send T-7 Email']//preceding::button[text()='Search'][2]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For SearchButton_2T30
	 	public static WebElement SendT30ButtonUnderT30(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Send T-30 Email']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
		//Method For SendT30ButtonUnderT7
	 	public static WebElement SendT7ButtonUnderT7(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Send T-7 Email']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	
	 	
	 	//Method For Select policy T 7
	 	public static WebElement SelectPolicyUnderT7(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='table table-striped table-bordered mx-datagrid-body-table'])[4]/tbody/tr[1]/td[1]/div")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For T 7 Button
	 	public static WebElement SendT7EmailNotification(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='mx-grid-toolbar']/button[text()='Send T-7 Email']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
		//Method For Failure Code Entry
	 	public static WebElement FailureCodeEntryTab(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='nav nav-tabs mx-tabcontainer-tabs']/li[2]/a")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	
	 	//Method For Failure Code Entry under policy field
	 	public static WebElement PolicyNoFailureCodeEntry(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='mx-grid-search-input mx-name-searchField12']/input")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For Failure Code Entry under Amount field
	 	public static WebElement AmountFailureCodeEntry(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='form-group mx-name-textBox1']/div/input")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 
	 	//Method For Failure Code Entry under select  policy
	 	public static WebElement SelectpolicyFailureCodeEntry(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(.//*[@class='table table-striped table-bordered mx-datagrid-body-table'])[2]/tbody/tr[1]/td[1]/div")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	
	 	//Method For Failure Code Entry under Renew Policy with Custom Amount button
	 	public static WebElement RenewPolicywithCustomAmountbuttonFailureCodeEntry(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='mx-grid-toolbar']/button[text()='Renew Policy with Custom Amount']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	
	 	//Method For Failure Code Entry under Confirmation ok button
	 	public static WebElement ConfirmationOk2buttonFailureCodeEntry(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(.//*[@class='modal-content mx-dialog-content'])[2]/div[3]/button")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	
	 	//Method For Failure Code Entry under Confirmation ok button
	 	public static WebElement ConfirmationOk1buttonFailureCodeEntry(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(.//*[@class='modal-content mx-dialog-content'])[1]/div[3]/button")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	
	 	//OPerations 
	 	
	 	//Method For Operations
	 	public static WebElement OPerationsMenuBar(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='nav navbar-nav']/li[3]/a")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	
	 	//Method For PolicyRenewalUW
	 	public static WebElement PolicyNoRenewalUW(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='mx-grid-search-inputs']/div[4]/div[2]/input")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
		//Method For SelectPolicyRenewalUW
	 	public static WebElement SelectPolicyNoRenewalUW(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='table table-striped table-bordered mx-datagrid-body-table']/tbody/tr[1]/td[1]/div/span/a")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	
	 	
	 	//Method For UW Referral Decision Dailog box
	 	public static WebElement UWRefferralDecisionBox(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='modal-body mx-window-body']//select")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	
	 	//Method For UW Referral Decision Dailog Text Area
	 	public static WebElement UWRefferralDecisionTextBox(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='mx-dataview-content']//textarea")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For UW Referral Decision Dailog Reject Button
	 	public static WebElement RejectButtonUWRefferralDecision(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='mx-layoutgrid mx-layoutgrid-fluid mx-name-layoutGrid8']/div//button[2]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For UW Referral Decision Dailog Approve Button
	 	public static WebElement ApproveButtonUWRefferralDecision(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='mx-layoutgrid mx-layoutgrid-fluid mx-name-layoutGrid8']/div//button[1]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	

	 	//Method For UW Referral Decision Confiramtion OK button
	 	public static WebElement OKConfiramtionButtonUWRefferralDecision(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='modal-content mx-dialog-content']//div[3]/button")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	
	 	//Method For Referral Renewal tab
	 	public static WebElement ReferralRenewalTab(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='nav nav-tabs mx-tabcontainer-tabs']/li[2]/a")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For Referral renewal Policy no
	 	public static WebElement PolicyNoReferralRenewal(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(.//*[@class='mx-grid-search-inputs']//div[2]/input)[6]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	
		//Method For select Referral renewal Policy no
	 	public static WebElement SelectpolicyNoReferralRenewal(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='table table-striped table-bordered mx-datagrid-body-table']/tbody/tr[1]/td[1]/div/span/a")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	
	 	//Method For  Referral renewal text box
	 	public static WebElement TextboxReferralRenewal(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='modal-body mx-window-body']//textarea")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For UW Referral Decision Dailog Reject Button
	 	public static WebElement RejectButtonUWRefferralRenwalDecision(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='mx-layoutgrid mx-layoutgrid-fluid mx-name-layoutGrid4']/div//button[2]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For UW Referral Decision Dailog Approve Button
	 	public static WebElement ApproveButtonUWRefferralRenewalDecision(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='mx-layoutgrid mx-layoutgrid-fluid mx-name-layoutGrid4']/div//button[1]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	
		//Method For UW Referral Decision Dailog Approve Button
	 	public static WebElement OkButtonUWRefferralRenewalDecision(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='modal-content mx-dialog-content']/div[3]/button")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For Payment TAb
	 	public static WebElement PaymentTab(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Payment Test']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	
	 	//Method For Payment Policy number box
	 	public static WebElement PolicyNumberTextBox_PaymentTab(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(.//*[text()='Policy Number']//following::input)[6]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	
	 	//Method For Payment TAb
	 	public static WebElement SearchButton2_PaymentTab(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Stage for failed payment']//preceding::button[text()='Search'][2]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For SelectPolicyAtRow_PaymentTab TAb
	 	public static WebElement SelectPolicyAtRow_PaymentTab(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='mxui_widget_DataGrid_6']/div[3]/div/table[2]/tbody/tr[1]/td[1]/div")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For Payment TAb
	 	public static WebElement BillForIncrementalButton_PaymentTab(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='BillForIncremental']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	
}
