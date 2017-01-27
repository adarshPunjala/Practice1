package examples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase7 {
  @BeforeClass
  public void Login() {
	  System.out.println("Login successful");
  }
  @AfterClass
  public void Logout(){
	  System.out.println("Logout successful");
  }
  @Test
  public void Gmail(){
	  System.out.println("Verified Gmail successfully");
  }
  @Test
  public void Google(){
	  System.out.println("Verified Google accounts successfully");
  }
}
