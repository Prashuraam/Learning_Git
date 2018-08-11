package ReusableFunctions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class HighLightElement extends TestSuiteBase.SuiteBase{
	
	
	public static void highLightElement(WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	public static void unHighLightElement(WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		  js.executeScript("arguments[0].style.border='0px'", element);
	}
}
