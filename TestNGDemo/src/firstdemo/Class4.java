package firstdemo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class4 {
  @Test
  public void f() {
	  System.out.println("Test of class 4");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Class4 beforetest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Class4 aftertest");
  }

}
