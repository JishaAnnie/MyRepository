package testcases;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testbase.TestBase;

public class FinElementsExample {

	public static void main(String[] args) {
		TestBase t2 =new TestBase();
		t2.openBrowser();
		t2.navigate();	
		List <WebElement> elements  = t2.driver.findElements(By.tagName("a"));
		for(WebElement e:elements){
			
		System.out.println(e.getText());
		System.out.println(e.getAttribute("href"));
		}
		t2.driver.close();
	
	}

}
