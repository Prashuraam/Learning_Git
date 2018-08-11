package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class QuotePage extends TestSuiteBase.SuiteBase{
	
private static WebElement element = null;
	
	public static FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(50, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS);
	
	
		//Method For Save Quote Button	 
	 	public static WebElement SaveQuote(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()= 'Save Your Quote']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For Confirmation popup 
	 	public static WebElement OkConfirmation(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='modal-content mx-dialog-content']/div[3]/button")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For view Quote button 
	 	public static WebElement ViewQuote(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='View Quote'])[1]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For view Quote button 
	 	public static WebElement QuoteNumber(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(.//*[contains(@id,'formatstring_widget_formatstring')]//h3)[1]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For view Quote Ready Heading (Your quote is ready!) 
	 	public static WebElement QuoteReadyMsg(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='mx-text mx-name-text1']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For Add Medicare Slider Button	 
	 	public static WebElement AddMedicareSlider(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='mx-name-container18 dotted-wrapper']/div/div/input")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For Add Medicare Slider Button	 
	 	public static WebElement PremiumExtract(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Your Annual Premium: ')]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For Add General Liability Coverage 
	 	public static WebElement GeneralLiabilitySlider(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='mx-name-container20 dotted-wrapper']/div/div/input")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For Buy Now Button	 
	 	public static WebElement BuyNow(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Buy Now']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For ConfiramtionOkButton_QuotePage	 
	 	public static WebElement ConfiramtionOkButton_QuotePage(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='OK']")));
	 		}
	 	catch(Exception e){
	 		return null;
	 	}
	 	return element;
	 	}
	 	//Method For Quote Process message	 
	 	public static WebElement QuoteProcessMessage(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='mx-layoutgrid mx-layoutgrid-fluid container-fluid mx-name-layoutGrid1']/descendant::p")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For Total Premium Amount 
	 	public static WebElement TotalPremiumAmount(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='mx-layoutgrid mx-layoutgrid-fluid mx-name-layoutGrid3 total']/div[1]/div[3]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
}
