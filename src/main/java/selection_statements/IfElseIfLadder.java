package selection_statements;

import java.util.Scanner;

public class IfElseIfLadder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in)	;
		System.out.println("Please enter the value of num: ");
		       int num =  sc.nextInt();
		       
		       if (num >0)
		       {
		    	   System.out.println("POSITIVE");
		       }
		       else if (num<0)
		       {
		    	   System.out.println("NEGATIVE");
		       }
		       else
		       {
		    	   System.out.println("ZERO");
			     
		       }

	}

}
