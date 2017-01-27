package examples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameters {
  @Test
  @Parameters("test1")
  public void f(String test1) {
	  System.out.println(test1);
  }
}
