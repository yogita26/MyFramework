package Keywords_base;

import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;


public class Keywords_base_class {

	public static void openBrowser(String browserName) {
        switch (browserName) {
        case "Chrome":
            WebDriverManager.chromedriver().setup();
            Constants_Class.driver = new ChromeDriver();
            break;
        case "Firefox":
            WebDriverManager.firefoxdriver().setup();
            Constants_Class.driver = new FirefoxDriver();
            break;
        case "IE":
            WebDriverManager.iedriver().setup();
            Constants_Class.driver = new InternetExplorerDriver();
            break;
        case "Opera":
            WebDriverManager.operadriver().setup();
            Constants_Class.driver = new OperaDriver();
            break;
        default:
            System.out.println("Invalid browser name");
            break;
        }

    }// End of open browser

    /*
     * This method opens the specified url
     *
     * @parameter is url in form of @String
     */

    public static void openUrl(String url) {
    	Constants_Class.driver.get(url);
    }

    public static WebElement getWebElement(String locatorType, String locatorValue) {
        switch (locatorType) {
        case "xpath":
            Constants_Class.element = Constants_Class.driver.findElement(By.xpath(locatorValue));
            break;
        case "id":
        	Constants_Class.element =Constants_Class.driver.findElement(By.id(locatorValue));
            break;
        case "name":
        	Constants_Class.element = Constants_Class.driver.findElement(By.name(locatorValue));
            break;
        case "linkText":
        	Constants_Class.element = Constants_Class.driver.findElement(By.linkText(locatorValue));
            break;
        case "partialLinkText":
        	Constants_Class.element = Constants_Class.driver.findElement(By.partialLinkText(locatorValue));
            break;
         case "cssSelector":
        	 Constants_Class.element = Constants_Class.driver.findElement(By.cssSelector(locatorValue));
           
        	 break;
        case "className":
        	Constants_Class.element = Constants_Class.driver.findElement(By.className(locatorValue));
            break;
        default:
            System.out.println("Invalid Selector");
            break;
        }
        return Constants_Class.element;
    }

    public static void enterText(String text) {
    	Constants_Class.element.sendKeys(text);
    }// End of enter text

    public static void click(String locatorType, String locatorValue) {
        // TODO Auto-generated method stub
        getWebElement(locatorType, locatorValue).click();
    }
    
    public static void  mouseOver(String locatorType, String locatorValue)
    {
    	
    	Constants_Class.element=getWebElement(locatorType, locatorValue);
    	Constants_Class.a=new Actions(Constants_Class.driver);
    Constants_Class.a.moveToElement(Constants_Class.element).build().perform();
    }
    public static void implicitWait(){
    	Constants_Class.driver.manage().timeouts().implicitlyWait(Constants_Class.implicitWait,TimeUnit.SECONDS);
    }
    public static void pageLoadTimeout()
    {
    	Constants_Class.driver.manage().timeouts().pageLoadTimeout(Constants_Class.pageLoadTimeout,TimeUnit.SECONDS);

    }
    public static void maxsize()
    {
    	Constants_Class.driver.manage().window().maximize();
    }
    public static String getPageTitle() {
		return Constants_Class.driver.getTitle();
	}
    public static boolean verifyPageLogo() {
		return Constants_Class.verifyPageLogo.isDisplayed();
	}
    public static void quit()
    {
    	Constants_Class.driver.quit();
    }

}
