package ReusableFunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.relevantcodes.extentreports.LogStatus;


public class ManageInsuredScreen extends TestSuiteBase.SuiteBase {
	
private static WebElement element = null;
	
	public static FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(50, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS);
	
	
	//Method For Add Insured 
 	public static WebElement AddInsuredButton(){
		
	 try
 		{
		 tempTest = extent.startTest("WebElement Add Insured Button");
		 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.id(".//*[@id='manage-country']/div[1]/div/a/button")));
		 test.appendChild(tempTest);
 		}
 	catch(Exception e){
 		System.out.println(e);
 		tempTest.log(LogStatus.FAIL,  e+test.addScreenCapture(takeScreenShot()));
		test.appendChild(tempTest);

		throw (e);
 	}
 	return element;
 	}
 	

}
