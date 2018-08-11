package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;


public class PaymentDetailPage extends TestSuiteBase.SuiteBase {
	
private static WebElement element = null;
	
	public static FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(50, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS);
	
	
		//Method For Card number	 
	 	public static WebElement CardNo(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='cc-number']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For CVV	 
	 	public static WebElement CVV(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='cvv']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For Expiry	Date
	 	public static WebElement ExpiryDate(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='cc-expiration']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}

	 	//Method For Expiry	Year
	 	public static WebElement ExpiryYear(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='cc-set-year']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For Card Holder First Name
	 	public static WebElement CHFirstName(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='forename']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For Card Holder Last Name
	 	public static WebElement CHLastName(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='surname']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For Street Address
	 	public static WebElement StreetAddress(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='address']")));
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
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='city']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For State
	 	public static WebElement State(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='state']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For Zip Code
	 	public static WebElement ZipCode(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='zip']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}

	 	//Method For Buy Policy Button
	 	public static WebElement BuyPolicyButton(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='validate_submission']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For Buy Policy in Alert popup 
	 	public static WebElement BuyPolicyAlertButton(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='modal-dialog mx-dialog']/div[1]/div[3]/button[1]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For Download Policy Documents button 
	 	public static WebElement DownloadPolicyDocuments(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Download Your Policy']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For View Active Policy button 
	 	public static WebElement ViewActivePolicyButton(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='View Active Policy']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For Ok Confirmation button 
	 	public static WebElement OkConfirmation(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='mxui_widget_DialogMessage_0']/div[1]/div[3]/button")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For Download Policy PDF button 
	 	public static WebElement DownloadPolicyPDF(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='mx-name-container11 btn-group-wrapper']/button[1]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	
}
