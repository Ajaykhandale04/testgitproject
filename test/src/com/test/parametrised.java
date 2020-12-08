package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.lib.util.Xls_Reader;

public class parametrised {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\workspace\\test\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://reg.ebay.in/reg/PartialReg");


		Xls_Reader reader= new Xls_Reader("D:\\workspace\\test\\Excel.xlsx");
	int rowCount=reader.getRowCount("Sheet1");
	//	System.out.println(rowCount);
		
		for(int rowNum=2;rowNum<=rowCount;rowNum++) {
			System.out.println("=====");
		String firstName=reader.getCellData("Sheet1", "firstname", rowNum);
			System.out.println(firstName);
			String lastname=reader.getCellData("Sheet1", "lastname", rowNum);
			System.out.println(lastname);
			
			
			String emailId=reader.getCellData("Sheet1", "emailid", rowNum);
			System.out.println(emailId);
			
			
			String passWord=reader.getCellData("Sheet1", "password", rowNum);
			System.out.println(passWord);
			
			driver.findElement(By.xpath("//*[@id=\"firstname\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys(firstName);
			
			driver.findElement(By.xpath("//*[@id=\"lastname\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys(lastname);
			
			driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(emailId);
			
			driver.findElement(By.xpath("//*[@id=\"PASSWORD\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"PASSWORD\"]")).sendKeys(passWord);
			
			
			
		
			
			
		}
		
		
		
		
		
	}

}
