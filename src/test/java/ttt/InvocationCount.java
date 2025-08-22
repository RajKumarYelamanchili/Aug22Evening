package ttt;

import org.testng.annotations.Test;

public class InvocationCount
{
@Test(invocationCount=5)
public void testMethod()
{
	System.out.println("execute this 5 times");
}
	
	
}
