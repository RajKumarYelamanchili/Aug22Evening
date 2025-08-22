package july26_testng;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount=5)
	public void testMethod()
	{
		System.out.println("test case1");
	}

}
