package july26_testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
	
	
	@Test
	public void test1()
	{
		System.out.println("Test case1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test case2");
	}
	@Test
	public void test3()
	{
		System.out.println("Test case3");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("this will execute before every test case");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("this will execute after every test case");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("this will execute before every CLASS");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("this will execute after every CLASS");
	}
}
