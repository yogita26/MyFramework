package Pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Keywords_base.Constants_Class;

public class Create_Account {
	@FindBy(xpath="//i[@class='a-icon a-icon-logo']")
	WebElement amazone_logo;
	@FindBy(xpath="//input[@id='ap_customer_name']")
	WebElement YourName;
	
	@FindBy(xpath="//input[@id='ap_phone_number']")
	WebElement mobile_No;
	
	@FindBy(name="secondaryLoginClaim")
	WebElement email_id;
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement password;
	
	
	@FindBy(xpath="//input[contains(@id,'continue')]")
	WebElement Continue_Button;
//Initializing the oage object
public Create_Account()
{
PageFactory.initElements(Constants_Class.driver,this);
}
public String validatePageTitle()
{
	return Constants_Class.driver.getTitle();
	
}
public boolean validateAmazonlogo()
{
	return amazone_logo.isDisplayed();
}
public void createAccount(String yname,String mobnumber,String email,String pass)
{
YourName.sendKeys(yname);
mobile_No.sendKeys(mobnumber);
email_id.sendKeys(email);
password.sendKeys(pass);
//Continue_Button.click();
}
}
