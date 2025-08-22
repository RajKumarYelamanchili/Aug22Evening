package parallel_execution;

import org.testng.annotations.Test;

public class TestClass2 {
	
	@Test
	public void testCase4() throws InterruptedException
	{
		System.out.println("TestClass2 testcase4:  " + Thread.currentThread().getId());
		Thread.sleep(2000);
	}
	@Test
	public void testCase5() throws InterruptedException
	{
		System.out.println("TestClass2 testcase5:  " + Thread.currentThread().getId());
		Thread.sleep(2000);
	}
	@Test
	public void testCase6() throws InterruptedException
	{
		System.out.println("TestClass2 testcase6:  " + Thread.currentThread().getId());
		Thread.sleep(2000);
	}
}
