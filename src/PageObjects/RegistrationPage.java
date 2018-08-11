package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
public class RegistrationPage extends TestSuiteBase.SuiteBase {
	
private static WebElement element = null;
	
	public static FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS);
	
	
		
	//Method For Email (case sensitive)
 	public static WebElement EmailId(){
		
	 try
 		{
		 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='mx-name-textBox4 email']/input")));
 		}
 	catch(Exception e){
 		System.out.println(e);
 	}
 	return element;
 	}
	//Method For Confirm Email
	 	public static WebElement ConfirmEmailId(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='form-group mx-name-textBox5 email']/div/input")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
		//Method For Password (at least 6 characters)
	 	public static WebElement Password(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class = 'form-group mx-name-textBox2']/div/input")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
		
	 	//Method For Confirm Password	 
	 	public static WebElement ConfirmPassword(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class = 'form-group mx-name-textBox3 confirmPass']/div/input")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For Create My Account Button 
	 	public static WebElement CreateMyAccount(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class = 'mx-dataview-controls']/button[text()='Create My Account']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For wrong  Email Msg 
	 	public static WebElement wrongEmailMsg(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Email address is not valid.')]")));
	 		}
	 	catch(Exception e){
	 		return element = null;
	 	}
	 	return element;
	 	}
	 	//Method For Existing  Email Msg 
	 	public static WebElement ExistingEmailMsg(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'This user name is already in use')]")));
	 		}
	 	catch(Exception e){
	 		return element = null;
	 	}
	 	return element;
	 	}
	 	//Method For wrong Confirm Email Msg 
	 	public static WebElement wrongConfirmEmailMsg(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Email addresses do not match')]")));
	 		}
	 	catch(Exception e){
	 		return element = null;
	 	}
	 	return element;
	 	}
	 	//Method For wrong password Msg 
	 	public static WebElement wrongPasswordMsg(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='modal-body mx-dialog-body']/p")));
	 		}
	 	catch(Exception e){
	 		return element = null;
	 	}
	 	return element;
	 	}
	 	//Method For Empty password Msg 
	 	public static WebElement emptyPasswordMsg(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Password cannot be empty.')]")));
	 		}
	 	catch(Exception e){
	 		return element = null;
	 	}
	 	return element;
	 	}
	 	//Method For Welcome Msg 
	 	public static WebElement WelcomeScreen(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='mx-name-formatString1 h1']/div")));
	 		}
	 	catch(Exception e){
	 		return element = null;
	 	}
	 	return element;
	 	}
	 	
		  		  
	}
	
