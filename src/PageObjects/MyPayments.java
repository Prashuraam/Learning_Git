package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;


public class MyPayments extends TestSuiteBase.SuiteBase{
	
private static WebElement element = null;
	
	public static FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS);
	
	
	//Method For My Payments Link
 	public static WebElement MyPaymentsLink(){
		
	 try
 		{
		 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'My Payments')]")));
 		}
 	catch(Exception e){
 		System.out.println(e);
 	}
 	return element;
 	}
 	
 	 //Method For Pay Balance Tab
 	 	public static WebElement PayBalanceTab(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Pay Balance')]")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 	 //Method For Billing Information Tab
 	 	public static WebElement BillingInformationTab(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Billing Information')]")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 	 //Method For Edit button
 	 	public static WebElement CreditCardEditButton(){
 			
 		 try
 		 
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Edit']")));
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
 	 //Method For Pay Balance button
 	 	public static WebElement PayBalanceButton(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='mx-layoutcontainer-middle mx-scrollcontainer-middle region-content']/descendant::button[3]")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 //Method For Pay Balance button (As Admin)
 	 	public static WebElement AdminPayBalanceButton(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='mx-layoutcontainer-middle mx-scrollcontainer-middle region-content']/descendant::button[2]")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 //Method For Proceed button
 	 	public static WebElement ProceedButton(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='modal-footer mx-dialog-footer']/button[1]")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 //Method For Error Message
 	 	public static WebElement ErrorMsg(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'You do not have a balance due on Policy:')]")));
 	 		}
 	 	catch(Exception e){
 	 		return element=null;
 	 	}
 	 	return element;
 	 	}
 	 //Method For Ok confirmation button
 	 	public static WebElement OkConfirmationButton(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='modal-footer mx-dialog-footer']/button")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
}
