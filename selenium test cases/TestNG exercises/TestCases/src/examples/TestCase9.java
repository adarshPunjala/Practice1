package examples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase9 {
	@Test
	  public void DeleteGmail() {
		  System.out.println("deleted gmail account");
	  }
	  @Test
	  public void DeleteGoogle(){
		  System.out.println("deleted google account");
	  }
	  @BeforeClass
	  public void login(){
		  System.out.println("login deleted");
	  }
	  @AfterClass
	  public void logout(){
		  System.out.println("logout deleted");
	  }
	}


