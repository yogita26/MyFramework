package Pom.pages;

import org.testng.annotations.Test;

import FileUtilities.CommonUtilities;
import FileUtilities.PropertiesFile3;
import Keywords_base.Constants_Class;
import Keywords_base.Keywords_base_class;

public class Shop_By_Category {
	public void click_mobile_computer() {
		String value = PropertiesFile3.readpropertyFile(Constants_Class.path,
				"Mobile_computer");
		Keywords_base_class.mouseOver(CommonUtilities.splitLocator(value)[0],
				CommonUtilities.splitLocator(value)[1]);
	}

	public void allmobiephones() {
		String value = PropertiesFile3.readpropertyFile(Constants_Class.path,
				"All_Mobile");
		Keywords_base_class.click(CommonUtilities.splitLocator(value)[0],
				CommonUtilities.splitLocator(value)[1]);
	}

	public void selectMobile() {
		String value = PropertiesFile3.readpropertyFile(Constants_Class.path,
				"Select_Product");
		Keywords_base_class.click(CommonUtilities.splitLocator(value)[0],
				CommonUtilities.splitLocator(value)[1]);
	}

	public void clickOndetails() {
		String value = PropertiesFile3.readpropertyFile(Constants_Class.path,
				"Details");
		Keywords_base_class.click(CommonUtilities.splitLocator(value)[0],
				CommonUtilities.splitLocator(value)[1]);

	}
	public void clicknextyour_orders()
	{String value = PropertiesFile3.readpropertyFile(Constants_Class.path,
			"CkYourorder");
	Keywords_base_class.click(CommonUtilities.splitLocator(value)[0],
			CommonUtilities.splitLocator(value)[1]);

		
	}
}
