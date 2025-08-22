package zeh;

public class ArrayIndex2 {

	public static void main(String[] args) {
		try
		{
		int arr[] = new int[5];
		arr[7] =8;
		System.out.println(arr[7]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("pls ensure the index is less than 5");
		}

	}

}
