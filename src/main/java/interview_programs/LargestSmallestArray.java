package interview_programs;
public class LargestSmallestArray {
	public static void main(String[] args) throws InterruptedException {
		int num[]= {24,18,66,12,78,9,81,6,94,1,99,45};
		System.out.println("length of array: " + num.length);
		
		         int smallest =num[0];
		         int largest  = num[0];
		         
		         for(int i=1;i<num.length;i++)
		         {
		        	if (num[i] < smallest) 
		        		smallest=  num[i];
		        
		        	if (num[i] > largest)
		        		largest  =   num[i];
		        	System.out.println("current smallest: " + smallest); 
		        	System.out.println("current largest: " + largest); 
		        	System.out.println("**********");
		        	Thread.sleep(2000);
		      	 
		         }
		         System.out.println("largest in the array: " + largest);
		         System.out.println("smallest in the array: " + smallest);

	}//end of main

}//end of class
