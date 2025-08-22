package static_keyword;


		class Counter {
		     int count = 0;  // Shared by all objects

		    Counter() {
		        count++;
		        System.out.println(count);
		    }
		}

		public class StaticNumber {
		    public static void main(String[] args) {
		        new Counter(); // 1
		        new Counter(); // 2
		        new Counter(); // 3
		    }
		}
		

	

