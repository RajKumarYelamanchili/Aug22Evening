package exception_handling;

public class WithTryCatch {

	public static void main(String[] args) {
		
		try
		{
		int x=100;
		int y=0;
		
		int z=x/y;
		}
		catch(ArithmeticException e)
		{
			System.out.println("pls ensure the denominator is never zero");
		}

	}

}
