package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;


public class ClaimsPage extends TestSuiteBase.SuiteBase {	
	
private static WebElement element = null;
	
	public static FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(50, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS);
	
	
		//Method For Manage your claims Link	 
	 	public static WebElement ClaimsButton(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Manage your claims')]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
		//Method For SubmitAClaim button
	 	public static WebElement SubmitAClaim(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='mx-layoutgrid mx-layoutgrid-fluid container-fluid mx-name-layoutGrid7 title-card-list submitted-claim']/div/div/button")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For Generate Claims Report button
	 	public static WebElement GenerateClaimsReport(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='mx-name-container2 h1-wrapper']/button")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For Contact	 
	 	public static WebElement ContactNo(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@Class='form-group mx-name-textBox5']//input")));
			
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	
	 	
	 	
	 	//Method For Date of Incident
	 	public static WebElement DateOfIncident(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='col-md-3']/div/div/div/div/input")));
			
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	
	 	
	 	//Method For Date of Claim reported
	 	public static WebElement DateOfClaimReported(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='col-md-4']/div/div/div/div/input")));
			
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
		//Method For Claimant
	 	public static WebElement Claimant(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='mx-name-container3 quest-holder']/div[@class='mx-name-textBox2']/input")));
			
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 
	 	
	 	//Method For Short Note
	 	public static WebElement ShorteNote(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Enter a short description of the incident or claim. (100 characters)']//following::div[1]")));
			
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	

	 	//Method For ClaimDescription
	 	public static WebElement ClaimDescription(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class = 'form-group mx-name-textArea2']//div/textarea")));
			
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For Submit a claim button
	 	public static WebElement SubmitClaimButton(){
			
		 try
	 		{ 
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='mx-dataview-controls']//*[text()='Submit Notice of Incident or Claim']")));
			
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For Confirmation
	 	public static WebElement ConfirmationButton(){
			
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
