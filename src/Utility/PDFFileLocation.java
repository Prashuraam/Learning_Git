package Utility;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.WildcardFileFilter;

import TestSuiteBase.SuiteBase;

public class PDFFileLocation extends SuiteBase {

	public static File LossRunReportFileLocation()
	
	
	
	{
		 File theNewestFile = null;
 	    File dir = new File("C:\\Users\\ukumar1\\Downloads");
 	    
 	    FileFilter fileFilter = new WildcardFileFilter("LossRunReport*." + "pdf");
 	    File[] files = dir.listFiles(fileFilter);

 	    if (files.length > 0) {
 	        /** The newest file comes first **/
 	        Arrays.sort(files, LastModifiedFileComparator.LASTMODIFIED_REVERSE);
 	        theNewestFile = files[0];
 	    }
		return theNewestFile;
	}
	public static File PolicyDetailFileLocation(String PolicyNumber)
	{
		 File theNewestFile = null;
 	    File dir = new File("C:\\Users\\ukumar1\\Downloads");
 	    FileFilter fileFilter = new WildcardFileFilter("*"+PolicyNumber+"*" + ".pdf");
 	    File[] files = dir.listFiles(fileFilter);

 	    if (files.length > 0) {
 	        /** The newest file comes first **/
 	        Arrays.sort(files, LastModifiedFileComparator.LASTMODIFIED_REVERSE);
 	        theNewestFile = files[0];
 	    }
		return theNewestFile;
	}
	
	public static File CertificateFileLocation()
	{
		 File theNewestFile = null;
 	    File dir = new File("C:\\Users\\ukumar1\\Downloads");
 	    FileFilter fileFilter = new WildcardFileFilter("CertificateOfInsurance"+"*"+".pdf");
 	    File[] files = dir.listFiles(fileFilter);

 	    if (files.length > 0) {
 	        /** The newest file comes first **/
 	        Arrays.sort(files, LastModifiedFileComparator.LASTMODIFIED_REVERSE);
 	        theNewestFile = files[0];
 	    }
		return theNewestFile;
	}
}
