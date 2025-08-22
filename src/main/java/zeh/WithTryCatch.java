package zeh;

public class WithTryCatch {

	public static void main(String[] args) {
		
	try
	{
		int x=10;
		int y=1;
		int z=x/y;
		
		System.out.println("value of z: " + z);
	}
	catch(ArithmeticException e)
	{
		System.out.println("Pls ensure denominator is not zero");
	}

	}

}
