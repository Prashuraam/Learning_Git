package ReusableFunctions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.PolicyManagementPage;

public class AdditionalCoverages extends TestSuiteBase.SuiteBase{
	public static void AdditionalCoveragesVerification() throws Exception
    {
		
		try
		{
			tempTest = extent.startTest("Additional coverage verification");
			
			WebElement AdditionalCoveragesTable = PolicyManagementPage.AdditionalCoveragesTable();
			List<WebElement> options = AdditionalCoveragesTable.findElements(By.tagName("li"));
			for(int i=0;i<options.size();i++)
			{
				WebElement CoverageType = driver.findElement(By.xpath("//ul[@class='mx-list mx-list-striped mx-listview-list']/li["+(i+1)+"]/div/descendant::label[contains(text(),'Coverage Type')]/following-sibling::div/p"));
				//String AdditionalCoverageType = CoverageType.getText();
				HighLightElement.highLightElement(CoverageType);
			}
			test.appendChild(tempTest);
		
		}
		catch(Exception e)
		{
			tempTest.log(LogStatus.FAIL,  e+test.addScreenCapture(takeScreenShot()));
			test.appendChild(tempTest);

			throw (e);
		}

}
}
