package operators;


public class LogicalOperators {

	public static void main(String[] args) {
		boolean a = true;
		boolean b=false;
		
		
		/*
		 * boolean c = a | b; System.out.println(c);//true
		 * 
		 * boolean d = a & b; System.out.println(d);//false
		 * 
		 * boolean f = !a; System.out.println(f);//false
		 */		 		 
		boolean g= (!a  &b ) | (a  & !b);
		System.out.println(g);

	}

}
