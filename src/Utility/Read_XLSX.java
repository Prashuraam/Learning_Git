//Author : Sujyont Kumar Giri :- Sr. Quality Analyst
package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.common.usermodel.HyperlinkType;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFHyperlink;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;





public class Read_XLSX {	
	public  String filelocation;
	public  FileInputStream ipstr = null;
	public  FileOutputStream opstr =null;
	private XSSFWorkbook wb = null;
	private XSSFSheet ws = null;	
	
	public Read_XLSX(String filelocation) {		
		this.filelocation=filelocation;
		try {
			ipstr = new FileInputStream(filelocation);
			wb = new XSSFWorkbook(ipstr);
			ws=wb.getSheetAt(0);
			ipstr.close();
		} catch (Exception e) {			
			e.printStackTrace();
		} 
		
	}
	
	//To retrieve No Of Rows from .xlsx file's sheets.
	public int retrieveNoOfRows(String wsName){		
		int sheetIndex=wb.getSheetIndex(wsName);
		if(sheetIndex==-1)
			return 0;
		else{
			ws = wb.getSheetAt(sheetIndex);
			int rowCount=ws.getLastRowNum()+1;		
			return rowCount;		
		}
	}
	
	//To retrieve No Of Columns from .xlsx file's sheets.
	public int retrieveNoOfCols(String wsName){
		int sheetIndex=wb.getSheetIndex(wsName);
		if(sheetIndex==-1)
			return 0;
		else{
			ws = wb.getSheetAt(sheetIndex);
			int colCount=ws.getRow(0).getLastCellNum();			
			return colCount;
		}
	}
	
	//To retrieve SuiteToRun and CaseToRun flag of test suite and test case.
	public String retrieveToRunFlag(String wsName, String colName, String rowName){
		
		int sheetIndex=wb.getSheetIndex(wsName);
		if(sheetIndex==-1)
			return null;
		else{
			int rowNum = retrieveNoOfRows(wsName);
			int colNum = retrieveNoOfCols(wsName);
			int colNumber=-1;
			int rowNumber=-1;			
			
			XSSFRow Suiterow = ws.getRow(0);				
			
			for(int i=0; i<colNum; i++){
				if(Suiterow.getCell(i).getStringCellValue().equals(colName.trim())){
					colNumber=i;					
				}					
			}
			
			if(colNumber==-1){
				return "";				
			}
			
			
			for(int j=0; j<rowNum; j++){
				XSSFRow Suitecol = ws.getRow(j);				
				if(Suitecol.getCell(0).getStringCellValue().equals(rowName.trim())){
					rowNumber=j;	
				}					
			}
			
			if(rowNumber==-1){
				return "";				
			}
			
			XSSFRow row = ws.getRow(rowNumber);
			XSSFCell cell = row.getCell(colNumber);
			if(cell==null){
				return "";
			}
			String value = cellToString(cell);
			return value;			
		}			
	}
	
	//To retrieve DataToRun flag of test data.
	public String[] retrieveToRunFlagTestData(String wsName, String colName){
		
		int sheetIndex=wb.getSheetIndex(wsName);
		if(sheetIndex==-1)
			return null;
		else{
			int rowNum = retrieveNoOfRows(wsName);
			int colNum = retrieveNoOfCols(wsName);
			int colNumber=-1;
					
			
			XSSFRow Suiterow = ws.getRow(0);				
			String data[] = new String[rowNum-1];
			for(int i=0; i<colNum; i++){
				if(Suiterow.getCell(i).getStringCellValue().equals(colName.trim())){
					colNumber=i;					
				}					
			}
			
			if(colNumber==-1){
				return null;				
			}
			
			for(int j=0; j<rowNum-1; j++){
				XSSFRow Row = ws.getRow(j+1);
				if(Row==null){
					data[j] = "";
				}
				else{
					XSSFCell cell = Row.getCell(colNumber);
					if(cell==null){
						data[j] = "";
					}
					else{
						String value = cellToString(cell);
						data[j] = value;	
					}	
				}
			}
			
			return data;			
		}			
	}
	
