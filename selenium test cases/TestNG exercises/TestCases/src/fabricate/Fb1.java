package fabricate;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Fb1 {
  @BeforeClass
  public void login(){
	  System.out.println("login successful");
  }
  @AfterClass
  public void logout(){
	  System.out.println("logout successful");
  }
  @Test
  public void addVendor(){
	  System.out.println("Add Vendor successful");
  }
  @Test
  public void AddProduct(){
	  System.out.println("Add Product successful");
  }
  @Test
  public void AddCurrency(){
	  System.out.println("Add Curency successful");
  }
  
  }

