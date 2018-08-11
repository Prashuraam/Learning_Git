package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;


public class CommonQuestions extends TestSuiteBase.SuiteBase{
	
private static WebElement element = null;
	
	public static FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS);
	
	
	//Method For CommonQuestions Link
 	public static WebElement CommonQuestionsLink(){
		
	 try
 		{
		 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='navbar navbar-default mx-navbar mx-name-menuBar2 hidden-xs cust-menu']/ul/li[5]/a")));
 		}
 	catch(Exception e){
 		System.out.println(e);
 	}
 	return element;
 	}
 	//Method For What does my policy cover
 	 	public static WebElement Whatdoesmypolicycover(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'What does my policy cover')]")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 //Method For Employed/Occurrence
 	 	public static WebElement Employed_Occurrence(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='mx-layoutgrid mx-layoutgrid-fluid mx-name-layoutGrid2']/div[1]/div[1]/span/a")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 //Method For Self-Employed/Occurrence
 	 	public static WebElement SelfEmployed_Occurrence(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='mx-layoutgrid mx-layoutgrid-fluid mx-name-layoutGrid2']/div[1]/div[2]/span/a")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 //Method For Employed/Claims Made
 	 	public static WebElement Employed_ClaimsMade(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='mx-layoutgrid mx-layoutgrid-fluid mx-name-layoutGrid2']/div[2]/div[1]/span/a")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}
 	 //Method For Self-Employed/Claims Made
 	 	public static WebElement SelfEmployed_ClaimsMade(){
 			
 		 try
 	 		{
 			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='mx-layoutgrid mx-layoutgrid-fluid mx-name-layoutGrid2']/div[2]/div[2]/span/a")));
 	 		}
 	 	catch(Exception e){
 	 		System.out.println(e);
 	 	}
 	 	return element;
 	 	}

}
