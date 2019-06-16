package Pom.Test;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import FileUtilities.PropertiesFile3;
import Keywords_base.Constants_Class;
import Keywords_base.Keywords_base_class;
import Pom.pages.HomePage;
import Pom.pages.LoginPage;

	public class HomepageTest extends PropertiesFile3 {
		  static Logger log=Logger.getLogger(HomepageTest.class);

		HomePage home;
		LoginPage login;

		//@BeforeSuite
		public void setUp() {
			initialization();
			home = new HomePage();
		}
		//@Test(priority=1)
		public void homePageTitleTest() {
			String title =Keywords_base_class.getPageTitle();
					Assert.assertEquals(title,
		"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		log.info("homePageTitleTest:VerifyPageTitle Passed");
		}
		
		//@Test(priority=2)
		public void verify_Your_Order()
		{
			home.showSubMenu();
		}
 /* @Test(priority=2)
		public void homePageLogoTest() {
			boolean flag = Keywords_base_class.verifyPageLogo();
			Assert.assertTrue(flag);
		}
		public void showSubMenu() {
			home.showSubMenu();
		}
		/*public void signInTest() {
			login=home.click_SignIn();
		}*/
		 //@Test(priority=3)
		public void verify_signin()
		{
			 
			home.click_SignIn();
			String str=Keywords_base_class.getPageTitle();
		    System.out.println(str);
		    Assert.assertEquals(str,"Amazon Sign In");
		    
		}
		/*@Test(priority=2)
		public void verifyShopByCategory()
		{
		home.shopByCategory();	
		}
		/*@AfterSuite
		public void close() {
			Constants_Class.driver.quit();
		}
		*/
	}
	
