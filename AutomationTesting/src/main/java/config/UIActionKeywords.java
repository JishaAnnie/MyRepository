package config;

import java.io.IOException;

import org.openqa.selenium.By;

import testbase.TestBase;

public class UIActionKeywords extends TestBase {
	
	
	public static void enterEmail(){
	TestBase.driver.findElement(By.id("email")).sendKeys("Username");
	}
	public static void enterPassword(){
	TestBase.driver.findElement(By.id("pass")).sendKeys("Password");	
	}
	public static void clickLogin(){
	TestBase.driver.findElement(By.xpath("//input[@value ='Log In']")).click();	
	}
	public static void applyWait() throws Exception{
		Thread.sleep(2000);
	}
	public static void closeBrowser(){
	TestBase.driver.close();	
	}
}
