package in.amazon.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	public static WebDriver driver;
	
	public static WebDriver getBrowser(String browserName) throws Exception {
		
		if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", 
				            "E:\\A_Automation\\j\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		}else {
			throw new Exception ("Invalid Browser Name");
		}
		return driver;
		
	}

}
