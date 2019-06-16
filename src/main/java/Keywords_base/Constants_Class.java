package Keywords_base;

import java.io.File;
import java.io.FileInputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Constants_Class {
	public static  WebDriver driver;
	public static WebElement element;
	public static File file;
	public static FileInputStream fis;
	//public static Ashot ashot;
	public static Actions action;
	//below are all the seperator
	public static String doublehash="##";
	public static String underscore="_";
    public static Actions a;
    public static String path="D:\\Java_Workspace\\FinalKDDFramework\\Input\\Object.Properties";
    public static int pageLoadTimeout=60;
    public static int implicitWait=50;
    public static WebElement verifyPageLogo;


}
