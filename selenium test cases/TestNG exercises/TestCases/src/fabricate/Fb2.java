package fabricate;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Fb2 {
	@BeforeClass
	  public void login(){
		  System.out.println("login successful");
	  }
	  @AfterClass
	  public void logout(){
		  System.out.println("logout successful");
	  }
	  @Test
	  public void deleteVendor(){
		  System.out.println("delete Vendor successful");
	  }
	  @Test
	  public void deleteProduct(){
		  System.out.println("delete Product successful");
	  }
	  @Test
	  public void deleteCurrency(){
		  System.out.println("delete Curency successful");
	  }
	  
}
