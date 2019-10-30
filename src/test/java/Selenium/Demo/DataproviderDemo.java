package Selenium.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderDemo {
WebDriver driver;
@Test(dataProvider="dp")
public void login(String s , String n) {
	driver=SelectDriver.getDriver("CRM");
	driver.get("http://newtours.demoaut.com/");
	driver.findElement(By.name("")).sendKeys(s);
	driver.findElement(By.name("")).sendKeys(n);
	driver.findElement(By.name("")).click();
}
@DataProvider
public Object[][]dp(){
	return null;
	//new Object[] {"demo","demo"}
	//new Object[] {"mercury","mercury"}
}
}
