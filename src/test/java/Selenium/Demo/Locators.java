package Selenium.Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Locators {

public static void main(String[] args) {
	WebDriver driver;
	driver=SelectDriver.getDriver("CRM");
	driver.manage().window().maximize();
	driver.get("http://newtours.demoaut.com/");
	
	driver.findElement(By.name("userName")).sendKeys("demo");
	System.out.println("enter username");
	driver.findElement(By.name("password")).sendKeys("demo");
	System.out.println("enter password");
	driver.findElement(By.name("login")).click();
	System.out.println("logged into website");
	String a =driver.getTitle();
	System.out.println(a);
	
	//minismise
	Dimension d =new Dimension(300,600);
	driver.manage().window().setSize(d);
	//increase or decrease size chnage position 
	Point p =new Point(300,700);
	driver.manage().window().setPosition(p);
	driver.manage().window().maximize();
	
	List<WebElement> T_link = driver.findElements(By.tagName(a));
	
	int T_size = T_link.size();
	System.out.println("total links"+T_size );
	for(int i= 0;i<T_size;i++)
	{
		String text =  T_link.get(i).getText();
	}
	
	Select Passengers = new Select (driver.findElement(By.name("passCount")));
	Passengers.selectByIndex(2);
}
	
	

	
}