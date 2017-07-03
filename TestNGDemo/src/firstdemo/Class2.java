package firstdemo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class2 {
  @Test
  public void f() {
	  System.out.println("Test of class 2");
  }
   @BeforeTest
  public void beforeTest() {
	  System.out.println("Class2 beforetest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Class2 aftertest");
  }

}
