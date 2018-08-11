package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;


public class LoginScreen extends TestSuiteBase.SuiteBase{
	
private static WebElement element = null;
	
	public static FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(50, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS);
	
	
	//Method For Password Launch 
 	public static WebElement LaunchPassword(){
		
	 try
 		{
		 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/div/div[2]/form/p[1]/input")));
		
 		}
 	catch(Exception e){
 		return null;
 	}
 	return element;
 	}
 	
 	
 	//Method For Password Launch Submit button
 	public static WebElement LaunchSubmitButton(){
		
	 try
 		{
		 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Submit']")));
		
 		}
 	catch(Exception e){
 		System.out.println(e);
 	}
 	return element;
 	}
 	
	//Method For Sign In button on Homepage
 	public static WebElement SignInButton(){
		
	 try
 		{
		 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Sign In'])[2]")));
		
 		}
 	catch(Exception e){
 		System.out.println(e);
 	}
 	return element;
 	}
 	
	
	//Method For Username 
 	public static WebElement UserNameTextBox(){
		
	 try
 		{
		 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='username']")));
 		}
 	catch(Exception e){
 		System.out.println(e);
 	}
 	return element;
 	}
 	
 	//Method For password
 	public static WebElement PasswordTextBox(){
		
	 try
 		{
		 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@type='password']")));
 		}
 	catch(Exception e){
 		System.out.println(e);
 	}
 	return element;
 	}
 	
 	//Method For Login Button
 	public static WebElement LoginButton(){
		
	 try
 		{
		 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='btn btn-primary submit']")));
 		}
 	catch(Exception e){
 		System.out.println(e);
 	}
 	return element;
 	}
  	

}
