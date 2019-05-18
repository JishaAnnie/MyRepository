package testcases;

import org.openqa.selenium.By;

import testbase.TestBase;


public class Login {

	public static void main(String[] args) {
		TestBase t1 =new TestBase();
		t1.openBrowser();
		t1.navigate();
		t1.driver.findElement(By.id("email")).sendKeys("jisha");
		t1.driver.findElement(By.id("pass")).sendKeys("Password");
		t1.driver.findElement(By.xpath("//input[@value ='Log In']")).click();
		System.out.println(t1.driver.getTitle());
		t1.driver.close();
		
		

	}

}
