package fabricate;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Groups {
	@BeforeClass(groups = {"Smoke", "Regresion"})
	public void login(){
		System.out.println("login succesful");
	}
  @Test(groups = {"Smoke"}, priority=2)
  public void Google() {
	  System.out.println("Google page");
  }
  @Test(groups = {"Sanity"}, priority=1)
  public void Gmail(){
	  System.out.println("Gmail page login");
  }
  @AfterClass(groups = {"Regresion"})
  public void logout(){
	  System.out.println("Logout successful");
  }
}
