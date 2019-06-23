package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage_PF {
	@FindBy(how =How.XPATH,using = "//div[@id ='userNavigationLabel']")
	public WebElement link_AccountSetting;
	
	@FindBy(how =How.XPATH,using = "//span[contains(text(),'Log Out')]")
	public WebElement link_Logout;
	
	
}
