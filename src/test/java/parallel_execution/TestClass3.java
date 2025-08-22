package parallel_execution;

import org.testng.annotations.Test;

public class TestClass3 {
	
	@Test
	public void testCase7() throws InterruptedException
	{
		System.out.println("TestClass3 testcase7:  " + Thread.currentThread().getId());
		Thread.sleep(2000);
	}
	@Test
	public void testCase8() throws InterruptedException
	{
		System.out.println("TestClass3 testcase8: " + Thread.currentThread().getId());
		Thread.sleep(2000);
	}
	@Test
	public void testCase9() throws InterruptedException
	{
		System.out.println("TestClass3 testcase9: " + Thread.currentThread().getId());
		Thread.sleep(2000);
	}	
}
