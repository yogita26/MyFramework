package Pom.Test;

import java.sql.*;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import FileUtilities.PropertiesFile3;
import Keywords_base.Constants_Class;
import Keywords_base.Keywords_base_class;
import Pom.pages.Create_Account;
import Pom.pages.LoginPage;

public class LoginPageTest extends HomepageTest 
{
LoginPage login=new LoginPage();
//@Test(dependsOnMethods={"verify_signin"},alwaysRun=true)
Create_Account create;

/*@Test(priority=4)
public void verify_enterEmail() throws SQLException {
	login=new LoginPage();
	//Keywords_BaseClass.pageLoadTimeout();
	//Keywords_BaseClass.impliciteWait();
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdata","root","root");
	    String query="select * from users where password=?";
	    PreparedStatement p=con.prepareStatement(query);
	    p.setString(1,"tanush@123");
	    ResultSet s=p.executeQuery();
	    String uname="";
	    while(s.next()) 
	    {
	    	uname=s.getString(1);
	    }
	    login.enterEmail(uname);
	    con.close();
        
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
/*@Test(priority=5)
public void verify_clickOnContinueButton() {
	login.ClickonContinueButton();
}
@Test(priority=6)
  public void centerPassword() {
	login=new LoginPage();
	login.enterPassword("myaccount26*");
}
@Test(priority=7)
  public void dclickOnLoginButton() {
	login.click_OnLoginButton();
}
@AfterSuite
public void tearDown() {
	Keywords_base_class.pageLoadTimeout();
	Keywords_base_class.implicitWait();
	Constants_Class.driver.quit();

}*/
@Test(priority=4)
public void verify_click_on_create()
{
	login.createAccount();
}
}
