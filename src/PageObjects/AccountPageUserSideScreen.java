package PageObjects;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;



public class AccountPageUserSideScreen extends TestSuiteBase.SuiteBase  {
	
private static WebElement element = null;
	
	public static FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(50, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS);
	
	
	//Method For Email id Name
 	public static WebElement EmailIDAccountPage(){
		
	 try
 		{
		 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Your Email Address']//following::div/input)[1]")));
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
 	
 	
 	//Method For Password
 	 	public static WebElement PasswordAccountPage(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Create Password']//following::div/input)[1]")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	
 	 	
 	 //Method For Confirm Password
 	 	public static WebElement ConfirmPasswordAccountPage(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Confirm Password']//following::div/input)[1]")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 	
 	 	 //Method For Confirm Password
 	 	public static WebElement CreateAccountButton(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Create Account']")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	

 	

 	 	
 	 	
}
