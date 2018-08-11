package SuiteOne;

import java.text.NumberFormat;
import java.text.ParseException;

public class Testing {
	
public static void main(String[] args) throws ParseException

{
	
	NumberFormat format = NumberFormat.getInstance();
	Number number = format.parse("123,456.78");
	float a = Float.parseFloat(number.toString());
	
	if(a>25000000000000.00)
	{
	System.out.println(number.toString());
	}
	else
	{
		
		System.out.println("Small No");
	}
		
}
}
