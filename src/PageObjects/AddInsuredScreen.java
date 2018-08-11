package PageObjects;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;



public class AddInsuredScreen extends TestSuiteBase.SuiteBase  {
	
private static WebElement element = null;
	
	public static FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(50, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS);
	
	
	//Method For Insured Name
 	public static WebElement InsuredNameTextBox(){
		
	 try
 		{
		 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='Name']")));
 		}
 	catch(Exception e){
 		System.out.println(e);
 	}
 	return element;
 	}
 	
 	
 	//Method For NAIC Title
 	 	public static WebElement NAICTitleTextBox(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='NAICTitle']")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	
 	 //Method For SIC Title
 	 	public static WebElement SICTitleTextBox(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='SICTitle']")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 	
 	 	 //Method For NAIC Code
 	 	public static WebElement NAICCodeTextBox(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='NAICCode']")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	
 	 	
 	 //Method For SIC Code
 	 	public static WebElement SICCOdeTextBox(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='SICCode']")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}

 	 	
 	 //Method For Status
 	 	public static WebElement StatusTextBox(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='status']")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 	
 	 	
 	 	 //Method For Add Address 
 	 	public static WebElement AddAddressButton(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='manage-country']/div[2]/div/button")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 	
 	 //Method For Address Type Drop Down 
 	 	public static WebElement AddressTypeDropDown(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='AddressType']")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 	
 	 //Method For Address Line 1
 	 	public static WebElement AddressLine1TextBox(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='InsuredAddress_Addressline1']")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 	
 	 //Method For Address Line 2
 	 	public static WebElement AddressLine2TextBox(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='InsuredAddress_Addressline2']")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 	
 	 //Method For Country Drop Down
 	 	public static WebElement CountryDropDown(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='CountryId']")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 	
 	 	 //Method For State Drop Down
 	 	public static WebElement StateDropDown(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='StateId']")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 	
 	 	 //Method For City Drop Down
 	 	public static WebElement CityDropDown(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='CityId']")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 	
 	 	
 	 	 //Method For ZIp code
 	 	public static WebElement ZipTextBox(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='InsuredAddress_Zipcode']")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 	
 	 	 //Method For D & B Number
 	 	public static WebElement DBNumberTextBox(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='InsuredAddress_DBNumber']")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 	
 		 //Method For Submit Button
 	 	public static WebElement SubmitButton(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='myModal']/div/div/div[3]/button[1]")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 	
 	 //Method For Submit Button
 	 	public static WebElement SubmitButtonOnMainScreen(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@ng-click='SaveInsuredParty()']")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}

 	 	
 	 	
}
