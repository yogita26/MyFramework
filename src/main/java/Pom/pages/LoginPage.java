package Pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import FileUtilities.CommonUtilities;
import FileUtilities.PropertiesFile3;
import Keywords_base.Constants_Class;
import Keywords_base.Keywords_base_class;

public class LoginPage extends PropertiesFile3 {
	
	
	 public void createAccount()
	 { 	 
	 String value=PropertiesFile3.readpropertyFile(Constants_Class.path,"CREATE_ACCOUNT"); 
	 Keywords_base_class.click(CommonUtilities.splitLocator(value)[0],CommonUtilities.splitLocator(value)[1]);
	 }
	
	/*@FindBy(xpath = "//h1[contains(text(),'Login')]")
	WebElement LogInLable;

	@FindBy(xpath = "//input[@id='ap_email']")
	WebElement Email;

	@FindBy(xpath = "//input[@class='a-button-input']")
	WebElement continue_button;

	
	@FindBy(xpath ="//input[@id='ap_password']")
	WebElement password;
	
	@FindBy(xpath ="//input[@id='signInSubmit']")
	WebElement Login_button;
	public LoginPage()
	{
		PageFactory.initElements(Constants_Class.driver, this);
	
	}

	public void enterEmail(String emailid) {
		//String value = PropertiesFile3.readpropertyFile(Constants_Class.path,
			//	"Enter_Email");
		//Keywords_base_class.enterText(emailid); 
	  Email.sendKeys(emailid);
	
}
	public void ClickonContinueButton() {
		String value = PropertiesFile3.readpropertyFile(Constants_Class.path,
				"Continue_Button");
		Keywords_base_class.click(CommonUtilities.splitLocator(value)[0],
				CommonUtilities.splitLocator(value)[1]);

	}

	public void enterPassword(String pass) {
//		String value = PropertiesFile3.readpropertyFile(Constants_Class.path,
//				"Enter_password");
//		Keywords_base_class.enterText(pass);
		password.sendKeys(pass);
	}

	public Your_Amazon click_OnLoginButton() {
		String value = PropertiesFile3.readpropertyFile(Constants_Class.path,
				"Sgn_InButton");
		Keywords_base_class.click(CommonUtilities.splitLocator(value)[0],
				CommonUtilities.splitLocator(value)[1]);
  return new Your_Amazon();
	}*/
}
