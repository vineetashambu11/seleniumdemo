package Selenium.Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class synchronization {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver =SelectDriver.getDriver("CRM");
	//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
WebDriverWait w1=new WebDriverWait(driver,60);
w1.until(ExpectedConditions.presenceOfElementLocated(By.name("userName")));
	}

}
;