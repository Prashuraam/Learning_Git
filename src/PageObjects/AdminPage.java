

package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;


public class AdminPage extends TestSuiteBase.SuiteBase{
	
private static WebElement element = null;
	
	public static FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(50, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS);
	
	
		//Method For User Info link
	 	public static WebElement UserInfo(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'User')]/b")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For Operations link
	 	public static WebElement Operations(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Operations')]/b")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For Policies to Mail Option
	 	public static WebElement PoliciestoMailOption(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='nav navbar-nav']/li[3]/ul/li[4]/a")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For Policies Option
	 	public static WebElement PoliciesOption(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='nav navbar-nav']/li[2]/ul/li[2]/a")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For Admin Buy Dashboard Option
	 	public static WebElement AdminBuyDashboard(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(),'Admin Buy Dashboard')])[2]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For Admin Buy Dashboard Option
	 	public static WebElement AdminBuyDashboardGetAQuoteButton(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Buy Quote'])//following::button[text()='Get A New Quote']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	
	 	//Method For Admin Dashboard Email Option
	 	public static WebElement AdminDashboardEmail(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Email'])[1]//following::div[1]/input")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For Search button
	 	public static WebElement AdminDashBoardSearchButton(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Search']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For SelectUser Dashboard
	 	public static WebElement AdminDashboardSelectUser(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='table table-striped table-bordered mx-datagrid-body-table']/tbody/tr[1]/td[1]/div")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For Create New Quote From Existing Account
	 	public static WebElement PurchaseSavedQuoteFromExistingAccount(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Buy Quote']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For All Policies
	 	public static WebElement AllPoliciesTab(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='nav nav-tabs mx-tabcontainer-tabs']/li[2]/a")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For Policy Number Text Field
	 	public static WebElement PolicyNumberTextField(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='mx-grid-search-input mx-name-searchField9']/input")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For Search Button
	 	public static WebElement SearchButton(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='mx-table mx-name-table1']/tbody/descendant::button[1]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For 1st row after search 
	 	public static WebElement SelectPolicy(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(.//div[@class='mx-grid-content']/div/table[2]/tbody/tr[1]/td[2]/div)[2]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For Policy Status 
	 	public static WebElement PolicyStatus(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Policy Status')]/following-sibling::div")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For view Policy button
	 	public static WebElement viewPolicybutton(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='btn mx-button mx-name-actionButton2 btn-default']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For Manage Payments button
	 	public static WebElement ManagePaymentsbutton(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Manage Payments']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For flat Cancel button
	 	public static WebElement flatCancelbutton(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='btn mx-button mx-name-actionButton6 btn-block btn-danger']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For Reverse Pending Cancel button
	 	public static WebElement ReversePendingCancel(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='btn mx-button mx-name-actionButton8 btn-block btn-success']")));
	 		}
	 	catch(Exception e){
	 		return element=null;
	 	}
	 	return element;
	 	}
	 	//Method For Renewal Link
	 	public static WebElement RenewalLink(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='mx-layoutgrid mx-layoutgrid-fluid container-fluid mx-name-layoutGrid8']/descendant::p")));
	 		}
	 	catch(Exception e){
	 		return element=null;
	 	}
	 	return element;
	 	}
	 	//Method For Cancel on Behalf of User button
	 	public static WebElement CancelonBehalfofUserbutton(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Cancel']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For Flat Cancel Text Area
	 	public static WebElement FlatCancelTextArea(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='mx-textarea mx-name-textArea1']/textarea")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For Cancel Policy button
	 	public static WebElement CancelPolicybutton_flat(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='btn mx-button mx-name-actionButton2 btn-danger']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	 //Method For Cancellation date
 	 	public static WebElement CancellationDate(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(.//div[@class='mx-dateinput-input-wrapper']/input[@class='form-control mx-dateinput-input'])[2]")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 //Method For Admin Cancellation reason
 	 	public static WebElement AdminCancellationReason(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='mx-layoutgrid mx-layoutgrid-fluid mx-name-layoutGrid2']/div[3]/div/div[1]/div/select")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 //Method For Cancellation reason
 	 	public static WebElement CancellationReason(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='mx-layoutgrid mx-layoutgrid-fluid mx-name-layoutGrid2']/div[4]/div/div[1]/div/select")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 //Method For Comments 
 	 	public static WebElement Comments(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='mx-textarea col-sm-9']/textarea")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 	 //Method For Cancel policy Button 
 	 	public static WebElement CancelPolicyButton(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='mx-dataview mx-name-dataView1 form-horizontal']/div[2]/button[1]")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 //Method For Cancel policy Button (Attention)/ Proceed button 
 	 	public static WebElement CancelPolicyButtonAttention(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='modal-footer mx-dialog-footer']/button[1]")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 //Method For Flat Cancel Error Message
 	 	public static WebElement FlatCancelerrorMsg(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Flat cancel is unavailable five days')]")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 //Method For Confirmation Ok Button 
 	 	public static WebElement ConfirmationOkButton(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='modal-footer mx-dialog-footer']/button")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 //Method For Endorsement Status
 	 	public static WebElement EndorsementStatus(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(.//*[text()='Status']//following::div//div/p[text()='Cancelled'])[1]")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 //Method For Policies to Mail Status
 	 	public static WebElement PtMStatus(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='table table-bordered mx-datagrid-head-table']/descendant::div[contains(text(),'Status')]")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 //Method For  Status Value
 	 	public static WebElement StatusValue(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='table table-striped table-bordered mx-datagrid-body-table']/tbody/tr[1]/td[2]/div")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 
}
