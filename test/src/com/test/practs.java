package com.test;

import com.excel.lib.util.Xls_Reader;

public class practs {

	public static void main(String[] args) {
		Xls_Reader reader= new Xls_Reader("D:\\workspace\\test\\Excel.xlsx");
		String firstname=reader.getCellData("Sheet1", "firstname", 2);
		System.out.println(firstname);
		

	}

}
