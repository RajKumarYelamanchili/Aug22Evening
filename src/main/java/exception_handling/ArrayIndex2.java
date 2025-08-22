package exception_handling;

public class ArrayIndex2 {

	public static void main(String[] args) {
		
		try
		{
		int a[] = new int[5];
		a[6]=8;
		System.out.println(a[6]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("pls ensure the index is less than 5");
		}

	}

}
