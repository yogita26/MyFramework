package Pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import FileUtilities.CommonUtilities;
import FileUtilities.PropertiesFile3;
import Keywords_base.Constants_Class;
import Keywords_base.Keywords_base_class;

	public class HomePage extends PropertiesFile3 {
		@FindBy(xpath="//span[@class='nav-sprite nav-logo-base']")
		WebElement homePageLogo;
		
		@FindBy(xpath="//a[@id='nav-link-yourAccount']")
		WebElement hello_SignIn;
		
		@FindBy(xpath="//span[@class='nav-action-inner']")
		WebElement signInButton;
		//@Test(priority=1)
		public void showSubMenu(){
			String value=PropertiesFile3.readpropertyFile(Constants_Class.path,"YOURORDERS");
		   	Keywords_base_class.mouseOver(CommonUtilities.splitLocator(value)[0],CommonUtilities.splitLocator(value)[1]);
		    
			}
		
		public LoginPage click_SignIn() {
			String value=PropertiesFile3.readpropertyFile(Constants_Class.path, "SIGNIN");
		    Keywords_base_class.click(CommonUtilities.splitLocator(value)[0],CommonUtilities.splitLocator (value)[1]);
		 return new LoginPage();    		
		}

		public Shop_By_Category shopByCategory()
		{
				 String value=PropertiesFile3.readpropertyFile(Constants_Class.path,"SHOP_BY_CATEGORY");
			   	 Keywords_base_class.mouseOver(CommonUtilities.splitLocator(value)[0],CommonUtilities.splitLocator(value)[1]);
		return new Shop_By_Category();	   	
		}
//		@Test(priority=4)
//		public void click_mobile_computer()
//		{
//			 String value=PropertiesFile3.readpropertyFile(Constants_Class.path,"Mobile_computer");
//		   	 Keywords_base_class.mouseOver(CommonUtilities.splitLocator(value)[0],CommonUtilities.splitLocator(value)[1]);
//		}

	}
