package Selenium.Demo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class NewTest {
  @Test(invocationCount=10,enabled=false)
  public void f() {
	  System.out.println("its in f");
  }
  
  @Test(enabled=false)
  public void login() {
	  System.out.println("its in login");
  }
  @Test
public void closure() {
	System.out.println("its  closing");  
  }
@Test(groups= {"Sanity"})
public void Addcart(){
	System.out.println("sanity addcart");
}
  }


