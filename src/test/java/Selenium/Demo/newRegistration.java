package Selenium.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class newRegistration {
	public static void main(String[] args) {
	WebDriver	driver=	SelectDriver.getDriver("CRM");

	driver.get("http://newtours.demoaut.com/mercuryregister.php");
	
System.out.println("welcoome to registration");
driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("myname");

driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("givelastname");
driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("givelastname");
driver.findElement(By.id("userName")).sendKeys("123@2132.com");
driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("address1");
driver.findElement(By.xpath("//input[@name='city']")).sendKeys("register your city name");


Select s= new Select(driver.findElement(By.name("country")));
s.selectByValue("2");

driver.findElement(By.xpath("//input[@name='email']")).sendKeys("user");
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("pass");
driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("pass");
driver.findElement(By.xpath("//input[@name='register' and @type='image']")).click();
System.out.println("registered");
driver.close();
}
}
