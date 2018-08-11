package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;


public class HomePage extends TestSuiteBase.SuiteBase{
	
private static WebElement element = null;
	
	public static FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(50, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS);
	
	
	//Method For Sign in Button
 	public static WebElement SignInButton(){
		
	 try
 		{
		 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mxui_widget_ActionButton_4")));
 		}
 	catch(Exception e){
 		System.out.println(e);
 	}
 	return element;
 	}
 	//Method For User name
 	public static WebElement Username(){
		
	 try
 		{
		 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@dojoattachpoint = 'usernameInput']")));
 		}
 	catch(Exception e){
 		System.out.println(e);
 	}
 	return element;
 	}
 	
 	//Method For Password
 	public static WebElement Password(){
		
	 try
 		{
		 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@dojoattachpoint='passwordContainer']//input")));
 		}
 	catch(Exception e){
 		System.out.println(e);
 	}
 	return element;
 	}
 	//Method For SignIn Submit Button
 	public static WebElement SignInSubmitButton(){
		
	 try
 		{
		 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@dojoattachpoint = 'submitButton']")));
 		}
 	catch(Exception e){
 		System.out.println(e);
 	}
	 return element;
 	}
 	//Method For Create a new account Link
 	 	public static WebElement CreateNewAccountLink(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Create a new account')]")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 		 return element;
 	 	}
 	//Method For Forgot your password Link
 	 	public static WebElement forgotPassword(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@dojoattachpoint='forgotLink']")));
 	 		}
 	 	catch(Exception e){
 	 		return element = null;
 	 		
 	 		
 	 		
 	 		
 	 	}
 		 return element;
 	 	}
 	 //Method For Reset Email Address text box
 	 	public static WebElement resetEmail(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='mxui_widget_TextInput_4']/input")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 		
 	 	}
 		 return element;
 	 	}
 	 //Method For Reset Password Button
 	 	public static WebElement resetPasswordButton(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Reset Password']")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 		
 	 	}
 		 return element;
 	 	}
 	 //Method For Reset Password Error Msg
 	 	public static WebElement resetPasswordErrorMsg(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Email address is not recognized.')]")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 		
 	 	}
 		 return element;
 	 	}
 	 //Method For Reset Password conf Msg
 	 	public static WebElement resetPasswordConfMsg(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='modal-body mx-window-body']/div[1]/div[1]/div/div/div[1]/label")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 		
 	 	}
 		 return element;
 	 	}
 	 	 //Method For Reset Password OK button
 	 	public static WebElement resetPasswordOKbutton(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='modal-body mx-window-body']/div[1]/div[1]/div/div/div[2]/button")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 		
 	 	}
 		 return element;
 	 	}
	//Method For Error Message
	 	public static WebElement ErrorMessage(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@dojoattachpoint = 'messageNode']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 		return null;
	 	}
 	return element;
 	}
	 	//Method For Close SignIn Button (X)
	 	public static WebElement CloseButton(){
			
			 try
		 		{
				 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='mxui_widget_Window_0']/div[1]/div[1]/button")));
		 		}
		 	catch(Exception e){
		 		System.out.println(e);
		 	}
		 	return element;
		 	}
	 	//Method For SignoutButton
	 	public static WebElement SignoutButton(){
			
			 try
		 		{
				 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Sign out'])[2]")));
		 		}
		 	catch(Exception e){
		 		return element=null;
		 	}
		 	return element;
		 	}
	 	
	 	//Method For SignoutButton
	 	public static WebElement SignoutButtonAdmin(){
			
			 try
		 		{
				 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='btn mx-button mx-name-actionButton3 btn-primary']")));
		 		}
		 	catch(Exception e){
		 		return element=null;
		 	}
		 	return element;
		 	}
	 	
	 	
	//Method For Profession	1st Drop down box 
	 	public static WebElement Profession(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='mx-name-dropDown5 DropDownHome']/select")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
       // Method for 1st ZIP Code
	 	public static WebElement Zip(){
			
			 try
		 		{
				 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='mx-name-textBox4 zip-top zip']/input")));
		 		}
		 	catch(Exception e){
		 		System.out.println(e);
		 	}
		 	return element;
		 	}
	 	
	 	// Method for Get a Quote Button.
	 	public static WebElement GetAQuote(){
			
			 try
		 		{
				 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class = 'mx-table mx-name-table3 pull-right padd-sml']//button")));
		 		}
		 	catch(Exception e){
		 		System.out.println(e);
		 	}
		 	return element;
		 	}
	 // Method for Error Message for wrong zip code
	 	 	public static WebElement StateComingSoonMessage(){
	 			
	 			 try
	 		 		{
	 				 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Coming Soon.']")));
	 		 		}
	 		 	catch(Exception e){
	 		 		System.out.println(e);
	 		 	}
	 		 	return element;
	 		 	}
	 // Method for Get a New Quote Button (this Button will appear after login)
	 	 	public static WebElement GetANewQuote(){
	 			
	 			 try
	 		 		{
	 				 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='mx-layoutcontainer-middle mx-scrollcontainer-middle region-content']//div//button[text()='Get a New Quote']")));
	 		 		}                                                                                        
	 		 	catch(Exception e){
	 		 		System.out.println(e);
	 		 	}
	 		 	return element;
	 		 	}
	 	
	 	 	
	 	// Method for Get a New Quote Button (this Button will appear after login)
	 	 	public static WebElement GetANewQuoteHomePage(){
	 			
	 			 try
	 		 		{
	 				 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Sign In']//following::div//*[text()='Get a Quote'])[1]")));
	 		 		}                                                                                        
	 		 	catch(Exception e){
	 		 		System.out.println(e);
	 		 	}
	 		 	return element;
	 		 	}
	 	
	 	 	
	 	 	 // Method for selecting Prod 1
	 	 	public static WebElement SelectProd1(){
	 			
	 			 try
	 		 		{
	 				 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='btn-prod-selector']//div//*[text()='Medical Malpractice']")));
	 		 		}                                                                                        
	 		 	catch(Exception e){
	 		 		System.out.println(e);
	 		 	}
	 		 	return element;
	 		 	}
	 	
	 	
	 	
	 	

}
