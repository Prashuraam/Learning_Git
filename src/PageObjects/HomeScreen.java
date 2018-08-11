package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;


public class HomeScreen extends TestSuiteBase.SuiteBase{
	
	
private static WebElement element = null;
	
	public static FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(50, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS);
	
	
	//Method For Mnanage Insured
 	public static WebElement ManageInsuredDropDown(){
		
	 try
 		{
		 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='bs-example-navbar-collapse-1']/ul[1]/li[1]/a")));
 		}
 	catch(Exception e){
 		System.out.println(e);
 	}
 	return element;
 	}
 	
 	//Method For Insured option
 	 	public static WebElement InsuredPartyOption(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='bs-example-navbar-collapse-1']/ul[1]/li[1]/ul/li[2]/a")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	

}
