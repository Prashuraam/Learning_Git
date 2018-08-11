package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;


public class PolicyManagementPage extends TestSuiteBase.SuiteBase{
	
private static WebElement element = null;
	
	public static FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS);
	
	
	//Method For Policy Management Link
 	public static WebElement PolicyManagementLink(){
		
	 try
 		{
		 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Common Questions']//preceding::div//*[text()='Policy Management']")));
 		}
 	catch(Exception e){
 		System.out.println(e);
 	}
 	return element;
 	}
 	//Method For Policy Information table
 	 	public static WebElement PolicyInfoTable(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='mx-table mx-name-table1 faux-datagrid-labels']/following-sibling::div")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 //Method For Load more.. Link
 	 	public static WebElement Loadmore(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='mx-table mx-name-table1 faux-datagrid-labels']/following-sibling::div/button")));
 	 		}
 	 	catch(Exception e){
 	 		return element = null;
 	 	}
 	 	return element;
 	 	}
 	 //Method For Policy Cancel Link (If you would like to cancel your policy  CLICK HERE.)
 	 	public static WebElement PolicyCancelLink(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'cancel your policy')]/ins")));
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
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='mx-dateinput-input-wrapper']/input")));
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
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='form-control']")));
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
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='mx-dataview-controls']/button[1]")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 	 //Method For Future Date Error Msg
 	 	public static WebElement FutureDateErrorMsg(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Cancellation Date in the future')]")));
 	 		}
 	 	catch(Exception e){
 	 		return element=null;
 	 	}
 	 	return element;
 	 	}
 	 //Method For Cancel policy Button (Attention)
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
 	 //Method For Additional Coverages text
 	 	public static WebElement AdditionalCoveragesText(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Additional Coverages')]")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 //Method For Coverages Status
 	 	public static WebElement CoveragesStatus(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='form-group mx-name-radioButtons7']/div/p")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 //Method For Additional Coverages Table
 	 	public static WebElement AdditionalCoveragesTable(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='mx-list mx-list-striped mx-listview-list']")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 	
 	 //Method For Generate Certificate of Insurance
 	 	public static WebElement GenerateCertificateButton(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Generate Certificate of Insurance']")));
 	 		}
 	 	catch(Exception e){
 	 		return element=null;
 	 		
 	 	}
 	 	return element;
 	 	}
 	 //Method For Refunded Amount
 	 	public static WebElement RefundedAmount(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Refunded Amount')]/following-sibling::div/p")));
 	 		}
 	 	catch(Exception e){
 	 		return element=null;
 	 		
 	 	}
 	 	return element;
 	 	}
 	 //Method For Cancellation date
 	 	public static WebElement Cancellationdate(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Cancellation date')]/following-sibling::div/p")));
 	 		}
 	 	catch(Exception e){
 	 		return element=null;
 	 		
 	 	}
 	 	return element;
 	 	}
 	 //Method For View My Application
 	 	public static WebElement ViewMyApplication(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='mx-name-container11 btn-group-wrapper']/button[3]")));
 	 		}
 	 	catch(Exception e){
 	 		return element=null;
 	 		
 	 	}
 	 	return element;
 	 	}
 	 //Method For Coverage Start Date
 	 	public static WebElement CoverageStartDate(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Coverage Start Date:')]/following-sibling::div/p")));
 	 		}
 	 	catch(Exception e){
 	 		return element=null;
 	 		
 	 	}
 	 	return element;
 	 	}
 	 //Method For Total Premium at Policy Issue:
 	 	public static WebElement TotalPremium(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Total Premium at Policy Issue:')]/following-sibling::div")));
 	 		}
 	 	catch(Exception e){
 	 		return element=null;
 	 		
 	 	}
 	 	return element;
 	 	}
 	 	 //Method For State of Practice:
 	 	public static WebElement StateofPractice(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'State of Practice:')]/following-sibling::div")));
 	 		}
 	 	catch(Exception e){
 	 		return element=null;
 	 		
 	 	}
 	 	return element;
 	 	}
 	 //Method For Back to Policy Details
 	 	public static WebElement BacktoPolicyDetailsLink(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Back to Policy Details')]")));
 	 		}
 	 	catch(Exception e){
 	 		return element=null;
 	 		
 	 	}
 	 	return element;
 	 	}
 	 	 //Method For County of Practice:
 	 	public static WebElement CountyOfPractice(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'County of Practice:')]/following-sibling::div/div/p")));
 	 		}
 	 	catch(Exception e){
 	 		return element=null;
 	 		
 	 	}
 	 	return element;
 	 	}
}
