package firstdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Class2 {
  @Test
  public void f() {
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Class2 beforeclass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Class2 afterclass");
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
