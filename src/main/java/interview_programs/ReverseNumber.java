package interview_programs;
import java.util.Scanner;
public class ReverseNumber {
	public static void main(String[] args) {
		//if you / by 10-->ignore the last digit 
		     //and take the remaining
		//if you % by 10-->take the last digit
		Scanner sc = new Scanner(System.in);
		System.out.println("Pls enter the number to reverse: ");
		     int num =  sc.nextInt();
		     int num1= num;
		     int rev =0;
		
		while(num !=0)
		{
		rev =  rev*10 + num%10;
			 num=  num/10;
		
		}
		System.out.println("after while loop , num is: " + num);//0
		
		System.out.println("Reverse of the number is : " + rev);
		
		if (num1==rev)
		{
		System.out.println("Palindrome");
		}
		else
		{
		System.out.println("NOT Palindrome");
		}

		
		

		     
		     
		     
		     
	}

}
