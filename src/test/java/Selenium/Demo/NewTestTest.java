package Selenium.Demo;

import org.testng.annotations.Test;

public class NewTestTest {

  @Test(groups= {"Sanity"})
  public void AddcartTest() {
    System.out.println("Addcart");
  }

  @Test(groups= {"Sanity"})
  public void closureTest() {
	  System.out.println("closure");
  }

  @Test(groups= {"Sanity"})
  public void fTest() {
	  System.out.println("ftest");
  }

  @Test(groups= {"Sanity"})
  public void loginTest() {
    throw new RuntimeException("Test not implemented");
  }
}
