package strings;

public class NestedForLoop2 {

	public static void main(String[] args) {
		  for (int row = 1; row <= 2; row++) {             // Rows in classroom
	            for (int seat = 1; seat <= 3; seat++) {      // Seats in each row
	                System.out.print("Row " + row + " Seat " + seat + "  ");
	            }
	            System.out.println();                        // Next line after each row
	        } 
	}

}
