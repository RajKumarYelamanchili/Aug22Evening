package yrk;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardSoft1 {
	
	
	  @Test
	  public void hardAssertTest() 
	  { 
		  System.out.println("Step 1");
	  Assert.assertEquals(1, 2); // Fails here 
	  System.out.println("Step 2"); 	  //	  Will NOT be executed 
	  }
	 
	 
	
	@Test
	public void softAssertTest() {
	    SoftAssert softAssert = new SoftAssert();
	    System.out.println("Step 1");
	    softAssert.assertEquals(1, 2); // Fails, but continues
	    System.out.println("Step 2");
	    softAssert.assertEquals("Hello", "Hi"); // Another failure
	    softAssert.assertAll(); // Reports all failures here
	}

}
