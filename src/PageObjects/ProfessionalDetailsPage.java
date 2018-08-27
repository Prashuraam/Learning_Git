package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;


public class ProfessionalDetailsPage extends TestSuiteBase.SuiteBase {

private static WebElement element = null;
	
	public static FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(50, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS);
	
	//Method For State	 
 	public static WebElement State(){
 		
 		
		
	 try
 		{
		 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='In which state do you predominantly practice or attend school?']//following::select)[1]")));
 		}
 	catch(Exception e){
 		System.out.println(e);
 	}
 	return element;
 	}
		//Method For Profession	 
	 	public static WebElement Profession(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='mx-name-container31 form__element']//div[@class='mx-referenceselector-input-wrapper']/select")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For country (In which county do you predominantly practice or attend school?)	 
	 	public static WebElement county(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='mx-referenceselector']/div/select")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For Speciality	 
	 	public static WebElement Speciality(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class = 'mx-name-container21 form__element']//div[@class = 'mx-referenceselector-input-wrapper']/select")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
		
	 	
	 	

	 	
	 	//Method For Employment	 
	 	public static WebElement Employment(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(.//*[text() = 'Please select your employment status:']//following::div//select)[1]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}

	 // Method for No Employment Coverage
	 	
	 	 	public static WebElement No_EmployerCoverage(){
	 	 	
	 	 	try
	 	 	{
	 	 		element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='No, my employer does not provide coverage and this Cinch policy will be my only medical malpractice insurance.']")));
	 	 	}
	 	 	catch(Exception e){
	 	 		System.out.println(e);
	 	 	}
	 	 	return element;

	 	 	}
	 	 	
	 	 	
	 	 // Method for Yes Employment Coverage
	 	 	
	 	 	 	public static WebElement Yes_EmployerCoverage(){
	 	 	 	
	 	 	 	try
	 	 	 	{
	 	 	 		element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='mxui_widget_RadioButtonGroup_2']/div/div[1]/label/input")));
	 	 	 	}
	 	 	 	catch(Exception e){
	 	 	 		System.out.println(e);
	 	 	 	}
	 	 	 	return element;

	 	 	 	}

	 	//Method For Coverage Type Occurrence	 
	 	public static WebElement CoverageType_Occurrence(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class,'radio-inline') and contains(text(),'Occu')]//input")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}

	 	
	 	//Method For Coverage Type ClaimsMade	 
	 	public static WebElement CoverageType_ClaimsMade(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class,'radio-inline') and contains(text(),'Claims Made')]//input")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	

	 	//Method For Retro Active Date	 
	 	public static WebElement RetroActiveDate(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='mx-name-container2']//div//input[@value=':)']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For Graduated_InPast_5Years_No	 
	 	public static WebElement Graduated_InPast_5Years_No(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='mx-name-container4']/div/div/div/label[2]/input")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
		

	 	//Method For Graduated_InPast_5Years_Yes	 
	 	public static WebElement Graduated_InPast_5Years_Yes(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='mx-name-container4']/div/div/div/label[1]/input")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
		
	 	//Method For Graduated_5years_Month	 
	 	public static WebElement Graduated_5years_Month(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='mx-name-dropDown9 form__element--field']/select")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For Graduated_5years_Year	 
	 	public static WebElement Graduated_5years_Year(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(.//*[text()='Please enter your year of graduation:']/following::div/input)[1]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}

	 	//Method For PartTimeWork_No
	 	public static WebElement PartTimeWork_No(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='mx-name-container2']/div/div/div/label[2]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	
	 	//Method For PartTimeWork_Yes	 
	 	public static WebElement PartTimeWork_Yes(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='mx-name-container2']/div/div/div/label[1]/input")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For YearExp	 
	 	public static WebElement YearExp(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(.//*[contains(@id,'mxui_widget_NumberInput_')]/input)[3]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For workperweek	 
	 	public static WebElement workperweek(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='In total, how many hours do you work per week?']//following::input[@type='number']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For MalPractice_No	 
	 	public static WebElement MalPractice_No(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Have you been subject to a medical malpractice claim or disciplinary board action within the last 5 years?']//following::input[2]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}

	 	//Method For MalPractice_Yes	 
	 	public static WebElement MalPractice_Yes(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Have you been subject to a medical malpractice claim or disciplinary board action within the last 5 years?']//following::input[1]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For NoOfClaims	 
	 	public static WebElement NoOfClaims(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='How many claims with a loss amount greater than $5,000 have been filed against you in the past 5 years?']//following::div[1]/select")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For BoardAction_Yes	 
	 	public static WebElement BoardAction_Yes(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Have you been subject to any Board Actions?']//following::input[1]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For BoardAction_No
	 	public static WebElement BoardAction_No(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Have you been subject to any Board Actions?']//following::input[1]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}

	 	//Method For EffectiveDate
	 	public static WebElement EffectiveDate(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Please select the date you would like your coverage to begin:']//following::input[1]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}

	 	//Method For NextStepButton	 
	 	public static WebElement NextStepButton(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Terms & Conditions:']//following::button[1]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For NextStepButton	for CSR 
	 	public static WebElement NextStepButtonCSR(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='mx-name-container6 quest-content']/div/div[2]/button")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	
	 	//Method For School Name	 
	 	public static WebElement SchoolName(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Anticipated month of graduation:']//preceding::div/input")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For AnticipatedGradMonth	 
	 	public static WebElement AnticipatedGradMonth(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Anticipated month of graduation:']//following::div[1]/select")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}

	 	//Method For AnticipatedGradYear	 
	 	public static WebElement AnticipatedGradYear(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(.//*[text()='Anticipated year of graduation:']//following::div/input)[1]")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
	 	//Method For EmailId	 
	 	public static WebElement EmailId(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Please enter your email address:']//following::div/input")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	//Method For write your specialty
	 	public static WebElement writeYourSpecialty(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='form-group mx-name-textBox2']/div/input")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 
	 	
	 	//Method For Policy owner
	 	public static WebElement PolicyOwner_Self(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Yes, this policy is for me.']")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}
	 	
		//Method For Policy owner
	 	public static WebElement PolicyOwner_other(){
			
		 try
	 		{
			 element= fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[contains(text(),'purchasing this policy on behalf of someone else.')]/input")));
	 		}
	 	catch(Exception e){
	 		System.out.println(e);
	 	}
	 	return element;
	 	}

}