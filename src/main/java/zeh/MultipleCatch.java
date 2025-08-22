package zeh;

public class MultipleCatch {

	public static void main(String[] args) {
		
		try
		{
		int arr[]= new int[5];
		arr[2]=10/1;
		System.out.println("hi");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("pls ensure the index is less than 5");
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("pls ensure the denominator is not zero");
		}
		catch(Exception e)
		{
			System.out.println("some exception occur");
		}
		finally
		{
			System.out.println("finally will get executed whether you get an exception or you do not get an exception ");
		}
	}

}
