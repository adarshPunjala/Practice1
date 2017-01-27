package examples;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestCase3 {
  @Test
  public void TestA() {
	  Assert.assertEquals("Gmail", "Gmail");
  }
  @Test
  public void TestC() {
	  Assert.assertEquals("Opera", "Gmail");
}
  @Test
  public void TestD() {
	  Assert.assertEquals("Opera", "Opera");
  }
}