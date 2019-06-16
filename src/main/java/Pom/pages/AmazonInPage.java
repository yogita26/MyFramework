package Pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Keywords_base.Constants_Class;

public class AmazonInPage {
@FindBy(xpath="//span[contains(text(),'Recommended for you, Yogita')]")
WebElement pageText;

public AmazonInPage()
{
	PageFactory.initElements(Constants_Class.driver,this);
	
}
public void getPageText()
{
	String str=pageText.getText();
	System.out.println(str);
}
}
