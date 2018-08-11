package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;


public class PolicyDetailPage extends TestSuiteBase.SuiteBase {
	
private static WebElement element = null;
	
	public static FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(50, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS);
	
	
		//Method For First name	
	 	public static WebElement FirstName(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='First Name']//following::div[1]/input")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
		
	 	//Method For Last name 	 
	 	public static WebElement LastName(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Last Name']//following::div[1]/input")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	
	 	//Method For Professional Designation 	 
	 	public static WebElement ProfessionalDesignation(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Professional Designation (optional)']//following::div/input)[1]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
		//Method For Business Name
	 	public static WebElement Business_Name(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Business Entity Name (optional)']//following::div[1]/input")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	
	 	//Method For Street Address for Self Employed
	 	public static WebElement StreetAddress(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Mailing Address']//following::div[1]/input")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	
	 	//Method For City 
	 	public static WebElement City(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='City']//following::div[1]/input")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	
	 	//Method For State for self employed 
	 	public static WebElement State(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='State']//following::div[1]/select")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	
	 	
	 	
	 	
	 	//Method For Zip 
	 	public static WebElement Zip(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Zip Code']//following::div[1]/input")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For Zip Error Msg
	 	public static WebElement ZipErrorMsg(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Zip Code']//following::div[1]/div")));
	 		}
	 	catch(Exception e){
	 		return element=null;
	 	}
	 	return element;
	 	}
	 	
	 	
	 	//Method For One time payment
	 	public static WebElement OneTimePayment(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='One Time Payment']")));
			 
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For Installment
	 	public static WebElement Installment(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Installments']")));
			 
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	
	 	//Method For phone number 
	 	public static WebElement PrimaryPhoneNumberDropDown(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Primary Phone']//following::div/select)[1]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For phone number 
	 	public static WebElement PrimaryPhoneNumberTextBox(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Primary Phone']//following::div/input)[1]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	
	 	
	 	//Method For phone number 
	 	public static WebElement AlternatePhoneNumberDropDown(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Primary Phone']//following::div/select)[2]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	
	 	//Method For phone number 
	 	public static WebElement AlternatePhoneNumberTextBox(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Primary Phone']//following::div/input)[2]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	
	 	
	 	//Method For installment 
	 	public static WebElement installment(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='mx-layoutgrid mx-layoutgrid-fluid mx-name-layoutGrid10']/div[1]/div[2]/div[1]/div")));
	 		}
	 	catch(Exception e){
	 		return element=null;
	 	}
	 	return element;
	 	}
	 	
	// Method For installment
	public static WebElement ExtractPremium() {

		try {
			element = fwait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[contains(text(),'Make a one time payment for your annual premium of')]")));
		} catch (Exception e) {
			return element = null;
		}
		return element;
	}
	 	
	 	
	 	//Method For T&C 
	 	public static WebElement TermCondition(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='user-terms-and-conditions']//following::p[contains(text(),'7.5%')]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	
	 	//Method For T&C 
	 	public static WebElement TermCondition1(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='user-terms-and-conditions']//following::p//*[text()='System Requirements']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For T&C for User
	 	public static WebElement TermConditionUser(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='HTMLSnippet_widget_HTMLSnippet_2']/div/div/p[41]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For T&C check box 
	 	public static WebElement TCcheck(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='I Agree to the Terms & Conditions']//following::div[1]/input")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For T&C check box 2
	 	public static WebElement TCcheck2(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='I Agree to the Terms & Conditions']//following::div[1]/input")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For Enter Payment Info button
	 	public static WebElement ContinueButton(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Continue']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For Submit button
	 	public static WebElement SubmitButton(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Submit']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For Download Policy PDF 
	 	public static WebElement DownloadPolicyPDF(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class= 'mx-name-container11 btn-group-wrapper']/button[text() = 'Download Policy PDF']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	 //Method For Certificate
 	 	public static WebElement GenerateCertificateButton(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Generate Certificate of Insurance']")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 	
 	 //Method For SelectPolicyNumberDropDown
 	 	public static WebElement SelectPolicyNumberDropDown_COI(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Policy Number:']//following :: select)[1]")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 	
 	 //Method For RecipientsFullName
 	 	public static WebElement RecipientsFullName_COI(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(),'Full Name')]//following :: input)[1]")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
	 	
	 	
 	 	
 	 	 //Method For StreetAddress_COI
 	 	public static WebElement StreetAddress_COI(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(),'Street Address')]//following :: input)[1]")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
	 	
 	 	
 	 	
 	 	 //Method For City_COI
 	 	public static WebElement City_COI(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(),'City')]//following :: input)[1]")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	} 
 	 	
 	 	
 	 	 //Method For State_COI
 	 	public static WebElement State_COI(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(),'State')]//following :: select)[1]")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	} 
 	 	
 	 	 //Method For State_COI
 	 	public static WebElement Zip_COI(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(),'Zip')]//following :: input)[1]")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	} 
 	 	
 	 	 //Method For State_COI
 	 	public static WebElement DownloadYourCertificateButton_COI(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Download Your Certificate (PDF)']")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	} 
 	 	
 	 	
	 	
	 	
}
