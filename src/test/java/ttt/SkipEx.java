package ttt;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipEx
{
	@Test
	public void test1() {
		System.out.println("this is test1");
		
	}
	
	@Test
	public void test2() {
		System.out.println("this will be skipped");
		throw new SkipException("skipping test case2");
	
		
	}
	
	@Test(enabled=true)
	public void test3() {
		System.out.println("if enabled is false,it will skip");
		
	}

}
