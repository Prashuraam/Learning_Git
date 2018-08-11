package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;


public class AdminPolicyDetails extends TestSuiteBase.SuiteBase{
	
private static WebElement element = null;
	
	public static FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(50, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS);
	
	
		//Method For Policy Pieces block
	 	public static WebElement PolicyPiecesBlock(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Policy Components']//following::ul")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}

}
