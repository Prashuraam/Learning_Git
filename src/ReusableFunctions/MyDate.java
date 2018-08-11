package ReusableFunctions;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class MyDate extends TestSuiteBase.SuiteBase{
	static DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	static Date date = new Date();
	static Calendar cal = Calendar.getInstance();
	public static String todaysDate() throws Exception
    {
		String currentDate = dateFormat.format(date);
		return currentDate;
	}
	public static String pastDate6() throws Exception
    {
		cal.add(Calendar.DATE, -6);
		String pastDate = 	dateFormat.format(cal.getTime());
		return pastDate;
	}
	public static String pastDate19() throws Exception
    {
		cal.add(Calendar.DATE, -19);
		String pastDate = 	dateFormat.format(cal.getTime());
		return pastDate;
	}
	public static String pastDate21() throws Exception
    {
		cal.add(Calendar.DATE, -22);
		String pastDate = 	dateFormat.format(cal.getTime());
		return pastDate;
	}
	public static String pastDate4() throws Exception
    {
		cal.add(Calendar.DATE, -4);
		String pastDate = 	dateFormat.format(cal.getTime());
		return pastDate;
	}
	public static String futureDate() throws Exception
    {
		cal.add(Calendar.DATE, +3);
		String futureDate = 	dateFormat.format(cal.getTime());
		return futureDate;
	}
		

}
