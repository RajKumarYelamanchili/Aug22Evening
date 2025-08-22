package july26_testng;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipExecution {
		
	@Test
	public void test1()
	{
		System.out.println("this is test1");
	}
	
	
	@Test
	public void test2()
	{
		System.out.println("hi");
		throw new SkipException("skipping test case 2");
		
	}

	@Test(enabled=false)
	public void test3()
	{
		System.out.println("if you put enabled is false, it will not execute");
	}
}
