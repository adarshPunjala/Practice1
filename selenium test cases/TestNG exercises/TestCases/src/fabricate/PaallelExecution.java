package fabricate;

import org.testng.annotations.Test;

public class PaallelExecution {
  @Test
  public void testCase1() {
	  long id = Thread.currentThread().getId();
	  System.out.println(id);
  }
  @Test
  public void testCase2(){
	  long a = Thread.currentThread().getId();
	  System.out.println(a);
  }
  @Test
  public void testCase3(){
	  long b= Thread.currentThread().getId();
	  System.out.println(b);
  }
}
