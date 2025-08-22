package interview_programs;
public class EvenOddArray {
	public static void main(String[] args) {
		int arr[]= {23,12,56,71,88,9,6,99,2};
		System.out.println("Length of the array: " + arr.length);
		System.out.println("Odd Numbers");
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i]%2 !=0)
			{
				System.out.println(arr[i]);
			}
			
		}
		
		System.out.println("Even Numbers");
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i]%2 ==0)
			{
				System.out.println(arr[i]);
			}
			
		}	

	}

}
