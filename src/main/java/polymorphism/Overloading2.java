package polymorphism;
//polymorphism with difference in the datatype of arguments
class DisplayOverloading2
{
	void display(char c)
	{
		System.out.println(c);
	}

	void display(int num)
	{
		System.out.println(num);
	}
	
}
public class Overloading2 {

	public static void main(String[] args) {
		
		DisplayOverloading2 obj = new DisplayOverloading2();
		   obj.display('j');
		   obj.display(340);
	}

}
