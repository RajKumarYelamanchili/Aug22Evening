package ttt;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnEx
{
@Test(dependsOnMethods= {"verifyLogin"})
public void verifyPayment()
{
	System.out.println("Payment");
	
}
	
@Test
public void verifyLogin()
{
	Assert.assertTrue(true);
	System.out.println("Login");
	
}	
	
	
}
