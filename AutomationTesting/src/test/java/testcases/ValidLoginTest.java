package testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_PF;
import pages.Home_Page;
import pages.LoginPage_PF;
import pages.Login_Page;
import testbase.TestBase;


public class ValidLoginTest {
	
@BeforeTest
public void Btest(){
TestBase t2 =new TestBase();
TestBase.openBrowser();
TestBase.navigate();	
}
@Test
public void logintest() throws AWTException{
	
//POM
/*Login_Page.txtbx_UserName(TestBase.driver).sendKeys("jisha.annie@gmail.com");
Login_Page.txtbx_Password(TestBase.driver).sendKeys("gjgjg");
Login_Page.btn_Login(TestBase.driver).click();
System.out.println("Loggedin successfully");
TestBase.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
Home_Page.link_AccountSetting(TestBase.driver).click();
Home_Page.link_Logout(TestBase.driver).click();*/
	
//Page Factory 
LoginPage_PF Loginpage =PageFactory.initElements(TestBase.driver, LoginPage_PF.class);
HomePage_PF Homepage =PageFactory.initElements(TestBase.driver, HomePage_PF.class);


Loginpage.txtbx_UserName.sendKeys("jisha.annie@gmail.com");
Loginpage.txtbx_Password.sendKeys("Vavachy@143");
Loginpage.btn_Login.click();
System.out.println("Loggedin");
TestBase.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
Robot r = new Robot();
r.keyPress(KeyEvent.VK_TAB);
r.keyPress(KeyEvent.VK_TAB);

r.keyPress(KeyEvent.VK_ENTER);
Homepage.link_AccountSetting.click();
TestBase.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
Homepage.link_Logout.click();









}


}
