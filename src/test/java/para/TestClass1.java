package para;

import org.testng.annotations.Test;

public class TestClass1 
{
	@Test
	public void testCase1() throws InterruptedException
	{
		System.out.println("TestClass1 testcase1:  " + Thread.currentThread().getId());
		Thread.sleep(2000);
	}
	@Test
	public void testCase2() throws InterruptedException
	{
		System.out.println("TestClass1 testcase2:  " + Thread.currentThread().getId());
		Thread.sleep(2000);
	}
	@Test
	public void testCase3() throws InterruptedException
	{
		System.out.println("TestClass1 testcase3:  " + Thread.currentThread().getId());
		Thread.sleep(2000);
	}
	
	
}
