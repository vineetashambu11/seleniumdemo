package Selenium.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cssselector {
	public static void main(String[] args) {
		WebDriver driver;
		driver= SelectDriver.getDriver("CRM");
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("demo");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("demo");
		driver.findElement(By.cssSelector("input[name='login']")).click();
		//driver.findElement(By.linkText("ITINERARY")).click();
}
}