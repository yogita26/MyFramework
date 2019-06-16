package Pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Keywords_base.Constants_Class;

public class YourHomePage {
@FindBy(id="nav-Your-amazon-text")
WebElement amazonInLink;

public YourHomePage()
{
	PageFactory.initElements(Constants_Class.driver,this);
}
public AmazonInPage clickOnAmazonInLink()
{
	amazonInLink.click();
	return new AmazonInPage();
	
}
}
