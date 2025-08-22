package july26_testng;

import org.testng.annotations.Test;

public class Prioritize {
	
	@Test(priority=3)
	public void c_method()
	{
		System.out.println("I am C method");
				
	}
	@Test(priority=2)
	public void d_method()
	{
		System.out.println("I am D method");
				
	}
	@Test(priority=5)
	public void a_method()
	{
		System.out.println("I am A method");
				
	}
	@Test(priority=-5)
	public void e_method()
	{
		System.out.println("I am E method");
				
	}
	@Test(priority=-4)
	public void b_method()
	{
		System.out.println("I am B method");
				
	}
	
	
	

}
