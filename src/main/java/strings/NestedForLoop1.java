package strings;

public class NestedForLoop1 {
    public static void main(String[] args) {
	        for (int i = 1; i <= 5; i++) {           // Outer loop: multiplier
	            for (int j = 1; j <= 10; j++) {      // Inner loop: multiplicand
	                System.out.print(i * j + "\t");
	            }
	            System.out.println();                // New line after each row
	        }
	    }
	}


