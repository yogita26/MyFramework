package Pom.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import junit.framework.Assert;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FileUtilities.PropertiesFile3;
import Keywords_base.Constants_Class;
import Pom.pages.Create_Account;
import Pom.pages.HomePage;
import Pom.pages.LoginPage;

public class CreateAccountTest extends PropertiesFile3 {
	Create_Account create;
	LoginPage login=new LoginPage();
    HomePage home=new HomePage();
	@BeforeMethod
	public void setUp() throws Exception {
		// initialization();
		create = new Create_Account();
		
	}

	/*
	 * @Test public void AmazonPageTitleTest() { String title =
	 * create.validatePageTitle(); Assert.assertEquals(title,
	 * "Amazon Registration"); }
	 * 
	 * @Test public void amazonLogoTest() { boolean flag =
	 * create.validateAmazonlogo(); Assert.assertTrue(flag); }
	 */
	@BeforeMethod
	public void abc()
	{
		home.initialization();
		home.showSubMenu();
		home.click_SignIn();
	    login.createAccount();
	}
	@Test(dataProvider="excle",priority=5) 
	 public void readExcle(String yname,String mobnumber,String email,String pass)
	 {
	 create.createAccount(yname, mobnumber, email, pass);
	 //System.out.println(yname+" "+mobnumber+" "+email+" "+pass); 
	 }
	
	@DataProvider(name="excle")
	public static Object[][]  createaccountTest() throws IOException {
		/*
		 * login=create.createAccount(prop.getProperty("YOUR_NAME"),
		 * prop.getProperty("MOBILE_NUMBER"), prop.getProperty("EMAIL"),
		 * prop.getProperty("PASSWORD"));
		 */
		Object content[][];
		FileInputStream file = new FileInputStream(
				"D:\\Java_Workspace\\FinalKDDFramework\\Input\\Account.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet("Sheet1");
		int rows = sheet.getLastRowNum();
		content = new Object[(sheet.getLastRowNum())-1][sheet.getRow(1)
				.getLastCellNum()];
		Row row;
		System.out.println("total no of rows  " + rows);
		for (int i = 1; i <rows; i++) 
		{
			row = sheet.getRow(i);
			int cells = row.getLastCellNum();
			for (int j = 0; j < cells; j++) 
			{
				Cell cell = row.getCell(j);
				if (cell.getCellTypeEnum().name().equals("NUMERIC")) 
				{
					content[i-1][j] = cell.getNumericCellValue();	
				
				} 
				else if (cell.getCellTypeEnum().name().equals("STRING")) 
				{
					content[i-1][j] = cell.getStringCellValue();	
				
				}	
			}
			System.out.println();
		}
		/*
		 * catch (FileNotFoundException e) {
		 * System.out.println("file not found"); e.printStackTrace(); }
		 */
		return content;
	}
	@AfterMethod
	public void close_browser()
	{
		Constants_Class.driver.close();
	}
}
