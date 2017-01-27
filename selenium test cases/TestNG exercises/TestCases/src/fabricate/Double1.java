package fabricate;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Double1 {
	@BeforeClass
	public void login(){
		System.out.println("login selenium");
	}
	@Test
	public void hello(){
		System.out.println("hello selenium");
	}
  @AfterClass
  public void logout(){
	  System.out.println("logout selenium");
  }
  @Test
  public void executions(){
	  System.out.println("executions successful");
  } 
}
