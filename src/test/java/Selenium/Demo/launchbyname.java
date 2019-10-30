package Selenium.Demo;

import org.openqa.selenium.WebDriver;

public class launchbyname {

	public static void main(String[] args) {
		WebDriver driver5;
		driver5 =SelectDriver.getDriver("ff");
		driver5.get("https://google.com");
	}
	
	
}
