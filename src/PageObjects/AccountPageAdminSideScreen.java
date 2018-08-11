package PageObjects;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;



public class AccountPageAdminSideScreen extends TestSuiteBase.SuiteBase  {
	
private static WebElement element = null;
	
	public static FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(50, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS);
	
	
	//Method For Email id Name
 	public static WebElement EmailIDAccountPage(){
		
	 try
 		{
		 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Email Address']//following::div/input)[1]")));
 		}
 	catch(Exception e){
 		System.out.println(e);
 	}
 	return element;
 	}
 	
 	
	//Method For Confirm Email ID Name
 	public static WebElement ConfirmEmailIDAccountPage(){
		
	 try
 		{
		 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Confirm Email Address']//following::div/input)[1]")));
 		}
 	catch(Exception e){
 		System.out.println(e);
 	}
 	return element;
 	}
 	
 	
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
 	
 	//Method For phone number 
 	 	public static WebElement AccountPageCreateUsersAccountAdminSideButton(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Go Back']//following::button")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
}
