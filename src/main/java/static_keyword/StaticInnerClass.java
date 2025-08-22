package static_keyword;

public class StaticInnerClass 
{

	public static void main(String[] args) 
	{
		Test.abc();

	}
	
	static class Test
	{
		static void abc()
		{
			System.out.println("I am from abc method");
		}
	}

}
