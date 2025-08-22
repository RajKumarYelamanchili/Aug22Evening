package exception_handling;

public class ArrayIndex1 {

	public static void main(String[] args) {
		try
		{
		String[]  arr= {"Dhoni","SRK","Akshay","Ajay"};
		
		for(int i=0;i<=4;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("hi");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("pls ensure the index of the array is less than 4");
		}
	}

}
