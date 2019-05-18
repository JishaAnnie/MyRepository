package testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testbase.TestBase;
import util.ExcelUtil;

public class DataProviderTest {
		
	@DataProvider(name="Authentication")
	/*public static Object[][] credentials(){
		return new Object[][]
				{
				{"testuser1","love@123"},{"testuser_2","Test@456"}
				};
	}*/
	//Testdata from excel
	public Object[][]Authentication() throws Exception{
		ExcelUtil.setExcelFile("D:\\Selenium Final\\Learning\\AutomationTesting\\src\\test\\resources\\TestData.xlsx", "TestData1");
		Object[][] TestObjData= ExcelUtil.getExcelData();
		return (TestObjData);
		
	}
	
@Test(dataProvider="Authentication")

public static void test(String Username,String Password) throws Exception{
	TestBase t= new TestBase();
	
	t.openBrowser();
	t.navigate();
	t.driver.findElement(By.id("email")).sendKeys(Username);
	t.driver.findElement(By.id("pass")).sendKeys(Password);
	t.driver.findElement(By.xpath("//input[@value ='Log In']")).click();
	t.driver.close();
	
	
	
}
	
	

}
