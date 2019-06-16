package FileUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Keywords_base.Constants_Class;
import Keywords_base.Keywords_base_class;

public class PropertiesFile3 {
	public static Properties prop=new Properties();

	public static String readpropertyFile(String path,String key)
	{
		String value=null;
		try
		{
			Constants_Class.fis=new FileInputStream(path);
            prop.load(Constants_Class.fis);
            value=prop.getProperty(key);
		}catch(IOException e){
			System.out.println("unable to read properties file");
		     e.printStackTrace();
		
		}
		return value;
	
		
	}
	//@BeforeTest
	public void initialization()
	{
      Keywords_base_class.openBrowser("Chrome");
	    Keywords_base_class.maxsize();

		String value=PropertiesFile3.readpropertyFile(Constants_Class.path,"URL");
		Keywords_base_class.openUrl(value);
		Keywords_base_class.pageLoadTimeout();
        Keywords_base_class.implicitWait();
		//Keywords_base_class.click(CommonUtilities.splitLocator(value)[0],CommonUtilities.splitLocator (value)[1]);
		/*Constants_Class.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    value=PropertiesFile3.readpropertyFile(Constants_Class.path, "SIGNIN");
	    Keywords_base_class.click(CommonUtilities.splitLocator(value)[0],CommonUtilities.splitLocator (value)[1]);
	     value=PropertiesFile3.readpropertyFile(Constants_Class.path, "Createuramazacc");
	     Keywords_base_class.click(CommonUtilities.splitLocator(value)[0],CommonUtilities.splitLocator (value)[1]);*/
		}
	@AfterSuite
	public static void quitBrowse()
	{
		Keywords_base_class.quit();
		System.out.println("hhih");
	}
}



/*public static String readCon(String key)
{
File src = new File("D:\\Study matrial\\Spring\\SpringFmwork\\BankingDomain\\Configuration\\config.properties");
FileInputStream fis = null;
try {
    fis = new FileInputStream(src);
} catch (FileNotFoundException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}

Properties pro = new Properties();
try {
    pro.load(fis);
} catch (IOException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}

String data =pro.getProperty(key);
return data;
}*/