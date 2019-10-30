package Selenium.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchtest1 {
	public static void main(String[] args) {
WebDriver driver;
   System.setProperty("webdriver.chrome.driver","C:\\Users\\a07136_h4.03.27\\Desktop\\drivers\\chromedriver.exe");
driver= new ChromeDriver();
driver.get("https://www.google.com");
System.out.println("opened google");
}
}