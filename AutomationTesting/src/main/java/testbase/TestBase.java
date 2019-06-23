package testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class TestBase {
	public static Properties prop;
	public static FileInputStream fis;
	public  static WebDriver driver;
	
	public TestBase() {		
	 try {
		fis = new FileInputStream("D:\\Selenium Final\\git\\AutomationTesting\\src\\main\\java\\config\\config.properties");
		 prop = new Properties();
		 prop.load(fis);
	 } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 
	
	
	}

	public static void openBrowser(){
		String BrowserName = prop.getProperty("browser");
		if(BrowserName.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium Final\\git\\AutomationTesting\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}else if (BrowserName.equals("Firefox")){
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium Final\\git\\AutomationTesting\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}else if (BrowserName.equals("Htmlunit")){
					driver = new HtmlUnitDriver();
			
		}
	
		driver.manage().window().maximize();
		
	}
	public static void navigate(){
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
	
}
