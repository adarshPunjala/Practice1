package examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase4 {
  @Test(priority = 2)
  public void abc() {
	  Assert.assertEquals("Bike", "Bike");
  }
  @Test(priority = 1, enabled= false)
  public void sid(){
	  Assert.assertEquals("Bike", "car");
  }
  @Test(priority = 3)
  public void zam(){
	  Assert.assertEquals("car", "car");
  }
}
