package Selenium.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SelectDriver {
	public static WebDriver getDriver(String name){
		
		if (name.equals("CRM")) {
			 System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
				return new ChromeDriver();
		}
		
		
		else if (name.equals("ie")) {
			 System.setProperty("webdriver.ie.driver","C:\\drivers\\IEDriverServer.exe");
				return new InternetExplorerDriver();
		}
		
		
		else if (name.equals("ff")) {
			 System.setProperty("webdriver.gecko.driver","C:\\drivers\\geckodriver.exe");
				return new FirefoxDriver();
		}
		return null;
	}
	}

