package listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ITestListenerClass.class})
public class TestClass {
	
	
	@Test
	public void testMethod1()
	{
		System.out.println("test case1");
	}
	
	@Test
	public void testMethod2()
	{
		System.out.println("test case2");
		Assert.assertTrue(true);
	}

	@Test(timeOut=3000)
	public void testMethod3() throws InterruptedException
	{
		System.out.println("test case3");
		//Thread.sleep(4000);
	}
	
	@Test(dependsOnMethods= {"testMethod1","testMethod2","testMethod3"})
	public void testMethod4()
	{
		System.out.println("test case4");
	}
	
}