	//To retrieve test data from test case data sheets.
	public Object[][] retrieveTestData(String wsName){
		int sheetIndex=wb.getSheetIndex(wsName);
		if(sheetIndex==-1)
			return null;
		else{
				int rowNum = retrieveNoOfRows(wsName);
				int colNum = retrieveNoOfCols(wsName);
		
				Object data[][] = new Object[rowNum-1][colNum-2];
		
				for (int i=0; i<rowNum-1; i++){
					XSSFRow row = ws.getRow(i+1);
					for(int j=0; j< colNum-2; j++){					
						if(row==null){
							data[i][j] = "";
						}
						else{
							XSSFCell cell = row.getCell(j);	
					
							if(cell==null){
								data[i][j] = "";							
							}
							else{
								
								cell.setCellType(Cell.CELL_TYPE_STRING);
								String value = cellToString(cell);
								data[i][j] = value;						
							}
						}
					}				
				}			
				return data;		
		}
	
	}		
	
	
	public static String cellToString(XSSFCell cell){
		int type;
		Object result;
		type = cell.getCellType();			
		switch (type){
			case 0 :
				result = cell.getNumericCellValue();
				break;
				
			case 1 : 
				result = cell.getStringCellValue();
				
				break;
				
			default :
				throw new RuntimeException("Unsupportd cell.");			
		}
		return result.toString();
	}
	
