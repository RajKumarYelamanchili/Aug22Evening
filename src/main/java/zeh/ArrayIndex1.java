package zeh;

public class ArrayIndex1 {

	public static void main(String[] args) {
		try
		{
		String arr[]= {"Ravi","Rohit","Piyush","Gita"};
		System.out.println("length of the array: " + arr.length);
		for(int i=0;i<=4;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Hi");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("pls ensure the index is less than 4");
		}
	}

}
