package Pom.pages;

import org.testng.annotations.Test;

import FileUtilities.CommonUtilities;
import FileUtilities.PropertiesFile3;
import Keywords_base.Constants_Class;
import Keywords_base.Keywords_base_class;

public class Your_orders {
@Test(groups="YourOrder",dependsOnMethods="your_Orders")
public void sign_In()
{
		 String value=PropertiesFile3.readpropertyFile(Constants_Class.path,"SIGNIN");
	   	 Keywords_base_class.mouseOver(CommonUtilities.splitLocator(value)[0],CommonUtilities.splitLocator(value)[1]);
	   	
}
	}
