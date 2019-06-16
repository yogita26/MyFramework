package Pom.Test;

import java.util.ArrayList;
import java.util.Set;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Keywords_base.Constants_Class;
import Pom.pages.Shop_By_Category;

public class Shop_By_catest 
{
Shop_By_Category shop;
@BeforeMethod
public void intialze_shop_by_category()
{
	shop=new Shop_By_Category();
}
@Test(priority=3)
public void verify_click_on_mobile_computer()
{
shop.click_mobile_computer();
shop.allmobiephones();
}
@DataProvider(name="mobile")
@Test(priority=4)
public String[] verify_click_on_Redmi()
{
shop.selectMobile();
String[] parentWindoHandle=new String[1];
ArrayList<String>newTab=new ArrayList<String>(Constants_Class.driver.getWindowHandles());
Constants_Class.driver.switchTo().window(newTab.get(0));
Constants_Class.driver.close();
Constants_Class.driver.switchTo().window(newTab.get(1));
parentWindoHandle[0]=Constants_Class.driver.getWindowHandle();
return parentWindoHandle;
}
@Test(priority=5,dataProvider="mobile")
public void Click_On_detail(String parentWindoHandle)
{
  shop.clickOndetails();
   Set<String>allwindows=Constants_Class.driver.getWindowHandles();
   for(String child:allwindows)
   {
	   if(!parentWindoHandle.equals(child))
	   {
		  Constants_Class.driver.switchTo().window(child);
	      shop.clicknextyour_orders();
	   }
   }
}

}
