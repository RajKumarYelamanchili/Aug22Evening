package interview_programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Pls enter the number which you want to find PRIME or not?");
	       int num    = sc.nextInt();//17
	       
	       int count=0;
	       
	   if (num >1)
	   {
		 for(int i=1;i<=num;i++)  
		 {
			 
			 if (num%i==0)
				 count++;
		 
			 
		 }
		   
		 
		 if (count==2)
		 {
			 System.out.println("PRIME");
		 }
		 else
		 {
			 System.out.println("NOT PRIME");
		 }
   
	   }
	       

	}//end of main

}//end of class
