package interview_programs;

public class SumOfArray {

	public static void main(String[] args) {
		int[] arr = {1,5,7,3,4};
		int sum=0;
		
		for(int num : arr)
		{
			sum  = sum + num;
		}
		System.out.println("sum of the array: " + sum);

	}

}