	//To write result In test data and test case list sheet.
	public boolean writeResult(String wsName, String colName, int rowNumber, String Result){
		try{
			int sheetIndex=wb.getSheetIndex(wsName);
			if(sheetIndex==-1)
				return false;			
			int colNum = retrieveNoOfCols(wsName);
			int colNumber=-1;
					
			
			XSSFRow Suiterow = ws.getRow(0);			
			for(int i=0; i<colNum; i++){				
				if(Suiterow.getCell(i).getStringCellValue().equals(colName.trim())){
					colNumber=i;					
				}					
			}
			
			if(colNumber==-1){
				return false;				
			}
			
			XSSFRow Row = ws.getRow(rowNumber);
			XSSFCell cell = Row.getCell(colNumber);
			if (cell == null)
		        cell = Row.createCell(colNumber);			
			if(colName.contentEquals("ScreenShotLink"))
			{
				 CreationHelper createHelper = wb.getCreationHelper();
			      XSSFCellStyle hlinkstyle = wb.createCellStyle();
			      XSSFFont hlinkfont = wb.createFont();
			      hlinkfont.setUnderline(XSSFFont.U_SINGLE);
			      hlinkfont.setColor(HSSFColor.BLUE.index);
			      hlinkstyle.setFont(hlinkfont);
			     cell.setCellValue("File Link");
			    	      XSSFHyperlink   link = (XSSFHyperlink)createHelper.createHyperlink(HyperlinkType.FILE);
			    	      link.setAddress(Result);
			    	      cell.setHyperlink(link);
			    	      cell.setCellStyle(hlinkstyle);
			}
			else{
				cell.setCellValue(Result);
			}
			
			
			opstr = new FileOutputStream(filelocation);
			wb.write(opstr);
			opstr.close();
			
			
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	//To write result In test suite list sheet.
	public boolean writeResult(String wsName, String colName, String rowName, String Result){
		try{
			int rowNum = retrieveNoOfRows(wsName);
			int rowNumber=-1;
			int sheetIndex=wb.getSheetIndex(wsName);
			if(sheetIndex==-1)
				return false;			
			int colNum = retrieveNoOfCols(wsName);
			int colNumber=-1;
					
			
			XSSFRow Suiterow = ws.getRow(0);			
			for(int i=0; i<colNum; i++){				
				if(Suiterow.getCell(i).getStringCellValue().equals(colName.trim())){
					colNumber=i;					
				}					
			}
			
			if(colNumber==-1){
				return false;				
			}
			
			for (int i=0; i<rowNum-1; i++){
				XSSFRow row = ws.getRow(i+1);				
				XSSFCell cell = row.getCell(0);	
				cell.setCellType(Cell.CELL_TYPE_STRING);
				String value = cellToString(cell);	
				if(value.equals(rowName)){
					rowNumber=i+1;
					break;
				}
			}		
			
			XSSFRow Row = ws.getRow(rowNumber);
			XSSFCell cell = Row.getCell(colNumber);
			if (cell == null)
		        cell = Row.createCell(colNumber);			
			
			cell.setCellValue(Result);
			
			opstr = new FileOutputStream(filelocation);
			wb.write(opstr);
			opstr.close();
			
			
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}
	//````````````````Read Summary Report```````````````````
		public static ArrayList<ArrayList<Object>> readSummaryReport(File file){
			  
			  ArrayList<ArrayList<Object>> list = new ArrayList<ArrayList<Object>>();
			  int maxDataCount =0;
			  try{
			      // String file = new FileInputStream(file);
			      
			      // Create Workbook instance holding reference to .xlsx file
			      XSSFWorkbook workbook = new XSSFWorkbook(file);

			      // Get first/desired sheet from the workbook
			      XSSFSheet sheet = workbook.getSheetAt(0);

			      // Iterate through each rows one by one
			      Iterator<Row> rowIterator = sheet.iterator();
			     
			      while (rowIterator.hasNext()) {
			    	  
			          Row row = rowIterator.next();
			          
			          //Skip the first row beacause it will be header
			          if (row.getRowNum() == 0) {
			     
			              maxDataCount = row.getLastCellNum();
			              continue;
			     }
			    
			    /**
			     * if row is empty then break the loop,do not go further
			     */
			    if(isRowEmpty(row,maxDataCount)){
			     //Exit the processing
			     break;
			    }
			    
			    ArrayList<Object> singleRows = new ArrayList<Object>();
			    
			    // For each row, iterate through all the columns
			    for(int cn=0; cn<maxDataCount; cn++) {

			        Cell cell = row.getCell(cn, Row.CREATE_NULL_AS_BLANK);
			     
			        switch (cell.getCellType()) {
			         
			            case Cell.CELL_TYPE_NUMERIC:
			        
			                                         if(DateUtil.isCellDateFormatted(cell)){
			                                             singleRows.add( new SimpleDateFormat("yyyy-MM-dd").format(cell.getDateCellValue()) );
			                                         }else
			                                             singleRows.add(cell.getNumericCellValue());
			                                         break;
			        
			            case Cell.CELL_TYPE_STRING:
			                                         singleRows.add(cell.getStringCellValue());
			                                         break;
			      
			            case Cell.CELL_TYPE_BLANK : singleRows.add(null);break;
			      
			            default : singleRows.add(cell.getStringCellValue());
			        }

			     }
			     list.add(singleRows);
			   }
			   //file.close();
			   workbook.close();   
			  } catch (Exception e) {  e.printStackTrace();}
			  
			  return list;
			 }

			 public static boolean isRowEmpty(Row row,int lastcellno) {
			     for (int c = row.getFirstCellNum(); c < lastcellno; c++) {
			         Cell cell = row.getCell(c,Row.CREATE_NULL_AS_BLANK);
			         if (cell != null && cell.getCellType() != Cell.CELL_TYPE_BLANK)
			             return false;
			     }
			     return true;
			 }
	//````````````````Write Excution Status Report````````````````````````
			public  static void writeSummaryReport(String userID,String Region, String LOBs,String policy_ClaimNo,String startTime,String endTime,String summaryStatus,String loginTime,String notificationsTime,
					String tasksTime,String notesTime, String partySearchTime,String specificPolicySearchTime,
					String policySearchResponseTime, String brokerInfoTime,String policyInfoTime, String policyDetailTime, 
					String namedInsuredTime,String manuscriptEndTime,String pricingTime, String attachmentDetailTime,
					String dashBoardTime,String totalLobTime)
			{
					try {
						String computerName=InetAddress.getLocalHost().getHostName();
						//String userName=System.getProperty("user.name");
						Date date = new Date();
					    String strDateFormat = "zzz";
					    SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
						String timeZone=sdf.format(date);
						String excelFilePath = System.getProperty("user.dir")+"//ExcelFiles//Execution_Status.xlsx";
						FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
						Workbook workbook = WorkbookFactory.create(inputStream);
						Sheet sheet = workbook.getSheetAt(0);
						XSSFFont font = (XSSFFont) workbook.createFont();
						font.setBold(true);
						CellStyle style = workbook.createCellStyle();
					    style.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
					    style.setFillPattern(CellStyle.SOLID_FOREGROUND);
						
						//sheet.getRow(0).createCell(1).setCellValue(computerName);//Write ComputerName
						//sheet.getRow(1).createCell(1).setCellValue(userID);//Write Application UserName
						//sheet.getRow(2).createCell(1).setCellValue(timeZone);//Write Time Zone
						
						Object[][] bookData = {{computerName,userID,timeZone, Region,LOBs,policy_ClaimNo,startTime,endTime,summaryStatus,
							loginTime,notificationsTime,tasksTime,notesTime,  partySearchTime, specificPolicySearchTime,
							 policySearchResponseTime,  brokerInfoTime, policyInfoTime,  policyDetailTime, 
							 namedInsuredTime, manuscriptEndTime, pricingTime,  attachmentDetailTime,
							 dashBoardTime, totalLobTime}};
						
						int rowCount = sheet.getLastRowNum();
						
						for (Object[] aBook : bookData) {
							Row row = sheet.createRow(++rowCount);
							int columnCount = -1;
							for (Object field : aBook) {
								
								Cell cell = row.createCell(++columnCount);
								
								if (field instanceof String) {
									cell.setCellValue((String) field);
									if(columnCount==3 || columnCount==4 || columnCount==8 || columnCount==24){
									cell.setCellStyle(style);
									style.setFont(font);
									}
								} else if (field instanceof Integer) {
									cell.setCellValue((Integer) field);
								}
								
								sheet.autoSizeColumn(columnCount);
							}

						}
						
						inputStream.close();

						FileOutputStream outputStream = new FileOutputStream(System.getProperty("user.dir")+"//ExcelFiles//Execution_Status.xlsx");
						workbook.write(outputStream);
						workbook.close();
						outputStream.close();
						
					} catch (IOException | EncryptedDocumentException
							| InvalidFormatException ex) {
						ex.printStackTrace();
					}
				}
			//````````````````Write Summary Report````````````````````````
			public  static void writeEmailSummaryReport(String environment,String Username,String Region, String LOBs, String policy_ClaimNo, String summaryStatus){
				try {
					String excelFilePath = System.getProperty("user.dir")+"//ExcelFiles//Summary.xlsx";
					FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
					Workbook workbook = WorkbookFactory.create(inputStream);
					Sheet sheet = workbook.getSheetAt(0);
					
					Object[][] bookData = {{ environment, Username, Region,  LOBs,  policy_ClaimNo, summaryStatus}};

					int rowCount = sheet.getLastRowNum();

					for (Object[] aBook : bookData) {
						Row row = sheet.createRow(++rowCount);

						int columnCount = 0;
						
						Cell cell = row.createCell(columnCount);
						cell.setCellValue(rowCount);
						
						for (Object field : aBook) {
							cell = row.createCell(++columnCount);
							if (field instanceof String) {
								cell.setCellValue((String) field);
							} else if (field instanceof Integer) {
								cell.setCellValue((Integer) field);
							}
						}

					}

						inputStream.close();

						FileOutputStream outputStream = new FileOutputStream(System.getProperty("user.dir")+"//ExcelFiles//Summary.xlsx");
						workbook.write(outputStream);
						workbook.close();
						outputStream.close();} catch (IOException | EncryptedDocumentException
							| InvalidFormatException ex) {
						ex.printStackTrace();
					}
				}
}
