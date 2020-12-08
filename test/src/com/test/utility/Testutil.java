package com.test.utility;

import java.util.ArrayList;

import com.excel.lib.util.Xls_Reader;

public class Testutil {
	static Xls_Reader reader;
	public static ArrayList<Object[]>getDataFromExcel(){
		ArrayList<Object[]> myData= new ArrayList<Object[]>();
		try {
			reader= new Xls_Reader("D:\\workspace\\test\\Excel.xlsx");
			
		}catch(Exception e) {
			
			
			e.printStackTrace();
		}
		
		for(int rowNum=2;rowNum<=reader.getRowCount("Sheet1");rowNum++) {
			
			
		
			
		    String firstName=reader.getCellData("Sheet1", "firstname", rowNum);
			
			String lastname=reader.getCellData("Sheet1", "lastname", rowNum);
			
			String emailId=reader.getCellData("Sheet1", "emailid", rowNum);
	
			String passWord=reader.getCellData("Sheet1", "password", rowNum);
			
		
		Object ob[]= {firstName,lastname,emailId,passWord};
		myData.add(ob)	;
		
	}
		
		return myData;
	}

}
