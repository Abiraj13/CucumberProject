package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.collect.Table.Cell;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static void browserOpen() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\SeleniumPratices\\MavenProject1\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	public static void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	public static void urlLaunch(String url) {
		driver.get(url);
	}
	public static void maxmizeScreen() {
		driver.manage().window().maximize();
	}
	public static void sendKeys(WebElement element, String data) {
		element.sendKeys(data);
	}
	public static void clickElement(WebElement element) {
		element.click();
	}
	public static void submitElement (WebElement element) {
		element.submit();
	}
	public static void closeBrowser() {
		driver.close();
	}
	public static void clearBrowser(WebElement element) {
		element.clear();
	}
	public static WebElement findElementId(String id) {
		return driver.findElement(By.id(id));
	}
	
	public static WebElement findElementName(String name) {
		return driver.findElement(By.name(name));
	}
	public static WebElement findElementXpath(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}
	public static List<WebElement> findElementsXpath(String xpath) {
		return driver.findElements(By.xpath(xpath));
	}
	public static void selectMulipleChoice(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByVisibleText(value);	
	}
	public static void mousehover(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
	}
	public static String getTextMethod(WebElement element) {
		String  ac= element.getText();
		System.out.println(ac);
		return ac;
	}
//	public static String getTextMethod(WebElement element) {
//		String  ac= element.getText();
//		String ch = ac;
//		String dcount = "";
//		for(int i = 0; i<ch.length(); i++) {
//			char amt = ch.charAt(i);
//			if(Character.isDigit(amt)) {
//				dcount=dcount+amt;
//			}
//			
//			}
//		System.out.println(dcount);
//		return ac;
//	}
	public static void passing() {
		
			
		}
		

	public static void getAttributeMethod(WebElement element) {
		String ac = element.getAttribute("value");
		System.out.println(ac);
	}
	public static void alert() {
		driver.switchTo().alert().accept();
	}
	public static void jsGetAttribute(String attrName,WebElement element){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String value=(String)js.executeScript("return arguments[0].getAttribute('"+attrName+"')", element);
		System.out.println(value);
		}
	public static void jsGetText(String attrName,WebElement element){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String value=(String)js.executeScript("return arguments[0].getText()", element);
		System.out.println(value);
		}
	public static void JSexcute1() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy('0', '500')");
	}
	public static void JSexcute(WebElement text) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", text);
	}
	public static void sleep(int data) throws InterruptedException {
		Thread.sleep(data);
	}
	public static void windowHandles() {
		String parent = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		for(String window: windows) {
			if(!parent .equals(window)) {
				driver.switchTo().window(window);
	}
		}
	}
	public static void simpleAlert() {
		driver.switchTo().alert().accept();
	}
	
	public static void confirmAlert(String options) {
		switch(options) {
		case "accept":
			driver.switchTo().alert().accept();
			break;
		
		case "dismiss":
			driver.switchTo().alert().dismiss();
			break;
		}	
		
	}
	
	public static void promptAlert(String data) {
		Alert element = driver.switchTo().alert();
		element.sendKeys(data);
		element.accept();
	}
}
//	public static void excelWrite() {
//		try {
//			File f = new File("C:\\Users\\ADMIN\\SeleniumPratices\\ExcelWrite\\src\\test\\resources\\TestData.xlsx");
//			FileInputStream fis = new FileInputStream(f); 
//			Workbook wb = new XSSFWorkbook(fis);
//			Sheet sheet = wb.createSheet("Abiraj");
//			Row row = sheet.createRow(0);
//			Cell cell= row.createCell(0);
//			cell.setCellValue("Java");
//			FileOutputStream fos = new FileOutputStream(f);
//			wb.write(fos);
//			System.out.println("message");
//		}
//		catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}catch(IOException e) {
//			e.printStackTrace();
//			
//		}
//	}

//	public static String[][]  dataProviderreuse() {
//		// file read
//		String[][] twodimensionarray=null;
//		String value = null;
//				try {
//					// file -> locate
//					File f = new File("C:\\Users\\ADMIN\\SeleniumPratices\\dataprovider\\src\\test\\resources\\Login data.xlsx");
//					FileInputStream fis = new FileInputStream(f);
//					// workbook interface
//					Workbook wb = new XSSFWorkbook(fis);
//					Sheet sheet = wb.getSheet("Sheet1");
//					int totalnumberofrows = sheet.getPhysicalNumberOfRows();
//					System.out.println(totalnumberofrows);
//					int totalNumberofCells = sheet.getRow(0).getPhysicalNumberOfCells();
//					System.out.println(totalNumberofCells);
//					// index-> Value
//				twodimensionarray= new String[totalnumberofrows-1][totalNumberofCells];	
//				//4
//				for (int i = 1; i <totalnumberofrows; i++) {
//					Row row = sheet.getRow(i);
//					for (int j = 0; j < totalNumberofCells-1; j++) {
//						Cell cell = row.getCell(j);
//						CellType type = cell.getCellType();
//						if(type==CellType.STRING) {
//							 value = cell.getStringCellValue();
//							 System.out.println(value);
//						}else if (DateUtil.isCellDateFormatted(cell)) {
//								Date dateCellValue = cell.getDateCellValue();
//								SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yy");
//								value= sf.format(dateCellValue);
//								System.out.println(value);
//							}else if (type==CellType.NUMERIC){
//								double numericCellValue = cell.getNumericCellValue();
//								long l = (long)numericCellValue;
//								value = String.valueOf(l);
//								System.out.println(value);
//							}
//							twodimensionarray[i-1][j]=value;
//						}	
//					}	
//				} catch (FileNotFoundException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (Exception e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				return twodimensionarray;
//				
//				
//	}
	
	




