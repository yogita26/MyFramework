package Pom.Test;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import FileUtilities.CommonUtilities;
import FileUtilities.PropertiesFile3;
import Keywords_base.Constants_Class;
import Keywords_base.Keywords_base_class;
import Pom.pages.Create_Account;
import Pom.pages.HomePage;
import Pom.pages.LoginPage;

public class TestRuner_Class extends PropertiesFile3 {
	
	HomePage home;
		LoginPage login;
		@Test(priority=4)
		public void createAccountTest()
		{  	  
			Create_Account create=new Create_Account();	
			Keywords_base_class.pageLoadTimeout();
			Keywords_base_class.implicitWait();
			create.createAccount("Yogita","8830689350","yogitachaudhari1993@gmail.com","Myamazoeacc*");
		}
}
		
		/*@Test
		public  void verifyPageTitle(){
			String title = Keywords_base_class.verifyPageTitle();
			Assert.assertEquals(title,
			"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
			}
		@Test
		public void verifyLogo()
		{
			boolean flag=Keywords_base_class.verifyPageLogo();
			Assert.assertTrue(flag);
			return amazonelogo.isDisplayd();   
		}
		@Test
		public void showSubMenu() {
   Keywords_base_class.mouseOver(prop.getProperty("YOUR_ORDERS"),"hello_SignIn");
		}
		@Test
		public void signInTest() {
			Keywords_base_class.click(prop.getProperty("SIGN_IN"),prop.getProperty("//span[@id='nav-your-amazon']"));
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//Keywords_base_class.openBrowser("Chrome");
		

  
