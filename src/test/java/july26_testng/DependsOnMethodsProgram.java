package july26_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodsProgram {

	
	@Test(dependsOnMethods= {"verifyLogin"})
	public void verifyPayment()
	{
		System.out.println("PAYMENT");
	}
	
	
	
	@Test
	public void verifyLogin()
	{
		Assert.assertTrue(true);
		System.out.println("LOGIN");
	}
	
	
	
}
