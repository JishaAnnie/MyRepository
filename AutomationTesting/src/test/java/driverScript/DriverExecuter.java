package driverScript;
import config.UIActionKeywords;
import testbase.TestBase;
import util.ExcelUtil;
public class DriverExecuter 
{

	public static void main(String[] args) throws Exception 
	{
		TestBase b=new TestBase();
	String sPath ="D:\\Selenium Final\\Learning\\AutomationTesting\\src\\main\\resources\\KeywordActions.xlsx";

	ExcelUtil.setExcelFile(sPath, "KeywordDrivenFW");
	
	for(int iRow=1;iRow<=7;iRow++){
		String sActionKeyword =ExcelUtil.getCellData(iRow, 3);
		if(sActionKeyword.equals("openBrowser")){
			UIActionKeywords.openBrowser();
					}
		else if(sActionKeyword.equals("navigate")){
			UIActionKeywords.navigate();
					}
		else if(sActionKeyword.equals("enterEmail")){
			UIActionKeywords.enterEmail();
					}
		else if(sActionKeyword.equals("enterPassword")){
			UIActionKeywords.enterPassword();
					}
		else if(sActionKeyword.equals("clickLogin")){
			UIActionKeywords.clickLogin();;
					}
		else if(sActionKeyword.equals("applyWait")){
			UIActionKeywords.applyWait();
					}
		else if(sActionKeyword.equals("closeBrowser")){
			UIActionKeywords.closeBrowser();
					}
	}
	}

}
