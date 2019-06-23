package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page {
private static WebElement element= null;
public static WebElement link_AccountSetting(WebDriver driver)
{
element = driver.findElement(By.xpath("//div[@id ='userNavigationLabel']"));
return element;
}
public static WebElement link_Logout(WebDriver driver)
{
element = driver.findElement(By.xpath("//span[cotains(text(),'Log Out')]"));
return element;
}

}
